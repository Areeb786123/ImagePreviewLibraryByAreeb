package com.areeb.arimagepreviewlib

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.core.net.toUri
import com.airbnb.lottie.LottieAnimationView
import com.areeb.arimagepreviewlib.R.drawable.not_able_to_relocate
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target

@SuppressLint("CheckResult")
open class ImagePreview {
    companion object {
        fun setImageView(
            imageView: ImageView,
            imageUrl: String?,
            lotteAnimation: ProgressBar? = null,
        ) {
            imageView.let {
                lotteAnimation?.visibility = View.VISIBLE
                val imageUri = imageUrl?.toUri()?.buildUpon()?.scheme("https")?.build()
                Glide.with(imageView.context)
                    .load(imageUri)
                    .listener(object : RequestListener<Drawable> {
                        override fun onLoadFailed(
                            e: GlideException?,
                            model: Any?,
                            target: Target<Drawable>?,
                            isFirstResource: Boolean,
                        ): Boolean {
                            lotteAnimation?.visibility = View.VISIBLE
                            return true
                        }

                        override fun onResourceReady(
                            resource: Drawable?,
                            model: Any?,
                            target: Target<Drawable>?,
                            dataSource: DataSource?,
                            isFirstResource: Boolean,
                        ): Boolean {
                            lotteAnimation?.visibility = View.GONE
                            return false
                        }
                    })
                    .apply {
                        RequestOptions()
                            .error(not_able_to_relocate)
                    }
                    .into(imageView)
            }
        }
    }
}

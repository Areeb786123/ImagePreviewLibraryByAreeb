package com.areeb.imagepreviewlibrary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.areeb.arimagepreviewlib.ImagePreview
import com.areeb.imagepreviewlibrary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object {
        private val imageUrl = "https://i.dummyjson.com/data/products/8/3.jpg"
    }

    private var _binding: ActivityMainBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding!!.root)
        ImagePreview.setImageView(binding.imageName, imageUrl, binding.progress)
//        Glide.with(this).load(imageUrl).into(binding.imageName)
    }
}

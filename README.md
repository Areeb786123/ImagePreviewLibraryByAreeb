# ImagePreviewLibraryByAreeb
![Screenshot_20230805_151053](https://github.com/Areeb786123/ImagePreviewLibraryByAreeb/assets/56149022/02a030ac-6649-4de6-b0aa-d39c1ea6d993)



<h1>How to use it </h1>

<h2>Adding Paramters</h2>
<p>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding!!.root)
        ImagePreview.setImageView(binding.imageName, imageUrl, binding.progress)
    })</p>
<h2>Xml ui </h2>
<p><?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">


    <androidx.cardview.widget.CardView
        android:layout_width="match_parent"
        android:layout_height="200dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <ProgressBar
            android:id="@+id/progress"
            android:layout_width="match_parent"
            android:layout_height="40dp"
            android:layout_marginTop="40dp"

            />

        <ImageView
            android:id="@+id/imageName"
            android:layout_width="match_parent"
            android:layout_height="200dp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

    </androidx.cardview.widget.CardView>


</androidx.constraintlayout.widget.ConstraintLayout></p>


# ImagePreviewLibraryByAreeb



<h1><?xml version="1.0" encoding="utf-8"?>
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


</androidx.constraintlayout.widget.ConstraintLayout></h1>

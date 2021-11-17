package com.example.tp_layout

import android.graphics.Bitmap
import android.os.Bundle
import android.widget.ImageView

import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toBitmap


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bckView: ImageView = findViewById(R.id.bckgrnd)
        val bitmap: Bitmap = bckView.drawable.toBitmap()
    }

    override fun onStart() {
        super.onStart()

    }

    override fun onStop(){
        super.onStop()
    }
}
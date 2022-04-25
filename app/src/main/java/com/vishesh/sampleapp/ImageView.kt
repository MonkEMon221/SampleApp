package com.vishesh.sampleapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.uiLibrary.bobbleLibrary.BobbleImage
import com.uiLibrary.bobbleLibrary.BobbleImageButton
import com.vishesh.sampleapp.databinding.ActivityImageViewBinding

class ImageView : MainActivity() {
    private lateinit var binding: ActivityImageViewBinding
    private lateinit var image: BobbleImage
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
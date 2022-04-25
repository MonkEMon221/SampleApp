package com.vishesh.sampleapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.uiLibrary.bobbleLibrary.BobbleButton
import com.uiLibrary.bobbleLibrary.BobbleImageButton
import com.vishesh.sampleapp.databinding.ActivityImageButtonBinding

class ImageButton : MainActivity() {
    private lateinit var binding: ActivityImageButtonBinding
    private lateinit var imgButton: BobbleImageButton
    private lateinit var imgButton1: BobbleImageButton
    private lateinit var imgButton2: BobbleImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        imgButton = binding.image
        imgButton1 = binding.image1
        imgButton2 = binding.image2

        imgButton.setOnClickListener {
            Toast.makeText(this, "ImageButton Clicked", Toast.LENGTH_SHORT).show()
        }
        imgButton1.setOnClickListener {
            Toast.makeText(this, "ImageButton Clicked", Toast.LENGTH_SHORT).show()
        }
        imgButton2.setOnClickListener {
            Toast.makeText(this, "ImageButton Clicked", Toast.LENGTH_SHORT).show()
        }

        binding.switch1.setOnCheckedChangeListener { _, isChecked ->
            when(isChecked){
                false -> {
                    binding.image.isEnabled = false
                    binding.image1.isEnabled = false
                    binding.image2.isEnabled = false
                    binding.image4.isEnabled = false
                    binding.image5.isEnabled = false
                    binding.image6.isEnabled = false
                }
                true -> {
                    binding.image1.isEnabled = true
                    binding.image.isEnabled = true
                    binding.image2.isEnabled = true
                    binding.image4.isEnabled = true
                    binding.image5.isEnabled = true
                    binding.image6.isEnabled = true
                }
            }
        }
    }

}
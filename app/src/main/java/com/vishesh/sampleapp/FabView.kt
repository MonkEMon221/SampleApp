package com.vishesh.sampleapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import com.uiLibrary.bobbleLibrary.BobbleFab
import com.vishesh.sampleapp.databinding.ActivityFabViewBinding

class FabView : MainActivity() {
    private lateinit var binding: ActivityFabViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFabViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fab1.setOnClickListener {
            Toast.makeText(this,"Button In Clicked",Toast.LENGTH_SHORT).show()
        }

        binding.fab2.setOnClickListener {
            Toast.makeText(this,"Button In Clicked",Toast.LENGTH_SHORT).show()
        }

        binding.fab3.setOnClickListener {
            Toast.makeText(this,"Button In Clicked",Toast.LENGTH_SHORT).show()
        }

        binding.fab4.setOnClickListener {
            Toast.makeText(this,"Button In Clicked",Toast.LENGTH_SHORT).show()
        }
        binding.fab5.setOnClickListener {
            Toast.makeText(this,"Button In Clicked",Toast.LENGTH_SHORT).show()
        }

        binding.fab6.setOnClickListener {
            Toast.makeText(this,"Button In Clicked",Toast.LENGTH_SHORT).show()
        }

        binding.fab7.setOnClickListener {
            Toast.makeText(this,"Button In Clicked",Toast.LENGTH_SHORT).show()
        }

        binding.fab8.setOnClickListener {
            Toast.makeText(this,"Button In Clicked",Toast.LENGTH_SHORT).show()
        }
        binding.fab9.setOnClickListener {
            Toast.makeText(this,"Button In Clicked",Toast.LENGTH_SHORT).show()
        }

        binding.fab10.setOnClickListener {
            Toast.makeText(this,"Button In Clicked",Toast.LENGTH_SHORT).show()
        }



    }
}
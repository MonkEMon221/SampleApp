package com.vishesh.sampleapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import com.vishesh.sampleapp.databinding.ActivityRoundedEditTextBoxBinding

class RoundedEditTextBox : MainActivity() {
    private lateinit var binding: ActivityRoundedEditTextBoxBinding
    var start = 0
    var end = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoundedEditTextBoxBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.card.setOnClickListener {
            binding.edit.textBoxColor(Color.parseColor("#BDBDBD"))
            binding.edit.borderColor(Color.parseColor("#000000"))
        }
        binding.card1.setOnClickListener {
            binding.edit.textBoxColor(Color.parseColor("#BDBDBD"))
            binding.edit.borderColor(Color.parseColor("#FFFFFF"))
        }
        binding.reset.setOnClickListener {
            binding.edit.textBoxColor(Color.parseColor("#FFFFFF"))
            binding.edit.borderColor(Color.parseColor("#000000"))
        }
        binding.seek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                binding.edit.setRadius(p1.toFloat())
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    start = p0.progress
                }
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    end = p0.progress
                }
            }

        })

        binding.seeky.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                binding.edit.setBorderWidth(p1.toFloat())
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    start = p0.progress
                }
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    end = p0.progress
                }
            }

        })

    }
}
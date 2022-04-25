package com.vishesh.sampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import com.vishesh.sampleapp.databinding.ActivityCardViewBinding

class CardView : MainActivity() {
    private lateinit var binding: ActivityCardViewBinding
    var start = 0
    var end = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                binding.card.cardCornerRadius(p1.toFloat())
                binding.card2.cardCornerRadius(p1.toFloat())
                binding.card3.cardCornerRadius(p1.toFloat())
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
package com.vishesh.sampleapp

import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import com.uiLibrary.bobbleLibrary.BobbleButton
import com.vishesh.sampleapp.databinding.ActivityButtonViewBinding

class ButtonView : MainActivity() {
    private lateinit var binding: ActivityButtonViewBinding
    private lateinit var button: BobbleButton
    private lateinit var seekBar: SeekBar
    var startPoint = 0
    var endPoint = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityButtonViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        button = binding.button
        seekBar = binding.seek

        button.setOnClickListener {
            Toast.makeText(this, "Button In Clicked", Toast.LENGTH_SHORT).show()
        }
        binding.button1.setOnClickListener {
            Toast.makeText(this, "Button In Clicked", Toast.LENGTH_SHORT).show()
        }
        binding.button2.setOnClickListener {
            Toast.makeText(this, "Button In Clicked", Toast.LENGTH_SHORT).show()
        }
        binding.button3.setOnClickListener {
            Toast.makeText(this, "Button In Clicked", Toast.LENGTH_SHORT).show()
        }

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                button.cornerRadius = p1
                binding.button1.cornerRadius = p1
                binding.button2.cornerRadius = p1
                binding.button3.cornerRadius = p1
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    startPoint = p0.progress
                }
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    endPoint = p0.progress
                }
            }

        })
        binding.switch1.setOnCheckedChangeListener { _, isChecked ->
            when(isChecked){
                false -> {
                    binding.button.isEnabled = false
                    binding.button.setText(R.string.button1)
                    binding.button1.isEnabled = false
                    binding.button1.setText(R.string.button1)
                    binding.button2.isEnabled = false
                    binding.button2.setText(R.string.button1)
                    binding.button3.isEnabled = false
                    binding.button3.setText(R.string.button1)
                }
                true -> {
                    binding.button.isEnabled = true
                    binding.button.setText(R.string.button)
                    binding.button1.isEnabled = true
                    binding.button1.setText(R.string.button)
                    binding.button2.isEnabled = true
                    binding.button2.setText(R.string.button)
                    binding.button3.isEnabled = true
                    binding.button3.setText(R.string.button)
                }
            }
        }
    }
}
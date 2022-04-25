package com.vishesh.sampleapp

import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import com.google.android.material.tabs.TabLayoutMediator
import com.vishesh.sampleapp.databinding.ActivityTabLayoutBinding

class TabLayout : MainActivity() {
    private lateinit var binding: ActivityTabLayoutBinding
    private lateinit var adapter: FragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = FragmentAdapter(supportFragmentManager, lifecycle)
        binding.viewPager2.adapter = adapter
        binding.viewPager2.setOnClickListener { v ->
            val imm = getSystemService(INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.hideSoftInputFromWindow(v.windowToken, 0)
        }

        //Configuring tabs at different positions
        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Tab 1"
                }
                1 -> {
                    tab.text = "Tab 2"
                }
                2 -> {
                    tab.text = "Tab 3"
                }
            }
            binding.viewPager2.currentItem = 1
        }.attach()
        TabLayoutMediator(binding.tabLayout2, binding.viewPager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.setIcon(R.drawable.security)
                }
                1 -> {
                    tab.setIcon(R.drawable.segment)
                }
                2 -> {
                    tab.setIcon(R.drawable.schedule)
                }
            }
            binding.viewPager2.currentItem = 1
        }.attach()
        TabLayoutMediator(binding.tabLayout3, binding.viewPager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Tab 1"
                    tab.setIcon(R.drawable.security)
                }
                1 -> {
                    tab.text = "Tab 2"
                    tab.setIcon(R.drawable.segment)
                }
                2 -> {
                    tab.text = "Tab 3"
                    tab.setIcon(R.drawable.schedule)
                }
            }
            binding.viewPager2.currentItem = 1
        }.attach()
    }
}
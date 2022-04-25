package com.vishesh.sampleapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import kotlinx.coroutines.InternalCoroutinesApi

class FragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    @OptIn(InternalCoroutinesApi::class)
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                BlankFragment()
                BlankFragment()
                BlankFragment()
            }
            1 -> {
                BlankFragment()
                BlankFragment()
                BlankFragment()
            }
            2 -> {
                BlankFragment()
                BlankFragment()
                BlankFragment()
            }
            else -> {
                Fragment()
            }
        }
    }
}
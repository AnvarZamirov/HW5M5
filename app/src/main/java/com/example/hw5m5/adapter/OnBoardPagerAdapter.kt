package com.example.hw5m5.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hw5m5.R
import com.example.hw5m5.ui.fragments.onboard.OnBoardFragment
import com.example.hw5m5.ui.fragments.onboard.OnBoardPagingFragment
import com.example.hw5m5.ui.fragments.onboard.OnBoardPagingFragment.Companion.ARG_ONBOARD_POSITION

class OnBoardPagerAdapter(fragment: OnBoardFragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int) = OnBoardPagingFragment().apply {
        arguments = Bundle().apply {
            putInt(ARG_ONBOARD_POSITION, position)
        }
    }
}
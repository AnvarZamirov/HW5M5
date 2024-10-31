package com.example.hw5m5.ui.fragments.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.hw5m5.R
import com.example.hw5m5.adapter.OnBoardPagerAdapter
import com.example.hw5m5.databinding.FragmentOnBoardBinding

class OnBoardFragment : Fragment() {

    private val binding by lazy {
        FragmentOnBoardBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupListener()
        btnGetStarted()
    }

    private fun initialize() {
        binding.viewPager2.adapter = OnBoardPagerAdapter(this)
    }

    private fun setupListener() {
        binding.btnViewPagerStart.setOnClickListener {
            findNavController().navigate(R.id.registrationFragment)
        }
    }

    private fun btnGetStarted() = with(binding) {
        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> btnViewPagerStart.visibility = View.GONE
                    1 -> btnViewPagerStart.visibility = View.GONE
                    2 -> btnViewPagerStart.visibility = View.VISIBLE
                }
                super.onPageSelected(position)
            }
        })
    }
}
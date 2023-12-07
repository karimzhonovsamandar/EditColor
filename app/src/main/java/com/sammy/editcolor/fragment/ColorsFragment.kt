package com.sammy.editcolor.fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sammy.editcolor.ColorsData
import com.sammy.editcolor.R
import com.sammy.editcolor.databinding.FragmentColorsBinding

class ColorsFragment : Fragment() {

    private lateinit var binding: FragmentColorsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentColorsBinding.inflate(layoutInflater)

        binding.apply {
            firstBox.setOnClickListener {
                ColorsData.color = Color.parseColor("#E91E63")
            }
            secondBox.setOnClickListener {
                ColorsData.color = Color.parseColor("#F44336")
            }
            thirdBox.setOnClickListener {
                ColorsData.color = Color.parseColor("#3F51B5")
            }
            fourthBox.setOnClickListener {
                ColorsData.color = Color.parseColor("#8BC34A")
            }
            fiveBox.setOnClickListener {
                ColorsData.color = Color.parseColor("#03A9F4")
            }
            sixBox.setOnClickListener {
                ColorsData.color = Color.parseColor("#FFEB3B")
            }
            sevenBox.setOnClickListener {
                ColorsData.color = Color.parseColor("#009688")
            }
            eightBox.setOnClickListener {
                ColorsData.color = Color.parseColor("#FF9800")
            }
            nineBox.setOnClickListener {
                ColorsData.color = Color.parseColor("#673AB7")
            }
        }

        return binding.root
    }

}
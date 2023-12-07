package com.sammy.editcolor.fragment

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sammy.editcolor.ColorsData
import com.sammy.editcolor.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)

        val mainFragment = MainFragment()
        val colorsFragment = ColorsFragment()
        var fragmentManager = parentFragmentManager
        binding.fragLinear.setBackgroundColor(ColorsData.color)
        binding.editColorButton.setOnClickListener {
            fragmentManager.beginTransaction()
                .replace(com.sammy.editcolor.R.id.fragAddLayout,colorsFragment)
                .addToBackStack(null) // Добавляем в стек возврата, чтобы можно было вернуться к предыдущему фрагменту
                .commit()
        }

        return binding.root
    }


}
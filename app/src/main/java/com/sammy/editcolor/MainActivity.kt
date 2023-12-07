package com.sammy.editcolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sammy.editcolor.databinding.ActivityMainBinding
import com.sammy.editcolor.fragment.ColorsFragment
import com.sammy.editcolor.fragment.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val mainFragment = MainFragment()
        val fragmentManager = supportFragmentManager
        var transaction = fragmentManager.beginTransaction()
        transaction.add(R.id.fragAddLayout, mainFragment)
        transaction.commit()

    }
}
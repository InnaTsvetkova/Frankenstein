package com.example.frankenstein

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.frankenstein.databinding.ActivityMainBinding
import com.example.frankenstein.databinding.FramentMessageBinding

class MainActivity : AppCompatActivity(), ButtonFragment.OnButtonListener {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val navHostFragment by lazy {
        binding.navHostFragment.getFragment<NavHostFragment>()
    }

    override fun onButtonListener() {
        val fragmentManager=supportFragmentManager
        val messageFragment = fragmentManager.findFragmentById(R.id.messageFragment) as MessageFragment?
        messageFragment?.setMessage()
    }

    private val navController: NavController
        get() = navHostFragment.navController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bnv.setupWithNavController(navController)
    }
}
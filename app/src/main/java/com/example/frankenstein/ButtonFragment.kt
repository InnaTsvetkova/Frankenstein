package com.example.frankenstein

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.frankenstein.databinding.FragmentButtonBinding

class ButtonFragment: Fragment(), View.OnClickListener {
    private lateinit var binding: FragmentButtonBinding

    override fun onClick(p0: View?) {
        println("Hi")
    }

    interface OnButtonListener{
        fun onButtonListener()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentButtonBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener(this)
    }
}
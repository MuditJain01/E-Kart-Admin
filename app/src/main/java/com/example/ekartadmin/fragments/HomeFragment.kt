package com.example.ekartadmin.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ekartadmin.R
import com.example.ekartadmin.activities.AllOrdersActivity
import com.example.ekartadmin.databinding.FragmentHomeBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.btnAddCategory.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_category)
        }

        binding.btnAddProducts.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_productFragment)
        }

        binding.btnAddSlider.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_sliderFragment)
        }

        binding.btnAllOrderDetails.setOnClickListener {
            startActivity(Intent(requireContext(),AllOrdersActivity::class.java))
        }
        return binding.root
    }

}
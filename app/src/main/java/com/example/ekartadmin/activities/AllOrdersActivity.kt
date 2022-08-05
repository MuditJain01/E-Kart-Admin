package com.example.ekartadmin.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ekartadmin.databinding.ActivityAllOrdersBinding

class AllOrdersActivity : AppCompatActivity() {
    private lateinit var binding : ActivityAllOrdersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllOrdersBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
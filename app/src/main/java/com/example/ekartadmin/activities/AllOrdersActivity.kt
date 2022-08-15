package com.example.ekartadmin.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ekartadmin.adapter.AllOrderAdapter
import com.example.ekartadmin.databinding.ActivityAllOrdersBinding
import com.example.ekartadmin.model.AllOrderModel
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase

class AllOrdersActivity : AppCompatActivity() {
    private lateinit var binding : ActivityAllOrdersBinding
    private lateinit var list: ArrayList<AllOrderModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllOrdersBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list = ArrayList()

        Firebase.firestore.collection("allOrders").get()
            .addOnSuccessListener {
            list.clear()
            for(doc in it){
                val data = doc.toObject(AllOrderModel::class.java)
                list.add(data)
            }
            binding.rv.adapter = AllOrderAdapter(list,this)
        }
    }
}
package com.example.ekartadmin.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ekartadmin.databinding.ImageItemBinding

class AddProductAdapter(val list:ArrayList<Uri>): RecyclerView.Adapter<AddProductAdapter.AddProductImageViewHolder>(){

    inner class AddProductImageViewHolder(val binding: ImageItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddProductImageViewHolder {
        return AddProductImageViewHolder(ImageItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: AddProductImageViewHolder, position: Int) {
        holder.binding.itemImage.setImageURI(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
package com.example.email

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.email.databinding.ItemViewBinding

class Namadapter(val items: List<String>, val infor: List<String>) :
    RecyclerView.Adapter<Namadapter.MyViewHolder>() {
    class MyViewHolder(val binding: ItemViewBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Namadapter.MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemViewBinding.inflate(layoutInflater, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Namadapter.MyViewHolder, position: Int) {
        holder.binding.textName.text = items[position]
        holder.binding.textInformation.text = infor[position]
        holder.binding.root.setOnClickListener() {
            Toast.makeText(holder.binding.root.context, items[position], Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return items.size
        return infor.size
    }

}
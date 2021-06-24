package com.example.email

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.email.databinding.ActivityListBinding


class MainItems : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityListBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_list)

        fun onStart() {
            super.onStart()
            val list = listOf("moriaty", "holmes", "watson", "julius")
            val item = listOf("doan xem", "em chiu roi", "kho qua", "troi oi")
            binding.recyclerviewMain.adapter = Namadapter(list,item)
            binding.recyclerviewMain.layoutManager = LinearLayoutManager(this)
        }
    }
}
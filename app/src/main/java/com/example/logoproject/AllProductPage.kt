package com.example.logoproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.logoproject.databinding.ActivityAllProductPageBinding

class AllProductPage : AppCompatActivity() {
    private lateinit var binding:ActivityAllProductPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllProductPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.comCom.setOnClickListener {
            var intent = Intent(this,Comment::class.java)
            startActivity(intent)
        }

        binding.back.setOnClickListener {
            val intent = Intent(this,LegoRecycle::class.java)
            startActivity(intent)
        }








    }
}
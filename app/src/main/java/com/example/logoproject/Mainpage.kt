package com.example.logoproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.logoproject.databinding.ActivityMainpageBinding

class Mainpage : AppCompatActivity() {
    private lateinit var binding:ActivityMainpageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainpageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewAllProduct.setOnClickListener{
            val intent = Intent(this,LegoRecycle::class.java)
            startActivity(intent)
        }

        val user = intent.getStringExtra("user")
        val pass = intent.getStringExtra("pass")

        Toast.makeText(this,user,Toast.LENGTH_SHORT).show()
        Toast.makeText(this,pass,Toast.LENGTH_LONG).show()


    }
}
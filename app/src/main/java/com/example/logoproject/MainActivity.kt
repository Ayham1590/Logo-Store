package com.example.logoproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.logoproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.login.setOnClickListener {
            val intent = Intent(this,Mainpage::class.java)
            val user = binding.email.text.toString()
            val pass = binding.pass.text.toString()
            intent.putExtra("user",user)
            intent.putExtra("pass",pass)
            startActivity(intent)
        }


    }
}
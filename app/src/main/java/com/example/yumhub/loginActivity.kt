package com.example.yumhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yumhub.databinding.ActivityLoginBinding

class loginActivity : AppCompatActivity() {
    private val binding:ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.dthaveaccount.setOnClickListener{
            val intent = Intent(this,SignActivity::class.java)
            startActivity(intent)
        }
    }
}
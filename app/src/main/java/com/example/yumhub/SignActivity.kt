package com.example.yumhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yumhub.databinding.ActivityLoginBinding
import com.example.yumhub.databinding.ActivitySignBinding

class SignActivity : AppCompatActivity() {
    private val binding: ActivitySignBinding by lazy {
        ActivitySignBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.AlreadyAccount.setOnClickListener{
            val intent = Intent(this,loginActivity::class.java)
            startActivity(intent)
        }
    }
}
package com.example.yumhub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.yumhub.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

//class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        binding =ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        var NavController: NavController = findNavController(R.id.fragmentContainerView4)
//        var bottomnav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//        bottomnav.setupWithNavController(NavController)
//        binding.notificationButton.setOnClickListener{
//            val bottomSheetDialog = Notification_Bottom_Fragment()
//            bottomSheetDialog.show(supportFragmentManager,"Test")
//        }
//    }
//}
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Corrected: find NavController from the ViewBinding
        val navController: NavController = findNavController(R.id.fragmentContainerView4)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNav.setupWithNavController(navController)

        binding.notificationButton.setOnClickListener {
            val bottomSheetDialog = Notification_Bottom_Fragment()
            bottomSheetDialog.show(supportFragmentManager, "Test")
        }
    }
}

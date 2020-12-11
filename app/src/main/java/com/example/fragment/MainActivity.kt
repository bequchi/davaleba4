package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView : BottomNavigationItemView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fagment)

        val appConfig = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notification, R.id.navigation_history
        ))


            setupActionBarWithNavController(navController, appConfig)
            setupWithNavControler(navController)
        }

    private fun setupWithNavControler(navController: NavController) {


    }
}
}
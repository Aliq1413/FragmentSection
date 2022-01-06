package com.example.taskstimerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class CategoryActivity : AppCompatActivity() {
    private val navigasjonen = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.ic_section -> {
                return@OnNavigationItemSelectedListener false
            }
            R.id.ic_house -> {
                val intent1 = Intent(this@CategoryActivity, MainActivity::class.java)
                startActivity(intent1)
                return@OnNavigationItemSelectedListener true
            }
            R.id.ic_task -> {
                val intent2 = Intent(this@CategoryActivity, TasksActivity::class.java)
                startActivity(intent2)
                return@OnNavigationItemSelectedListener true
            }

        }
        false

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category2)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNavigation.setOnNavigationItemSelectedListener(navigasjonen)

    }


}
package com.example.taskstimerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.taskstimerapp.fragments.HomeFragment
import com.example.taskstimerapp.fragments.SectionFragment
import com.example.taskstimerapp.fragments.TasksFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private val homeFragment = HomeFragment()
    private val tasksFragment = TasksFragment()
    private val sectionFragment = SectionFragment()
    lateinit var bottomNav :BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(homeFragment)
        bottomNav = findViewById(R.id.bottom_nav)
        bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_house -> replaceFragment(homeFragment)
                R.id.ic_task -> replaceFragment(tasksFragment)
                R.id.ic_section -> replaceFragment(sectionFragment)

        }
        true
    }}
    private fun replaceFragment(fragment:Fragment){
        if(fragment != null){
            val  transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()
        }
    }
}
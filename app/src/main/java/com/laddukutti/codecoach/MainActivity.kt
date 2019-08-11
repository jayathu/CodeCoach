package com.laddukutti.codecoach

import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    private lateinit var selectedFragment: Fragment

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {

            R.id.navigation_home -> {

                Log.d("DEBUG-TEST", "Home Fragment")
                selectedFragment = HomeFragment()
                supportFragmentManager.beginTransaction().replace(R.id.frame_container, selectedFragment).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_calendar -> {

                Log.d("DEBUG-TEST", "Calendar Fragment")
                selectedFragment = CalendarFragment()
                supportFragmentManager.beginTransaction().replace(R.id.frame_container, selectedFragment).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_tracker -> {

                Log.d("DEBUG-TEST", "Tracker Fragment")
                selectedFragment = TrackerFragment()
                supportFragmentManager.beginTransaction().replace(R.id.frame_container, selectedFragment).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_questionbank -> {

                Log.d("DEBUG-TEST", "Question Bank Fragment")
                selectedFragment = QuestionBankFragment()
                supportFragmentManager.beginTransaction().replace(R.id.frame_container, selectedFragment).commit()
                return@OnNavigationItemSelectedListener true
            }
        }


        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolBar))

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        //textMessage = findViewById(R.id.message)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}

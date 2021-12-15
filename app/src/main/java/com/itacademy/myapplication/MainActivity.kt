package com.itacademy.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.itacademy.myapplication.Fragments.CategoryFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .add(R.id.container, CategoryFragment())
            .commit()
    }
}
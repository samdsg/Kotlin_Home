package com.example.kotlinrental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ScrollView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide();
        setContentView(R.layout.activity_main)
    }
}

package com.hilt.hiltmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.hilt.hiltmvvm.R

class MainActivity : AppCompatActivity() {
    private val products: TextView
    get() = findViewById(R.id.products)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}




















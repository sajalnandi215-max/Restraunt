package com.example.multyscreen

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_oeder)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val orderText = findViewById<TextView>(R.id.orderTextView)

        // ✅ Receive data
        val menuItem = intent.getStringExtra(MainActivity5.KEY)
        val menuItemNonVeg = intent.getStringExtra(MainActivity6.KEY)
        val menuItemVeg = intent.getStringExtra(MainActivity7.KEY)
        val menuItemstarter = intent.getStringExtra(MainActivity3.KEY)

// Show the first non-null value
        orderText.text = menuItem ?: menuItemNonVeg ?: menuItemVeg ?: menuItemstarter ?: "No item selected"

    }
}

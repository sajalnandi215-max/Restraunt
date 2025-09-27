package com.example.multyscreen

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity5 : AppCompatActivity() {

    companion object {
        const val KEY = "menuItem"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // ✅ Find your card views
        val gulabJamun = findViewById<CardView>(R.id.gulabjamun)
        val rasgulla = findViewById<CardView>(R.id.rasgulla)
        val rasMalai = findViewById<CardView>(R.id.rashmallai)
        val chocoLava = findViewById<CardView>(R.id.chockletlava)

        // ✅ Set click listeners for each card
        gulabJamun.setOnClickListener {
            openOrderActivity("Gulab Jamun : Price = 120 Rs.")
        }

        rasgulla.setOnClickListener {
            openOrderActivity("Rasgulla : Price = 100 Rs.")
        }

        rasMalai.setOnClickListener {
            openOrderActivity("Ras Malai : Price = 150 Rs.")
        }

        chocoLava.setOnClickListener {
            openOrderActivity("Chocolate Lava Cake : Price = 180 Rs.")
        }
    }

    // ✅ Common function to open OrderActivity
    private fun openOrderActivity(itemInfo: String) {
        val intent = Intent(this, OrderActivity::class.java)
        intent.putExtra(KEY, itemInfo)
        startActivity(intent)
    }
}

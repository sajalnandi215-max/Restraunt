package com.example.multyscreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity3 : AppCompatActivity() {

    companion object {
        const val KEY = "menuNamestarter" // Same key for all activities
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        // CardViews
        val tomatoSoup = findViewById<CardView>(R.id.tomatosoup)
        val creamMushroom = findViewById<CardView>(R.id.cremmushroom)
        val paneerTikka = findViewById<CardView>(R.id.paneertikka)
        val chickenTikka = findViewById<CardView>(R.id.chickentikka)
        val goldenPrawn = findViewById<CardView>(R.id.goldenprawn)
        val crispiVegSpringRoll = findViewById<CardView>(R.id.crispivegspringroll)

        // Set click listeners with dish name + price
        tomatoSoup.setOnClickListener { sendOrder("Tomato Soup : Price = 120 Rs") }
        creamMushroom.setOnClickListener { sendOrder("Cream of Mushroom Soup : Price = 140 Rs") }
        paneerTikka.setOnClickListener { sendOrder("Paneer Tikka : Price = 180 Rs") }
        chickenTikka.setOnClickListener { sendOrder("Chicken Tikka : Price = 220 Rs") }
        goldenPrawn.setOnClickListener { sendOrder("Golden Prawn : Price = 250 Rs") }
        crispiVegSpringRoll.setOnClickListener { sendOrder("Crispi Veg Spring Roll : Price = 160 Rs") }
    }

    // Helper function to start OrderActivity
    private fun sendOrder(item: String) {
        val intent = Intent(this, OrderActivity::class.java)
        intent.putExtra(KEY, item) // pass dish details
        startActivity(intent)
    }
}


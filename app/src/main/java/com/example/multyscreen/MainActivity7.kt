package com.example.multyscreen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity7 : AppCompatActivity() {

    companion object {
        const val KEY = "menuNameveg" // Key to send data via Intent
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7) // make sure this XML exists

        // EditText + Button for custom order
//        val vegText = findViewById<EditText>(R.id.vegtext)
//        val buttonVeg = findViewById<Button>(R.id.buttonveg)
//
//        buttonVeg.setOnClickListener {
//            val customOrder = vegText.text.toString()
//            sendOrder(customOrder)
//        }

        // CardViews
        val paneerButterMasala = findViewById<CardView>(R.id.paneerbuttermasala)
        val malaiKofta = findViewById<CardView>(R.id.malaikofta)
        val dalMakhni = findViewById<CardView>(R.id.dalmakhni)
        val vegBiryani = findViewById<CardView>(R.id.vegbiryani)
        val stuffedCapsicum = findViewById<CardView>(R.id.stuffedcapsiicum)
        val alooGobhi = findViewById<CardView>(R.id.allugobhi)
        val paneerTikkaMasala = findViewById<CardView>(R.id.paneertikkamasala)

        // Set click listeners with name + price
        paneerButterMasala.setOnClickListener { sendOrder("Paneer Butter Masala : Price = 180 Rs") }
        malaiKofta.setOnClickListener { sendOrder("Malai Kofta : Price = 200 Rs") }
        dalMakhni.setOnClickListener { sendOrder("Dal Makhni : Price = 150 Rs") }
        vegBiryani.setOnClickListener { sendOrder("Vegetable Biryani : Price = 170 Rs") }
        stuffedCapsicum.setOnClickListener { sendOrder("Stuffed Capsicum : Price = 160 Rs") }
        alooGobhi.setOnClickListener { sendOrder("Aloo Gobhi : Price = 140 Rs") }
        paneerTikkaMasala.setOnClickListener { sendOrder("Paneer Tikka Masala : Price = 190 Rs") }
    }

    // Helper function to start OrderActivity
    private fun sendOrder(item: String) {
        val intent = Intent(this, OrderActivity::class.java)
        intent.putExtra(KEY, item)
        startActivity(intent)
    }
}

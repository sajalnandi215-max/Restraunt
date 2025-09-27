package com.example.multyscreen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity6 : AppCompatActivity() {

    companion object {
        const val KEY = "menuItemnonveg"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main6)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // ✅ EditText + Button order
//        val nonvegText = findViewById<EditText>(R.id.nonvegtext)
//        val buttonNonVeg = findViewById<Button>(R.id.buttonnonveg)
//
//        buttonNonVeg.setOnClickListener {
//            val customMessage = nonvegText.text.toString()
//            openOrderActivity(customMessage)
//        }

        // ✅ CardViews
        val butterChicken = findViewById<CardView>(R.id.buttercchicken)
        val chickenBiryani = findViewById<CardView>(R.id.chickenbyryani)
        val muttonRogan = findViewById<CardView>(R.id.muttonrogan)
        val chickenKorma = findViewById<CardView>(R.id.chickenkorma)
        val prawnMasala = findViewById<CardView>(R.id.prawnmasala)
        val fishCurry = findViewById<CardView>(R.id.fishcurry)
        val chickenTikka = findViewById<CardView>(R.id.chickentikkamasala)

        // ✅ Set click listeners for each
        butterChicken.setOnClickListener { openOrderActivity("Butter Chicken : Price = 250 Rs.") }
        chickenBiryani.setOnClickListener { openOrderActivity("Chicken Biryani : Price = 220 Rs.") }
        muttonRogan.setOnClickListener { openOrderActivity("Mutton Rogan Josh : Price = 300 Rs.") }
        chickenKorma.setOnClickListener { openOrderActivity("Chicken Korma : Price = 200 Rs.") }
        prawnMasala.setOnClickListener { openOrderActivity("Prawn Masala : Price = 280 Rs.") }
        fishCurry.setOnClickListener { openOrderActivity("Fish Curry : Price = 240 Rs.") }
        chickenTikka.setOnClickListener { openOrderActivity("Chicken Tikka Masala : Price = 260 Rs.") }
    }

    // ✅ Common function
    private fun openOrderActivity(itemInfo: String) {
        val intent = Intent(this, OrderActivity::class.java)
        intent.putExtra(KEY, itemInfo)
        startActivity(intent)
    }
}

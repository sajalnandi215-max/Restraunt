package com.example.multyscreen

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val front1=findViewById<CardView>(R.id.nonvage)
        front1.setOnClickListener{
            val i = Intent(this, MainActivity6::class.java)
            startActivity(i)
        }
        val front2=findViewById<CardView>(R.id.vage)
        front2.setOnClickListener{
            val i = Intent(this, MainActivity7::class.java)
            startActivity(i)
        }
        val front3=findViewById<CardView>(R.id.special)
        front3.setOnClickListener{
            val i = Intent(this, MainActivity8::class.java)
            startActivity(i)
        }
    }
}
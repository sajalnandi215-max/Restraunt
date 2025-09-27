package com.example.multyscreen

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val front1=findViewById<CardView>(R.id.starter)
        front1.setOnClickListener{
            val i = Intent(this, MainActivity3::class.java)
            startActivity(i)
        }
        val front2=findViewById<CardView>(R.id.maincourse)
        front2.setOnClickListener{
            val j = Intent(this, MainActivity4::class.java)
            startActivity(j)
        }
        val front3=findViewById<CardView>(R.id.dessert)
        front3.setOnClickListener{
            val k = Intent(this, MainActivity5::class.java)
            startActivity(k)
        }
    }
}
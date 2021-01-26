package com.example.kotlinproject.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinproject.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            startActivity(Intent(this@MainActivity, BmiAcivitiy::class.java))
        }

        button2.setOnClickListener {
            startActivity(Intent(this@MainActivity, CountActivity::class.java))
        }

        button4.setOnClickListener {
            startActivity(Intent(this@MainActivity, ControlActivity::class.java))
        }




    }




}
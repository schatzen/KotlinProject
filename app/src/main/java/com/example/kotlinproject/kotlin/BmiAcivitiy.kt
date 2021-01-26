package com.example.kotlinproject.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinproject.R
import kotlinx.android.synthetic.main.layout_view_binding.*

class BmiAcivitiy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding)

        checkButton.setOnClickListener {

            val tall = tallField.text.toString().toDouble();
            val weight = weightField.text.toString().toDouble();

            val bmi = weight / Math.pow(tall/100,2.0)

            resultLabel.text = "키: ${tallField.text}, 체중: ${weightField.text}, BMI: $bmi"

        }


    }
}
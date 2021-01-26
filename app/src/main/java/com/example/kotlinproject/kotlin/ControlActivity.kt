package com.example.kotlinproject.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlinproject.R
import kotlinx.android.synthetic.main.layout_control_view.*

class ControlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_control_view)

        controlButton.setOnClickListener {
            val number = numberLabel.text.toString().toInt()

            if (number % 2 == 0) {
                Toast.makeText(applicationContext,"${number}는 2의 배수 입니다.", Toast.LENGTH_LONG).show()
            } else if ( number % 3 == 0) {
                Toast.makeText(applicationContext, "${number} 는 3의 배수 입니다.", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "${number}", Toast.LENGTH_LONG).show()
            }

            // 코틀린에서는 switch / if 문을 대체해 when을 사용할 수 있다.
            when (number) {
                4 -> controlButton.text = " 실행 -4"
                9 -> controlButton.text = " 실행 -9"
                else -> controlButton.text = "실행"
            }

        }



    }
}
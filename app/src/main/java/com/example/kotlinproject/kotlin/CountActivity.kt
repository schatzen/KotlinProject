package com.example.kotlinproject.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinproject.R
import kotlinx.android.synthetic.main.layout_count_view.*
import java.text.SimpleDateFormat
import java.util.*

class CountActivity : AppCompatActivity() {

    var clickCount = 0
    val startTime = System.currentTimeMillis()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_count_view)

        val timeText = SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime)
        startTimeLabel.text = "Activity 시작 시간 : ${timeText}"

        clickCountLabel.text = "버튼이 클릭된 횟수 : ${clickCount}"

        countButton.setOnClickListener {
            clickCount = clickCount + 1

            //UI에 클릭된 횟수 다시 보여줌
            clickCountLabel.text = "버튼이 클릭된 횟수 : ${clickCount}"
        }


    }
}
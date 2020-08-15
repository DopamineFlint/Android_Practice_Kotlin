package com.example.android_practice_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var isTrue: Boolean = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawView.init()

        if (isTrue) {
            drawView.setBoolToFalse()
        }

        buttonUp.setOnClickListener { drawView.angle = 1 }
        buttonDown.setOnClickListener { drawView.angle = 2 }
        buttonLeft.setOnClickListener { drawView.angle = 3 }
        buttonRight.setOnClickListener { drawView.angle = 4 }
        button.setOnClickListener { drawView.angle = 0 }
        buttonColor.setOnClickListener { drawView.changeColor() }
        buttonFigure.setOnClickListener { drawView.changeFigure() }
    }

    override fun onDestroy() {
        super.onDestroy()
        isTrue = true
    }
}
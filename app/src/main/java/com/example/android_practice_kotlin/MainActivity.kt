package com.example.android_practice_kotlin

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button //lateinit
    private lateinit var buttonLeft: Button
    private lateinit var buttonRight: Button
    private lateinit var buttonUp: Button
    private lateinit var buttonDown: Button
    private lateinit var buttonFigure: Button
    private lateinit var buttonColor: Button
    private lateinit var dv: DrawView
    private var isTrue: Boolean = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        buttonRight = findViewById(R.id.buttonRight)
        buttonLeft = findViewById(R.id.buttonLeft)
        buttonUp = findViewById(R.id.buttonUp)
        buttonDown = findViewById(R.id.buttonDown)
        buttonFigure = findViewById(R.id.buttonFigure)
        buttonColor = findViewById(R.id.buttonColor)
        dv = findViewById(R.id.drawView)
        dv.init()

        if (isTrue) {
            dv.setBoolToFalse()
        }

        buttonUp.setOnClickListener { dv.angle = 1 }
        buttonDown.setOnClickListener { dv.angle = 2 }
        buttonLeft.setOnClickListener { dv.angle = 3 }
        buttonRight.setOnClickListener { dv.angle = 4 }
        button.setOnClickListener { dv.angle = 0 }
        buttonColor.setOnClickListener { dv.changeColor() }
        buttonFigure.setOnClickListener { dv.changeFigure() }
    }

    override fun onDestroy() {
        super.onDestroy()
        isTrue = true
    }
}
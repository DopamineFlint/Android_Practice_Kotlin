package com.example.android_practice_kotlin.models

import android.graphics.Canvas
import android.graphics.Color
import android.os.Build
import androidx.annotation.RequiresApi

class Ellipse(point: Point, rad: Float = 1f, rad2: Float = 2f): Circle(point), ColorChangeable {
    var radius2: Float = rad2
    set(value) {
        field = value
    }

    override fun changeColor(color: Int) {
        if (color == 1) {
            paint.setColor(Color.BLUE)
        }

        if (color == 2) {
            paint.setColor(Color.BLACK)
        }

        if (color == 3) {
            paint.setColor(Color.GREEN)
        }

        if (color == 4) {
            paint.setColor(Color.RED)
        }
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun draw(canvas: Canvas) {
        canvas.drawOval(point.xAxis, point.yAxis, point.xAxis + radius2*2, point.yAxis + radius2*2, paint)
    }
}
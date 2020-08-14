package com.example.android_practice_kotlin.models

import android.graphics.Canvas
import android.graphics.Color
import android.os.Build
import androidx.annotation.RequiresApi

class Ellipse(point: Point, rad: Float = 1f, rad2: Float = 2f): Circle(point), ColorChangeable {
    private var radius2: Float = rad2

    override fun changeColor(color: Int) {
        if (color == 1) {
            paint.color = Color.BLUE
        }

        if (color == 2) {
            paint.color = Color.BLACK
        }

        if (color == 3) {
            paint.color = Color.GREEN
        }

        if (color == 4) {
            paint.color = Color.RED
        }
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun draw(canvas: Canvas) {
        canvas.drawOval(
            point.xAxis,
            point.yAxis,
            point.xAxis + radius2*2,
            point.yAxis + radius2*2,
            paint)
    }
}
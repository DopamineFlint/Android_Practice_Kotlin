package com.example.android_practice_kotlin.models

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

open class Square(point: Point, var edgeSize: Float = 100f): Figure(point), ColorChangeable {
    var paint: Paint = Paint()

    override fun draw(canvas: Canvas) {
        canvas.drawRect(
            point.xAxis,
            point.yAxis,
            point.xAxis + edgeSize,
            point.yAxis + edgeSize, paint)
    }

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
}
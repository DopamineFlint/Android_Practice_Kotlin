package com.example.android_practice_kotlin.models

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

open class Square(point: Point, edgeSize: Float): Figure(point), ColorChangeable {
    var paint: Paint = Paint()
    var edgeSize: Float = 100f
    set(value) {
        field = value
    }

    override fun draw(canvas: Canvas) {
        canvas.drawRect(
            point.xAxis,
            point.yAxis,
            point.xAxis + edgeSize,
            point.yAxis + edgeSize, paint)
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
}
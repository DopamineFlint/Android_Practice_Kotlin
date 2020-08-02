package com.example.android_practice_kotlin.models

import android.graphics.Canvas
import android.graphics.Color

class Rectangle (point: Point, width: Float, height: Float): Square(point, width) {
    var height: Float = 100f
    set(value) {
        field = value
    }

    override fun draw(canvas: Canvas) {
        canvas.drawRect(point.xAxis,
            point.yAxis,
            point.xAxis + edgeSize,
            point.yAxis + height,
            paint)
    }

    override fun changeColor(color: Int) {
        if (color == 1) {
            paint.setColor(Color.BLUE);
        }

        if (color == 2) {
            paint.setColor(Color.BLACK);
        }

        if (color == 3) {
            paint.setColor(Color.GREEN);
        }

        if (color == 4) {
            paint.setColor(Color.RED);
        }
    }
}
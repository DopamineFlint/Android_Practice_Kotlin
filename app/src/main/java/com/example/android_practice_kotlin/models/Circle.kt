package com.example.android_practice_kotlin.models

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

open class Circle(point: Point, rad: Float = 1f): Figure(point) {
    var paint: Paint = Paint()
    var radius: Float = rad
    set(value) {
        field = value
    }

    override fun draw(canvas: Canvas) {
        paint.setColor(Color.BLUE)
        canvas.drawCircle(point.xAxis, point.yAxis, radius, paint)
    }
}
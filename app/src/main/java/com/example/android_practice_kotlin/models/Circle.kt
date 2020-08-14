package com.example.android_practice_kotlin.models

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

open class Circle(point: Point, var rad: Float = 1f): Figure(point) {
    var paint: Paint = Paint()

    override fun draw(canvas: Canvas) {
        paint.color = Color.BLUE
        canvas.drawCircle(point.xAxis, point.yAxis, rad, paint)
    }
}
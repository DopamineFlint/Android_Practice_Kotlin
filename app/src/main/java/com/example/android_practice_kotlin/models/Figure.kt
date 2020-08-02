package com.example.android_practice_kotlin.models

import android.graphics.Canvas

abstract class Figure(var point: Point) {

    abstract fun draw(canvas: Canvas)

    fun moveTo(x: Float, y: Float) {
        point.xAxis = x
        point.yAxis = y
    }
}
package com.example.android_practice_kotlin

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Build
import android.util.AttributeSet
import android.view.View
import androidx.annotation.RequiresApi
import com.example.android_practice_kotlin.models.*

class DrawView : View {
    private var p: Paint

    init {
        p = Paint()
    }

    private var xx: Float = 300f
    private var yy: Float = 300f
    private var rad: Float = 100f
    private var ovalX: Float = 60f
    private var ovalY: Float = 60f

    private var figure: Int = 1
    var color: Int = 1
    var angle: Int = 0
        set(value) {
            field = value
            isTrue = true
        }
    private var isTrue: Boolean = true

    private var circle: Circle = Circle(Point(xx, yy), rad)
    private var square: Square = Square(Point(xx, yy), 20f)
    private var rectangle: Rectangle = Rectangle(Point(xx, yy), 100f, 150f)
    private var ellipse: Ellipse = Ellipse(Point(xx, yy), 100f, 150f)

    constructor(context: Context) : super(context)

    constructor(context: Context?, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context?, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    fun init() {
        p = Paint()

        Thread(Runnable {
                run {
                    while (isTrue) {
                        try {
                            if (angle == 1) { //going up
                                Thread.sleep(10)
                                yy--
                                postInvalidate()
                            }
                            if (angle == 2) { //going down
                                Thread.sleep(10)
                                yy++
                                postInvalidate()
                            }
                            if (angle == 3) { //going left
                                Thread.sleep(10)
                                xx--
                                postInvalidate()
                            }
                            if (angle == 4) { //going right
                                Thread.sleep(10)
                                xx++
                                postInvalidate()
                            }

                            if (angle == 1 && figure == 2) {
                                Thread.sleep(10)
                                yy--
                                ovalY--
                                postInvalidate()
                            }
                            if (angle == 2 && figure == 2) {
                                Thread.sleep(10)
                                yy++
                                ovalY++
                                postInvalidate()
                            }
                            if (angle == 3 && figure == 2) {
                                Thread.sleep(10)
                                xx--
                                ovalX--
                                postInvalidate()
                            }
                            if (angle == 4 && figure == 2) {
                                Thread.sleep(10)
                                xx++
                                ovalX++
                                postInvalidate()
                            }

                            if (angle == 4 && figure == 3) {
                                Thread.sleep(10)
                                circle.moveTo(xx++, yy)
                                postInvalidate()
                            }
                            if (angle == 3 && figure == 3) {
                                Thread.sleep(10)
                                circle.moveTo(xx--, yy)
                                postInvalidate()
                            }
                            if (angle == 2 && figure == 3) {
                                Thread.sleep(10)
                                circle.moveTo(xx, yy++)
                                postInvalidate()
                            }
                            if (angle == 1 && figure == 3) {
                                Thread.sleep(10)
                                circle.moveTo(xx, yy--)
                                postInvalidate()
                            }

                            if (angle == 1 && figure == 4) { //4
                                Thread.sleep(10)
                                square.moveTo(xx, yy--)
                                postInvalidate()
                            }
                            if (angle == 2 && figure == 4) {
                                Thread.sleep(10)
                                square.moveTo(xx, yy++)
                                postInvalidate()
                            }
                            if (angle == 3 && figure == 4) {
                                Thread.sleep(10)
                                square.moveTo(xx--, yy)
                                postInvalidate()
                            }
                            if (angle == 4 && figure == 4) {
                                Thread.sleep(10)
                                square.moveTo(xx++, yy)
                                postInvalidate()
                            }

                            if (angle == 1 && figure == 5) { //4
                                Thread.sleep(10)
                                ellipse.moveTo(xx, yy--)
                                postInvalidate()
                            }
                            if (angle == 2 && figure == 5) {
                                Thread.sleep(10)
                                ellipse.moveTo(xx, yy++)
                                postInvalidate()
                            }
                            if (angle == 3 && figure == 5) {
                                Thread.sleep(10)
                                ellipse.moveTo(xx--, yy)
                                postInvalidate()
                            }
                            if (angle == 4 && figure == 5) {
                                Thread.sleep(10)
                                ellipse.moveTo(xx++, yy)
                                postInvalidate()
                            }

                            if (angle == 1 && figure == 6) { //4
                                Thread.sleep(10)
                                rectangle.moveTo(xx, yy--)
                                postInvalidate()
                            }
                            if (angle == 2 && figure == 6) { //4
                                Thread.sleep(10)
                                rectangle.moveTo(xx, yy++)
                                postInvalidate()
                            }
                            if (angle == 3 && figure == 6) { //4
                                Thread.sleep(10)
                                rectangle.moveTo(xx--, yy)
                                postInvalidate()
                            }
                            if (angle == 4 && figure == 6) { //4
                                Thread.sleep(10)
                                rectangle.moveTo(xx++, yy)
                                postInvalidate()
                            }

                            if (angle == 0) {
                                Thread.sleep(10)
                                postInvalidate()
                            }
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }
                }
            }
        ).start()
    }

    fun changeFigure() {
        if (figure < 6) {
            figure++
        } else {
            figure = 1
        }
    }

    fun changeColor() {
        if (color < 3) {
            color++
        } else {
            color = 1
        }
    }

    fun setBoolToFalse() {
        isTrue = false
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val width: Int = widthMeasureSpec
        val height: Int = heightMeasureSpec
        super.onMeasure(width, height)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onDraw(canvas: Canvas) {

        if (figure == 1) {
            p.let { canvas.drawCircle(xx, yy, rad, it) }
        }
        if (figure == 2) {
            p.let { canvas.drawOval(xx, yy, ovalX * 2, ovalY * 2, it) }
        }
        if (figure == 3) {
            circle.draw(canvas)
        }
        if (figure == 4) {
            square.draw(canvas)
        }
        if (figure == 5) {
            ellipse.draw(canvas)
        }
        if (figure == 6) {
            rectangle.draw(canvas)
        }

        square.changeColor(color)
        ellipse.changeColor(color)
        rectangle.changeColor(color)
    }
}
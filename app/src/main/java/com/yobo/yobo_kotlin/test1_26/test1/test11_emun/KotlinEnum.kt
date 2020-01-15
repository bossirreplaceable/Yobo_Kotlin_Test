package com.yobo.yobo_kotlin.test1_26.test1.test11_emun

import android.view.View
import java.util.*

/**
 * Created by ZhangBoshi
 * on 2019-12-15
 */

enum class KotlinEnum {
    BOY_1,
    BOY_2,
    BOY_3,
    BOY_4,
    BOY_5
}

enum class Color(var color: Int) {
    RED(0xFF0000),
    WHITE(0xFFFFFF),
    BLACK(0x000000),
    GREEN(0x00FF00)
}

fun guessBoy(boy: KotlinEnum) = when (boy) {

    KotlinEnum.BOY_1 -> {

        println("i am boy1")
    }
    KotlinEnum.BOY_2 -> {
        println("i am boy2")

    }
    KotlinEnum.BOY_3 -> {
        println("i am boy3")

    }
    KotlinEnum.BOY_4 -> {
        println("i am boy4")

    }
    KotlinEnum.BOY_5 -> {
        println("i am boy5")

    }

}


fun main() {
    println("KotlinEnum.BOY_1=" + KotlinEnum.BOY_1)
    println("KotlinEnum.BOY_2.name=" + KotlinEnum.BOY_2.name)
    println("KotlinEnum.BOY_3.ordinal=" + KotlinEnum.BOY_3.ordinal)
    println("KotlinEnum.BOY_4.compareTo(KotlinEnum.BOY_5)=" + KotlinEnum.BOY_4.compareTo(KotlinEnum.BOY_5))
    println("Color.RED.color=" + Color.RED.color)
    println("KotlinEnum.valueOf(\"BOY_1\")=" + KotlinEnum.valueOf("BOY_1"))
    println("Arrays.toString(KotlinEnum.values())=" + Arrays.toString(KotlinEnum.values()))


    guessBoy(KotlinEnum.BOY_5)



    viewMove(null, ViewSealed.UP)

}


sealed class ViewSealed {
    object UP : ViewSealed()
    object DOWN : ViewSealed()
    object RIGHT : ViewSealed()
    object LEFT : ViewSealed()
    class spin(angle: Int) : ViewSealed()
}

fun viewMoveToDown() {
    println("view 向下移动")
}

fun viewMove(view: View?, viewSealed: ViewSealed) = when (viewSealed) {

    ViewSealed.UP -> {
        println("view 向上移动")
    }
    ViewSealed.DOWN -> viewMoveToDown()
    ViewSealed.LEFT -> {
        println("view 向左移动")

    }

    ViewSealed.RIGHT -> {
        println("view 向右移动")

    }
    is ViewSealed.spin -> {

    }
}
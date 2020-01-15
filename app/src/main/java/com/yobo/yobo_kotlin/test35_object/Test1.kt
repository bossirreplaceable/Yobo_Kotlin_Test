package com.yobo.yobo_kotlin.test35_object

/**
 * Created by ZhangBoshi
 * on 2019-12-30
 */

interface Test1 {
    fun canPrint()
}


fun main() {

    val o1 = object : Test1 {
        override fun canPrint() {
            println("我是接口的实现类")
        }
    }
    val testA = setListener(o1)
    val testB = setListener(o1)
    println(testA === testB)

}

fun setListener(listener: Test1): Test1 {
    listener.canPrint()
    return listener
}
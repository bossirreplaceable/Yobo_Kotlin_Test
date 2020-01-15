package com.yobo.yobo_kotlin.test1_26.test1.test16_YunSuanFu

/**
 * Created by ZhangBoshi
 * on 2019-12-17
 */


class TestMain {

    fun testA() {
        println("i am testA.")
    }

}

fun main() {

    //普通函数的调用方式
    val test=TestMain();
    test.testA()

    //中缀表达式函数的调用方式
    for (i in 1 until 100 step 10) {
        println("i=$i")
    }
}
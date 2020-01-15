package com.yobo.yobo_kotlin.test1_26.test1.test24_run

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*

/**
 * Created by ZhangBoshi
 * on 2019-12-25
 */

fun main() {


    GlobalScope.launch {
        println("开始----${Date().time}")
        delay(1000)
        println("中间----${Date().time}")
        Thread.sleep(2000)
        println("结束----${Date().time}")

    }
    repeat(10) {
        Thread.sleep(500)
        println("main---$it----${Date().time}")
    }




}
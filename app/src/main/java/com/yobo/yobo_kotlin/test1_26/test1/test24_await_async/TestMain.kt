package com.yobo.yobo_kotlin.test1_26.test1.test24_await_async

import android.icu.text.SimpleDateFormat
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.*

/**
 * Created by ZhangBoshi
 * on 2019-12-24
 */

fun main(){
    runBlocking {
        launch {
            repeat(5) {
                delay(200)
                println("我是Launche---$it----${Date()}")
            }
        }
        async {
            repeat(5) {
                delay(200)
                if (it == 2) {
                    Thread.sleep(5000)
                }
                println("我是async---$it----${Date()}")
            }
        }
    }
}






fun getNow(): String {
    return SimpleDateFormat("HH:mm:ss").format(Date())
}
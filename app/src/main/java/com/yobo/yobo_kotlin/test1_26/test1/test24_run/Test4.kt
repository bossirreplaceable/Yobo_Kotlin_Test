package com.yobo.yobo_kotlin.test1_26.test1.test24_run

import kotlinx.coroutines.*

/**
 * Created by ZhangBoshi
 * on 2019-12-25
 */

fun main() = runBlocking {
    val name1:Deferred<String> = async {
        val name = "ZhangSan"
        name
    }
    println("name=${name1.await()}")
}

//fun main() = runBlocking {
//    val startTime = System.currentTimeMillis()
//    val job = launch(Dispatchers.Default) {
//        var nextPrintTime = startTime
//        var i = 0
//        while (i < 5) { // 一个执行计算的循环，只是为了占用 CPU
//            // 每秒打印消息两次
//            if (System.currentTimeMillis() >= nextPrintTime) {
//                println("job: I'm sleeping ${i++} ...")
//                nextPrintTime += 500L
//            }
//        }
//    }
//    delay(1300L) // 等待一段时间
//    println("main: I'm tired of waiting!")
//    job.cancel() // 取消一个作业并且等待它结束
//    println("main: Now I can quit.")
//}
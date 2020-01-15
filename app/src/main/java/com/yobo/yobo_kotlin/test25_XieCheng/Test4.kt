package com.yobo.yobo_kotlin.test25_XieCheng

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Created by ZhangBoshi
 * on 2019-12-27
 */


fun main(args: Array<String>) = runBlocking<Unit> {
    launch { // 默认继承 parent coroutine 的 CoroutineDispatcher，指定运行在 main 线程
        println("main runBlocking: I'm working in thread ${Thread.currentThread().name}")
        delay(1000)
        println("main runBlocking: After delay in thread ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Unconfined) {
        println("Unconfined      : I'm working in thread ${Thread.currentThread().name}")
        delay(1000)
        println("Unconfined      : After delay in thread ${Thread.currentThread().name}")
    }
}
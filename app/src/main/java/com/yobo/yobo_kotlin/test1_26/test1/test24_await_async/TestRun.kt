package com.yobo.yobo_kotlin.test1_26.test1.test24_await_async

import kotlinx.coroutines.runBlocking

/**
 * Created by ZhangBoshi
 * on 2019-12-25
 *
 */


fun main() {

    Thread(Runnable {
        repeat(5) {
            if (it == 2) {
                runBlocking {
                    repeat(5){
                        println("runBlocking的it=$it")
                    }
                }
            }
            println("Thread线程的it=$it")
        }
    }).start()



}
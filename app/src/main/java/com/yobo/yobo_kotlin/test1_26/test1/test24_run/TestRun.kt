package com.yobo.yobo_kotlin.test1_26.test1.test24_run

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/**
 * Created by ZhangBoshi
 * on 2019-12-25
 *
 */


fun main() {

    Thread(Runnable {
        repeat(5) {
            if (it == 2) {
                println("hello")

                GlobalScope.launch {
                    println("hello1")

                    repeat(10) {
                        println("launch的it=$it")
                    }
                }
            }
            println("Thread线程的it=$it")
        }
//        GlobalScope.launch {
//            repeat(5){
//                println("launch的it=$it")
//            }
//        }.start()
    }).start()



}
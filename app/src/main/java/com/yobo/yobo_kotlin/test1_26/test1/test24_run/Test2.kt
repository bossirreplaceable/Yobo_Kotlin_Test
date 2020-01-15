package com.yobo.yobo_kotlin.test1_26.test1.test24_run

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Created by ZhangBoshi
 * on 2019-12-25
 */


fun main() {
    val job1 = GlobalScope.launch {
        repeat(5) {
            println("launch的it=$it")
            delay(500)
        }
    }
    println("job.isCompleted=${job1.isCancelled}")
    Thread.sleep(1500)
    job1.cancel()
    println("job.isCompleted=${job1.isCancelled}")
    job1.start()
}

//
//    runBlocking {
//
//        val job = launch {
//            repeat(5) {
//                delay(500)
//                println("launch的it=$it")
//            }
//        }
//        println("job.isCompleted=${job.isCancelled}")
//        delay(2000)
//        job.cancel()
//        println("job.isCompleted=${job.isCancelled}")
//        job.join()
//        job.start()
//    }





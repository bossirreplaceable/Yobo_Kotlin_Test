package com.yobo.yobo_kotlin.test25_XieCheng

import kotlinx.coroutines.*
import java.util.*

/**
 * Created by ZhangBoshi
 * on 2019-12-26
 */


@InternalCoroutinesApi
@ExperimentalCoroutinesApi
fun main() {

    val block = runBlocking {
        val job1 = launch(Dispatchers.Default,start = CoroutineStart.DEFAULT) {
            println("job1执行了----------time=${Date()}---------------------------${Thread.currentThread().name}")
        }
        val job2 = launch(Dispatchers.Default,start = CoroutineStart.LAZY) {
            println("job2执行了----------time=${Date()}---------------------------${Thread.currentThread().name}")
        }
        val job3 = launch(Dispatchers.Default,start = CoroutineStart.ATOMIC) {
            println("job3执行了----------time=${Date()}---------------------------${Thread.currentThread().name}")
        }
        val job4 = launch(Dispatchers.Default,start =  CoroutineStart.UNDISPATCHED) {
            println("job4执行了----------time=${Date()}---------------------------${Thread.currentThread().name}")
        }

        println("执行了取消命令-----------time=${Date()}")
        job1.cancel()
        job3.cancel()
        job4.cancel()

        delay(2000)
        println("启动job2的执行命令")
        println("job1.isCancelled=${job1.isCancelled}")
        println("job2.isCancelled=${job2.isCancelled}")
        println("job3.isCancelled=${job3.isCancelled}")
        println("job4.isCancelled=${job4.isCancelled}")
        job2.start() //job2.start()
    }
}


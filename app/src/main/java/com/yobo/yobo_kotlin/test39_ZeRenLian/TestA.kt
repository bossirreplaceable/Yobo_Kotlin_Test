package com.yobo.yobo_kotlin.test39_ZeRenLian

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

/**
 * Created by ZhangBoshi
 * on 2020-01-08
 */


fun main() = runBlocking {
    val job =launch {

        search()
    }
    println("Helllo")
    job.join()
    println("Helllo1")

}

suspend fun search(){
    delay(2000)
    println("world")
}

var lock:Lock=ReentrantLock()

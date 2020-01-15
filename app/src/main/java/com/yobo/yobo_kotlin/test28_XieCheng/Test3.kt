//package com.yobo.yobo_kotlin.test28_XieCheng
//
///**
// * Created by ZhangBoshi
// * on 2019-12-28
// */
//
//
//import kotlinx.coroutines.*
//
//fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")
//
//fun main() = runBlocking(CoroutineName("main")) {
//    val job1 = async(CoroutineName("协程job1")) {
//        delay(500)
//        log("协程job1执行完成！")
//    }
//    val job2 = async(CoroutineName("job2")) {
//        log("协程job2执ing！")
//        delay(5000)
//        log("协程job2执行完成！")
//    }
//    delay(2000)
//}
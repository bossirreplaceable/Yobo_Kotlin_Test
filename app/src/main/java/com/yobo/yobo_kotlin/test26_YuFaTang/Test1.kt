package com.yobo.yobo_kotlin.test26_YuFaTang

import kotlinx.coroutines.*
import java.util.*


/**
 * Created by ZhangBoshi
 * on 2019-12-27
 */


suspend fun main() {

    println("----------------------time=${Date()}")
    val name = GlobalScope.async (Dispatchers.Default) {
        delay(2000)
        "我是async"
    }.await()
    println("name=$name----------------------time=${Date()}")

}



package com.yobo.yobo_kotlin.test28_XieCheng

/**
 * Created by ZhangBoshi
 * on 2019-12-28
 */

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    // 启动一个协程来处理某种传入请求（request）
    val request = launch {
        // 孵化了两个子作业, 其中一个通过 GlobalScope 启动
        GlobalScope.launch {
            println("job1: 我用GlobalScope启动，并且独立执行，不受父协程影响！")
            delay(1000)
            println("job1: 我没有被取消")
        }
        // 另一个则承袭了父协程的上下文
        launch {
            delay(100)
            println("job2: 我是协程的孩子")
            delay(1000)
            println("job2: 父类被取消后，我也别取消了，所以这里不会执行。")
        }
    }
    delay(500)
    request.cancel() // 取消请求（request）的执行
    delay(1000) // 延迟一秒钟来看看发生了什么
}
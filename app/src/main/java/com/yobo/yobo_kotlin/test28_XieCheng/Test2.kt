package com.yobo.yobo_kotlin.test28_XieCheng

/**
 * Created by ZhangBoshi
 * on 2019-12-28
 */

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    // 启动一个协程来处理某种传入请求（request）
    val request = launch {
        repeat(3) { i -> // 启动少量的子作业
            launch  {
                delay((i + 1) * 200L) // 延迟 200 毫秒、400 毫秒、600 毫秒的时间
                println("协程 $i 执行完成")
            }
        }
        println("request: 父协程执行完成，但是我的子协程仍然活着，直到它们执行完成")
    }
    request.join() // 等待请求的完成，包括其所有子协程
    println("现在所有的协程都执行完成了")
}
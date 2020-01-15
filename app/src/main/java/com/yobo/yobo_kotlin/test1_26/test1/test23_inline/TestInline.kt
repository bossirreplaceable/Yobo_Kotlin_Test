package com.yobo.yobo_kotlin.test1_26.test1.test23_inline

/**
 * Created by ZhangBoshi
 * on 2019-12-23
 */


inline fun test1(crossinline a: () -> Unit) {
    a.invoke()
    return
    println("我在return后面")
}

fun main() {
    test1 {
        println("我是Lambda函数a")
//        return-----------------------报错，无法使用return
    }
    println("我在test1后面")
}
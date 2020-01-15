package com.yobo.yobo_kotlin.test37_array

/**
 * Created by ZhangBoshi
 * on 2020-01-07
 */


fun Int.name() {
    println("我的名字叫$this")
}

val Int.name1 : Boolean
    get() {
        return this % 2 == 0
    }


fun main() {
    val a: Int = 5;
    a.name()
    println(a.name1)

}
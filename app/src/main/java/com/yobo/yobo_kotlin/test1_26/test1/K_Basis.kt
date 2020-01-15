package com.yobo.yobo_kotlin.test1_26.test1

import kotlin.reflect.KClass


public fun outside1(who1: String) {
    println("我是%who1")
}

object InsideClass1{
    fun sayHello1(msg:String){
        print(msg)
    }
}

/**
 * 1、当调用java的class的时候需要在后面加java标签
 * 2、kotlin调用kotlin类则不需要
 */
fun main() {
    testClass(J_Basis::class.java)
    testClass1(MainActivity::class)
}

fun testClass(javaClass:Class<J_Basis>){
}

fun testClass1(kotlinClass:KClass<MainActivity>){

}
package com.yobo.yobo_kotlin.test32

/**
 * Created by ZhangBoshi
 * on 2019-12-29
 */

fun main() {
    val isTest1= "d" in "a".."d"
    val isTest2= "d" in "a".."c"
    val isTest3= "a" in listOf("a","z")
    val isTest4= "a" !in listOf("b","z")
    val isTest5= "zhang" in "abc".."xyz"
    val isTest6= "li" in "abc".."xyz"



    println("isTest1=$isTest1")
    println("isTest2=$isTest2")
    println("isTest3=$isTest3")
    println("isTest4=$isTest4")
    println("isTest5=$isTest5")
    println("isTest6=$isTest6")
}


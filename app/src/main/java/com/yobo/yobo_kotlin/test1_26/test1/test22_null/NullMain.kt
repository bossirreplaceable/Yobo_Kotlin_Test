package com.yobo.yobo_kotlin.test1_26.test1.test22_null

/**
 * Created by ZhangBoshi
 * on 2019-12-22
 */


val name: String = ""
val name1: String? = null

fun printName(str: String) {
    println(str.length)
}

fun printName1(str: String?) {
    println(str?.length)
}

fun main() {
    val test= TestNull()

    printName1(test.name2)
    printName(test.name2)
  //  printName(test.name1)  ---报错
}



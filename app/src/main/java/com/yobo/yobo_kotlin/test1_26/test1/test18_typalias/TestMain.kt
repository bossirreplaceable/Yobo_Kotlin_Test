package com.yobo.yobo_kotlin.test1_26.test1.test18_typalias

import java.io.File

/**
 * Created by ZhangBoshi
 * on 2019-12-22
 */

public typealias B = File


public typealias A = String

fun sayNewString(msg: A) {
    println("msg=$msg")
}

fun main() {

    val msg: A = "小子"
    sayNewString(msg)


    val name: A = "ZhangSan"
    val name1: String = "ZhangSan"
    val myFile = B("myPath")
    val myFile1 = File("myPath")

    println("name==name1 : ${name == name1}")
    println("myFile==myFile1 : ${myFile == myFile1}")
}
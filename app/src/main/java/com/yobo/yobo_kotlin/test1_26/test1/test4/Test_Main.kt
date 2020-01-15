package com.yobo.yobo_kotlin.test1_26.test1.test4

/**
 * 扩展函数的实现方式如下：
 * 1、我们给Test_KuoZhan这个类添加了一个扩展函数
 * 2、我们给String这个类添加了一个输出最后一个字符的扩展函数
 */
fun Test_KuoZhan.writeName() = println("ZhangSan")
fun String.lastChar():Char=this.get(this.length-1)

fun main() {

    val kuozhanKotlin = Test_KuoZhan()
    kuozhanKotlin.writeName()
    println("Hello1234".lastChar())

}




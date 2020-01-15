package com.yobo.yobo_kotlin.test1_26.test1.test23_inline

/**
 * Created by ZhangBoshi
 * on 2019-12-23
 */

//
//fun test1() {
//    val msg = "我是内联函数"
//    println(msg)
//}



inline fun test2(a: () -> String, noinline b: () -> Int) {
    val resultA = a.invoke()
    val resultB = b.invoke()
    println(resultA)
    println(resultB)

}
fun main() {

    test2({
        val name = "lambda闭包函数A"
        name

    }, {
        val age = 18
        age
    })
}
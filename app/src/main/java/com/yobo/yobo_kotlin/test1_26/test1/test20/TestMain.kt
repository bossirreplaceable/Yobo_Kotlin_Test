package com.yobo.yobo_kotlin.test1_26.test1.test20


class TestMain {
    public val msg1 = "类中的变量"
    private val msg2 = "类中的变量"

    companion object {
        val msg3 = "伴生对象的变量"
    }
}

val msg4 = "Kotlin文件中的变量"

fun sayHello(msg: String) {
    println("msg=$msg")
}

fun main() {
    val msg5 = "我要看你的class文件"
    sayHello(msg5)
}
package com.yobo.yobo_kotlin.test34_JiCheng

/**
 * Created by ZhangBoshi
 * on 2019-12-30
 */
interface TestA {
    fun canPrint()
    fun commonFun() {
        println("我是TestA")
    }
}
interface TestB {
    fun canWrite()
    fun commonFun() {
        println("我是TestB")
    }
}
class TestC : TestA, TestB {
    override fun canPrint() {}

    override fun canWrite() {}

    override fun commonFun() {
        super<TestB>.commonFun()
        println("我是TestC")
    }
}
fun main() {
    val testc=TestC()
    testc.commonFun()
}
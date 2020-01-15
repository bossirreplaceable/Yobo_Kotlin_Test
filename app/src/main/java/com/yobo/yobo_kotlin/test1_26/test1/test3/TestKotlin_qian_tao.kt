package com.yobo.yobo_kotlin.test1_26.test1.test3


fun main() {

    testQianTao()
}


/**
 * 在kotlin中是存在嵌套函数的，它的用途一般在：
 * 1、递归函数中一般会使用到
 * 2、不希望外部函数调用到这个函数的时候使用
 */
private fun testQianTao(){

    val ranking="我的名次="
    fun outpuutRanking(rank:Int=10){
        println(ranking+rank)
        if (rank>0){
            outpuutRanking(rank-1)
        }

    }
    outpuutRanking()
}
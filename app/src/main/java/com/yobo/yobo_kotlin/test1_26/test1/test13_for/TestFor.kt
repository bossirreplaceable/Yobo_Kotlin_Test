package com.yobo.yobo_kotlin.test1_26.test1.test13_for

/**
 * Created by ZhangBoshi
 * on 2019-12-15
 */


fun main() {
    /**
     * 1、这个循环的字面意思就是：i 从 0 到 10 循环递增，.. 就是对0到10区间内的int值的简写
     */
    for (i in  0..10){
        println("i=$i")
    }
    println("-------------")
    /**
     * 2、until 就是对上面 .. 的重载运算符（也就是 .. 的另一种表达方式）
     */
    for (j in  0 until 10){
        println("j=$j")
    }
    println("-------------")
    /**
     * 3、downTo 代表的意思就是递减
     */
    for (k in  10 downTo 0){
        println("k=$k")
    }
    println("-------------")
    for (e in  10 until 0){
        println("error=$e")
    }
    println("-------------")
    for (e in  10 .. 0){
        println("error=$e")
    }
    println("-------------")

    /**
     * step 的意思就是递增（递减）的间隔大小
     */
    for (l in  0..10 step 2){
        println("l=$l")
    }
    println("-------------")
    for (l in  0 until 10 step 2){
        println("l=$l")
    }
    println("-------------")
    for (m in  10 downTo 1 step 2){
        println("m=$m")
    }
    println("-------------")

    /**
     * repeat
     */
    repeat(10){
        println("it=$it")
    }

    val list= arrayListOf<String>("a","b","c","d")

    for (str in list ){
        println("str=$str")
    }

    for ((index,str) in list.withIndex()){
        println("第${index}个的元素是$str")
    }


}




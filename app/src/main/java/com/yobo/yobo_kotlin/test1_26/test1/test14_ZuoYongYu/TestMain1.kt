package com.yobo.yobo_kotlin.test1_26.test1.test14_ZuoYongYu

/**
 * Created by ZhangBoshi
 * on 2019-12-17
 */


data class Chicken(var name: String, var weight: Int)

fun main() {

    val chicken = Chicken("小母鸡", 30)

    val chickenAlso = chicken.also { chicken1: Chicken ->
        println("原来的重量：${chicken1.weight}")
        chicken1.weight = 40
    }

    println("现在的重量：${chickenAlso.weight}")


    val chickenNew = chicken.apply {
        println("原来的名字：${this.name}")
        this.name = "小花鸡"
    }

    println("现在的名字：${chickenNew.name}")


}
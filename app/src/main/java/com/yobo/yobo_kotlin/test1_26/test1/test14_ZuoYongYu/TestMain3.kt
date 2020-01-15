package com.yobo.yobo_kotlin.test1_26.test1.test14_ZuoYongYu

/**
 * Created by ZhangBoshi
 * on 2019-12-17
 */

data class Cat(var name: String, var weight: Int)

fun main() {

    val cat = Cat("小花", 10)

    val newName = cat.also {
        it.name = it.name + "+1"
    }.takeIf {
        it.weight <= 10
    }?.apply {
        this.name = this.name + "+2"
    }?.run {
        return@run name + "+3"
    }

    println("newName=$newName")

}


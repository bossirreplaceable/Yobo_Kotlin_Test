package com.yobo.yobo_kotlin.test1_26.test1.test14_ZuoYongYu

/**
 * Created by ZhangBoshi
 * on 2019-12-16
 */


data class Pig(var name: String, var weight: Int)


fun main() {

    val pig = Pig("花姑娘", 300)

    val result1 = pig.run {
        this.name + "长胖了"
    }


    val result2 = pig.run {
        this.name + "长胖了"
        this.weight + 30
    }

    val result3 = pig.run {
        return@run this.name + "长胖了"
        this.weight + 20
    }

    println("result1=$result1")
    println("result2=$result2")
    println("result3=$result3")

    val newName = pig.let { pig1: Pig ->
        pig1.name + "瘦了"
    }

    val newName1 = pig.let {
        it.name + "瘦了"
    }

    println("newName=$newName")
    println("newName1=$newName1")


}






package com.yobo.yobo_kotlin.test1_26.test1.test14_ZuoYongYu

/**
 * Created by ZhangBoshi
 * on 2019-12-17
 */

//data class Cat(var name: String, var weight: Int)

fun main() {

    val cat = Cat("小花", 10)
//
//    val cat1 = cat.takeIf { catP: Cat ->
//        catP.weight > 10
//    }
//    val cat12 = cat.takeUnless {
//        it.weight > 10
//    }
//
//
//    val cat2 = cat.takeIf { catP: Cat ->
//        catP.weight <= 10
//    }
//    val cat3 = cat.takeIf { catP: Cat ->
//        return@takeIf catP.weight > 10
//        catP.weight < 10
//        //1+1//报错
//    }
//
//    println("cat1=$cat1")
//    println("cat12=$cat12")
//    println("cat2=$cat2")
//    println("cat3=$cat3")


    val result=with(cat){
        this.name="小白"
        this.weight=11
        1+1
    }

    println("cat.name=${cat.name}")
    println("cat.weight=${cat.weight}")
    println("result=$result")

}


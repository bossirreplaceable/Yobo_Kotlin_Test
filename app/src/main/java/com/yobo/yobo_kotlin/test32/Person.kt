package com.yobo.yobo_kotlin.test32

/**
 * Created by ZhangBoshi
 * on 2019-12-29
 */
//class Person(val name: String="张三", val age: Int=18, val sex: String="男", val weight: Int=120)
//
//fun main() {
//    val person1=Person(name="张三")
//    val person2=Person("张三",19)
//    val person3=Person(age=19,name="李四",weight = 200)
//    val person4=Person(age=19,weight = 200)
//}

class Person (name:String){
    init {
        println("init1")
    }
    init {
        println("init2")
    }
    init {
        println("init3")
    }
}

fun main() {
    val person=Person("张三")
}

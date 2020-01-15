package com.yobo.yobo_kotlin.test1_26.test1.test10_Data

/**
 * Created by ZhangBoshi
 * on 2019-12-14
 */


fun main() {

    val person = Person();
    person.name = "张三"
    person.age = 18
    println(person)

    val person1 = Person1("李四", 20)
    person1.sex = "女"
    person1.height = 170
    person1.weight = 120
    person1.race="　汉族"
    println(person1)


    println("person1.sex=${person1.sex}")
    println("person1.height=${person1.height}")
    println("person1.weight=${person1.weight}")
    println("person1.isMan=${person1.isMan}")
    println("person1.race=${person1.race}")


}
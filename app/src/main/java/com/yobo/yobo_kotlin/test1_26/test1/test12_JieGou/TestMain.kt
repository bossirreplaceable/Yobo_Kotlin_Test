package com.yobo.yobo_kotlin.test1_26.test1.test12_JieGou


/**
 * Created by ZhangBoshi
 * on 2019-12-15
 */


/**
 * 1、opetator 将一个函数标记为重载一个操作符
 * 2、解构的意思就是将一个被初始化的对象，将它们的属性按顺序解构出来。
 * 3、编译器会为数据类(data class)自动声明/定义componentN()函数,可直接用解构声明!
 */
class Animal(val name: String, val age: Int) {
    var height: Int = 0
    operator fun component1(): String = name
    operator fun component2(): Int = age
    operator fun component3(): Int = height
}

data class Dog(val name: String, val age: Int)


fun main() {

    val animal = Animal("小白", 3)
    animal.height = 120

    val dog = Dog("小黑", 2)

    val (dogName: String, dogAge: Int) = dog
    val (animalName: String, _, animalHeight) = animal


    println("animalName=$animalName")
//    println("animalAge=$animalAge")
    println("animalHeight=$animalHeight")
    println("dogName=$dogName")
    println("dogName=${dog.component1()}")
    println("dogAge=$dogAge")


    var dogList= mutableListOf<Dog>()

    for ((name, age) in dogList) {
        println("dogName=$dogName")
        println("dogAge=$dogAge")
    }

}

fun returnName_Age(name: String): Dog {
    val dog = Dog(name, 10)
    return dog
}





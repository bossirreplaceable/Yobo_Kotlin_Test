package com.yobo.yobo_kotlin.test1_26.test1.test17_FanYinHAo

/**
 * Created by ZhangBoshi
 * on 2019-12-21
 */


data class Person(var name: String, var age: Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Person) return false

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}


fun main() {


    val person1 = Person("ZhangSan", 18)
    val person2 = Person("ZhangSan", 18)

    println("person1 === person2 : ${person1 === person2}")
    println("person1 == person2  : ${person1 == person2}")

    val dog1 = Dog("小黑", 3)
    val dog2 = Dog("小黑", 3)

    println("dog1==dog2          : " + (dog1 === dog2))
    println("dog1.equals(dog2)   : " + (dog1 == dog2))

}
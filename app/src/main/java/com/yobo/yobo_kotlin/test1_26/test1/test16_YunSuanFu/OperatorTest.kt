package com.yobo.yobo_kotlin.test1_26.test1.test16_YunSuanFu

/**
 * Created by ZhangBoshi
 * on 2019-12-21
 */


class OperatorTest(var age: Int) {

    operator fun plus(other: Int): Int {
        return age - other
    }

    operator fun times(other: Int): Int {
        return age + other
    }

}

data class Person(var name: String, var age: Int)

operator fun Int.plus(b: Person): Int {
    return this - b.age
}

operator fun Int.unaryPlus():Int{
    return this+3
}


//data class Person(var name: String, var age: Int){
//    operator fun plus(other:Person):Person{
//         return Person(this.name+"+"+other.name,this.age+other.age)
//    }
//}

fun main() {
//
//    var person2=Person("B",4)
//    var person3=person1+person2
//    println("person3=$person3")


    val test = OperatorTest(18)

    println(1 + 1)

    println(test + 8)

    println(test * 7)

    val person1 = Person("A", 3)

    val testInt = 5

    println("testInt+person1=${testInt +person1}")


}
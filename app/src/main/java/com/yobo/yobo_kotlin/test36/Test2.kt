package com.yobo.yobo_kotlin.test36

/**
 * Created by ZhangBoshi
 * on 2019-12-30
 */


open class Animal() {
    var name: String = "a"
    var age: Int = 3
}

class Dog : Animal() {
    var color: String = "blue"
    fun bark() {
        println("汪汪...")
    }
}


//fun main() {
//    val animal: Animal? = getDog()
//        dogBark(animal)
//}
//
fun getDog(): Animal? {
    return null
}

fun dogBark(animal: Animal?) {
    if (animal is Dog) {
        animal.bark()
    }
}


//

fun main() {
    val animal: Animal ?= getDog()
    val dog:Dog?= animal as? Dog
    dog?.bark()

//    val dog = CastUtil.cast<Dog>(animal)
//    dog?.bark()
}

object CastUtil {
    @JvmStatic
    fun <T> cast(father: Any): T? = father as? T
}

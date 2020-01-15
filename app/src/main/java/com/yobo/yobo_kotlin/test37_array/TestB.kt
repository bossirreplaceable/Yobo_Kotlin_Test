package com.yobo.yobo_kotlin.test37_array

import java.lang.reflect.Type
import kotlin.collections.HashMap

/**
 * Created by ZhangBoshi
 * on 2020-01-07
 * 获取范型的具体类型
 */


val list = arrayOf<String>()

open class Animal<T> {

    var type: Type = Any::class.java

    init {
        val superclass = this.javaClass.genericSuperclass
        println(superclass)
//        type=(superclass as ParameterizedType).actualTypeArguments[0]
    }
}


fun main() {
    val list1 = Animal<List<String>>()
//    println(list1.type)
    val listObject = object : Animal<List<String>>() {}
//    println(listObject.actualTypeArguments)
    val list11 = getType<Animal<List<String>>>(list1)
    println(list11.javaClass.genericSuperclass)
    val name: List<String> = listOf("a", "b", "c")
    for (na in name) {
        println(na)
    }

    getType1<HashMap<String, String>>()
}


inline fun <reified T : Any> getType(objects: T): T {
    println(T::class)
    return objects

}

inline fun <reified T : Any> getType1() {
    println(T::class)

}

//fun <T : Any> getType2() {------------报错
//    println(T::class)
//
//}

package com.yobo.yobo_kotlin.test37_array

/**
 * Created by ZhangBoshi
 * on 2020-01-07
 */



val funlist= arrayOf(1,2,3,4)
val funlist1= arrayOf(1,2,3,"a")
val funlist2= arrayOf<String>("a","b","c","d")
val funlist3= arrayOf<Int>(1,2,3,4)


val funlist4= intArrayOf(1,2,3,4)
val funlist5= booleanArrayOf(true,false,true)





fun main() {
    println(funlist.javaClass.name)
    println(funlist1.javaClass.name)
    println(funlist3.javaClass.name)
    println(funlist4.javaClass.name)

    repeat(funlist.size){
        println(funlist.get(it).javaClass.name)
    }
    println("------------")
    repeat(funlist1.size){
        println(funlist1.get(it).javaClass.name)
    }
    println("------------")
    repeat(funlist2.size){
        println(funlist2.get(it).javaClass.name)
    }

    println("------------")
    repeat(funlist5.size){
        println(funlist5[it].javaClass.name)
    }
}

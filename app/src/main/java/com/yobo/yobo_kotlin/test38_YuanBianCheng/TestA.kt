package com.yobo.yobo_kotlin.test38_YuanBianCheng

import kotlin.reflect.KProperty


/**
 * Created by ZhangBoshi
 * on 2020-01-07
 */


object Mapper{
    fun <A:Any> toMap(a:A):Map<String?,Any?>? {

        val map=a::class.members.map { m ->
            println(m)
            println("-------------------")
            val p= m as? KProperty
            println(p)
            p?.name to p?.call(a)
        }.toMap()
        return map
    }
}

data class User(val name:String ,val age:Int)

fun main() {
    println(Mapper.toMap(User("小子",22)))

    val user=User("sss",22)
}
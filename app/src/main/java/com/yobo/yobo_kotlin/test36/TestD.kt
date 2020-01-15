package com.yobo.yobo_kotlin.test36

import com.yobo.yobo_kotlin.test37_array.name
import com.yobo.yobo_kotlin.test37_array.name1

/**
 * Created by ZhangBoshi
 * on 2020-01-07
 */


fun main() {

    var c: Int = 11
    c.name()
    println(c.name1)

    run {
        c = 12
        println(c.name1)

    }
    println(c.name1)


}
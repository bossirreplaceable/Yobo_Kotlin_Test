package com.yobo.yobo_kotlin.test1_26.test1.test5_Lambda


/**
 * 注意：Lambda形式的匿名函数，是有参数限制的，kotlin的官方标准是22个
 *
 */

val lambdaA =
    { a: Int, b: Int, c: Int, d: Int, e: Int,
      f: Int, g: Int, h: Int, i: Int, j: Int,
      k: Int, l: Int, m: Int, n: Int, o: Int,
      p: Int, q: Int, r: Int, s: Int, t: Int,
      u: Int, v: Int, w: Int,x:Int,y:Int ->
        println("现在是24个参数")
    }

fun main() {
    lambdaA(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1)

}




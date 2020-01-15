package com.yobo.yobo_kotlin.test1_26.test1.test3


/**
 * kotlin函数的三种生成方式
 * 1、普通模式
 */
fun writeName(name: String) {
    println(name)
}
/**
 *2、有默认值的函数，当调用的时候不传参数的话就会输出默认值
 *   这样可以减少重载函数的数量
 */
fun writeName1(name: String = "张三") {
    println(name)
}
/**
 * 3、当函数内的语句只有一条的时候，可以采用=的好形式赋值给这个函数
 */
fun writeName2(name: String)= print(name)



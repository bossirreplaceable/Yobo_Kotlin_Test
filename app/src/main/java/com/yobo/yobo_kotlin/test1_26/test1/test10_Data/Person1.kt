package com.yobo.yobo_kotlin.test1_26.test1.test10_Data

/**
 * Created by ZhangBoshi
 * on 2019-12-14
 */

/**
 *
 */
data class Person1(var name: String, var age: Int) {

    //用lateinit关键字修饰的属性，可以没有初始值，可以后期set、get
    lateinit var sex: String

    //如果不加lateinit关键字，就必须被初始化赋值
    var race="种族"

    //被val初始化的属性，是无法被修改的，也就是无法被set
    val race1="汉族"

    /**
     * 上面的属性，name、age、sex、race都是对set、get方法进行了省略，让编译器来自动添加set、get方法的
     * 当然我们也可以重写set、get方法。来对set的值进行一定的封装处理
     */

    var weight: Int = 0
        get() = field
        set(value) {
            this.weight=value
        }

    var height: Int = 0
        set(value) {
            field = value + 10
        }

    val isMan:Boolean
        get() {
            return this.sex=="男"
        }

}
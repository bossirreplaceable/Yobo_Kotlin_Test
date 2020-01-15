package com.yobo.yobo_kotlin.test32

/**
 * Created by ZhangBoshi
 * on 2019-12-29
 */


fun main() {
    val person=Person1("张三",18)
    println("person.sex1=${person.sex1}")
    person.age=21   //------------------------只在第一次被调用的时候赋值，后续赋值也不会改变sex1的值
    println("person.sex2=${person.sex1}")

    val person1=Person1("张三",22)
    println("person.sex3=${person1.sex1}")
    //person.sex1="s" ------------------------------报错，无法二次赋值
}

data class Person1(var name: String, var age: Int) {

    //用lateinit关键字修饰的属性，可以没有初始值，可以后期set、get
    lateinit var sex: String

    val sex1 by lazy {
        if (age > 20) "男" else "女"
    }

    //如果不加lateinit关键字，就必须被初始化赋值
    var race = "种族"

    //被val初始化的属性，是无法被修改的，也就是无法被set
    val race1 = "汉族"

    /**
     * 1、上面的属性，name、age、sex、race都是对set、get方法进行了省略，让编译器来自动添加set、get方法的
     * 2、当然我们也可以重写set、get方法。来对set的值进行一定的封装处理
     * 3、field相当于Java中的this.weight的含义，注意我们set方法中绝不不能调用自己this.weight
     * 否者就会出现无限的重复调用自己的死循环
     */

    var weight: Int = 0
        get() = field
        set(value) {
            field = value
        }

    var height: Int = 0
        set(value) {
            field = value + 10
        }

    val isMan: Boolean
        get() {
            return this.sex == "男"
        }

}
package com.yobo.yobo_kotlin.test1_26.test1.test21_final_const

/**
 * Created by ZhangBoshi
 * on 2019-12-22
 */


val name: String = "A"

//const var name1:String="B"        修饰var变量--报错
const val name2: String = "B"

//const class TestVal{}                 修饰类---报错
//const val person1:Person1?=null   修饰引用类型--报错

class TestVal {
    //const val name3:String="C"        放在类中-----报错
    object TestConst {
        const val name4: String = "B"
    }

}


fun main() {

    println(name)
    println(name2)


}


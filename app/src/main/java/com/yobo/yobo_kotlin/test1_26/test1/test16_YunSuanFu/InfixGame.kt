package com.yobo.yobo_kotlin.test1_26.test1.test16_YunSuanFu

/**
 * Created by ZhangBoshi
 * on 2019-12-21
 */


infix fun String.miss(other: String) {
    println("$this miss $other")
}

//fun main() {
//
//    println("我" miss "你")
//
//}

data class Card(var power:Int){
    infix fun vs(other:Card):String {
        if (this.power > other.power) {
            return "i win"
        } else if (this.power < other.power){
            return "i lose"
        }else{
            return "I'm as strong as you"
        }
    }
}
fun main() {
    val card1=Card(1000)
    val card2=Card(999)
    println("card1 vs card2 =${card1 vs card2}")
}
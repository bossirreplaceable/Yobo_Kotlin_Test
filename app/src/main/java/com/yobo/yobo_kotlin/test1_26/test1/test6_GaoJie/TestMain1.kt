package com.yobo.yobo_kotlin.test1_26.test1.test6_GaoJie


fun gaoFun1(isSay: Boolean, lambda: () -> Unit) {
    if (isSay) {
        lambda()
    }
}

inline fun gaoFun2(isSay: Boolean, lambda: () -> Unit) {
    if (isSay) {
        lambda()
    }
}

fun main() {
    gaoFun1(true) { println("lambda运行输出") }
    gaoFun2(true) { println("inline关键字函数") }
}






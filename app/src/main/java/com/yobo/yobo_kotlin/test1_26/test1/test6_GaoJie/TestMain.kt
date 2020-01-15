package com.yobo.yobo_kotlin.test1_26.test1.test6_GaoJie


/**
 * Unit的定义：在kotlin中当一个函数没有返回值的时候，默认返回一个Unit类型。
 *            我们大部分情况是可以省略这个Unit的，但是当参数是一个没有
 *            返回值的Lambda匿名函数的话，就需要声明出来
 */
fun gaoFun(isSay: Boolean, lambda: () -> Unit) {
    if (isSay) {
        println("高阶函数的参数lambda()匿名函数传了进来")

        lambda()
    }
}

//main()函数的Unit就是省略的。（这里我特意加上了）
fun main(): Unit {

    //这里我们将lambda匿名函数传给了gaoFun
    gaoFun(false, { println("我是高阶函数") })

    //因为gaoFun函数的最后一个参数是Lambda，所以我们可以将lambda匿名函数放在小括号的后面
    gaoFun(true) { println("我也可以放在这里") }


    /**
     * 这里我声明了一个Runnable匿名内部类，然后将匿名内部类的run匿名函数赋值给了lambda
     */
    val runnable = Runnable {
        println("我是一个Runnable，我在被copy的时候就会运行")
    }

    val lambda: () -> Unit

    lambda = runnable::run

    gaoFun(true, lambda)

}


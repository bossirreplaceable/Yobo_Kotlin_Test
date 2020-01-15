package com.yobo.yobo_kotlin.test1_26.test1.test5_Lambda


/**
 *在Kotlin中，我们可以通过Lambda闭包的形式对这段代码进行缩写
 * 注意：
 * 1、如果Lambda没有参数的话，可以省略箭头
 * 2、如果使用Lambda参数的这个函数，只有一个参数，且这个参数可以用Lambda表示，那么就可以省略小括号
 * 3、如果使用Lambda参数的这个函数，有过个参数，但是Lambda参数是最后一个参数，那么函数可以用（）+{}的形式表示
 */
fun main() {

    // 1、正常形式
    val thread = Thread(Runnable { println("hello") })

    // 2、箭头 + 函数
    val thread1 = Thread({ -> println("hello1") })

    // 3、因为new Runnable()没有参数，所以我们可以省略那个箭头
    val thread2 = Thread({ println("hello2") })

    // 4、因为public Thread(Runnable target)只有target这一个参数，且这个参数是可以用Lambda表示，那么我们可以省略小括号
    val thread3 = Thread { println("hello3") }

    // 5、因为public Thread(Runnable target)，因为参数targer是最后一个参数，我们也可以用()+{}的形式来表示
    val thread4 = Thread() { println("hello4") }

    thread.start()
    thread1.start()
    thread2.start()
    thread3.start()

}




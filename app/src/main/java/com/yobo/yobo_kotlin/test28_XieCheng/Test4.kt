package com.yobo.yobo_kotlin.test28_XieCheng

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

/**
 * Created by ZhangBoshi
 * on 2019-12-28
 */

class Test4  {

    val mainScope = MainScope()


    fun testMainScope() = runBlocking {
        val job1 = mainScope.async {
            println("协程job1执行完成！")
        }

        val job2 = mainScope.async {
            println("协程job2执ing！")
            delay(5000)
            println("协程job2执行完成！")
        }

        job1.start()

        delay(2000)
    }

}


fun main() {
    val test4 = Test4()
//    test4.testMainScope()
}




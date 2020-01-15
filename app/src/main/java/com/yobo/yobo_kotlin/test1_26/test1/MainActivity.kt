package com.yobo.yobo_kotlin.test1_26.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yobo.yobo_kotlin.R

/**
 * kotlin的函数是可以写在类的外面的，java的不可以，这是因为kt文件编译之后，会变成相当于jvm层次的class文件
 * 1、类中的inside函数可以调用类外的outside函数
 * 2、类外的outside函数不能调用类中的inside函数
 */
 fun outside(who: String) {
    //我在类的外面，MainActivity.kt文件的里面
    println("我是$who")
 }

class MainActivity : AppCompatActivity() {
    private fun inside() {
        //我在类的里面,
        outside("张三")
    }

    /**
     * kotlin对变量有两种分类
     * var：可变的变量
     * val：不可变的变量（不是常量）
     */
    var age: Int = 18   //可变的变量
    val age1: Int = 19  //不可变的变量（不是常量）
    /**
     * kotlin对变量的null进行了区分
     */
    var name: String = "Zhang San" //为不可null的变量
    var name1: String? = null      //为可null的变量
    //var name2: String = null       //这样声明变量会报错

    /**
     * 相同数据类型的可null和不可null的两个变量是两种完全不同的类型的变量
     * 1、它们之间不能直接互相赋值
     * 2、不可null和可null的两种类型之间的转换类似于int和float
     *    可null是不可null的高级类型
     */
    private fun testNull() {
        //name = name1     //1、报错，不可null的变量不能直接转换为可null
        name = name1!!   //2、可以加两个感叹号进行类型强转
        name1 = name     //3、不可null可的变量可以隐式转换为可null
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    /**
     * 对函数的约定
     * 1、以fun开头表示声明一个函数
     * 2、如果需要返回类型，将采用getOld1的形式
     */
    private fun getOld(old: Int) {}

    private fun getOld1(old: Int): Int {
        return 18
    }

    object InsideClass{
        fun sayHello(msg:String){
            print(msg)
        }
    }

}

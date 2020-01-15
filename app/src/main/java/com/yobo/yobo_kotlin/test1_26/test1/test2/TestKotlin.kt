package com.yobo.yobo_kotlin.test1_26.test1.test2


//fun main() {
//    TestInteger.testInteger(1)
//    print("小样")
//}

fun main() {

    testNull("")
}

/**
 *   public static String testNull(String str) {return str.isEmpty() ? null : str;}
 *   1、当Java中的返回值可能为null的时候，kotlin中接受返回值的变量也必须为可null的，否则就会报错
 *   2、当kotlin中的变量可null的时候不能直接调用自带的函数，否则也会报错。如下面的26行
 */
private fun testNull(str: String) {
//
//    var name1 = TestNull.testNull(str)
//
//    var name2: String = TestNull.testNull(str)
//
//    var name3: String? = TestNull.testNull(str)
//
//    print(name3.length)
//
//    print(name3?.length)


}

/**
 * 前面我们讲过，调用匿名内部类的函数，可以通过INSTANCE来调用
 * 那么我们怎么实现像Java中调用静态方法的形式用类名直接调用呢
 * 在Kotlin中有一个注解@JvmStatic可是将kotlin方法编译成Java中的静态方法和变量
 */
object InsideClass {

    @JvmStatic
    var name: String = "Zhang San"

    @JvmStatic
    fun writeName(name: String) {
        println("我的名字叫$name")
    }

    fun writeName1(name1: String) {
        println("我的名字叫$name1")
    }
}


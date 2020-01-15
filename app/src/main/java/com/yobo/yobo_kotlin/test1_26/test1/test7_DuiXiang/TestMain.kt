package com.yobo.yobo_kotlin.test1_26.test1.test7_DuiXiang

class TestMain {

    /**
     * Kotlin中的访问修饰符有下面几种
     * 1、public---能被所有的类（接口、成员）访问
     *
     * 2、protected---只能被本类、同一个包中的类访问；如果在其他包中被访问，则必须是该成员所属类的子类。
     *
     * 3、private---成员变量和方法都只能在定义它的类中被访问，其他类都访问不到。对成员变量的进行获取和更改，一般用get()，set()
     *
     * 4、internal---能被同一个module中的类（接口、成员）所访问
     */

    public val name: String? = null

    protected val name1: String? = null

    private val name2: String? = null

    internal val name3: String? = null


    fun testStringUtils() {
        //类名内的静态内部类
        val isEmpty =  StringUtils.InsideUtils.isEmpty("小子")
        val isEmpty1 = StringUtils.InsideUtils.isEmpty1("")

        //类名外的静态内部类
        val isEmpty2 = OusideUtils.isEmpty2("小子2")
        val isEmpty3 = OusideUtils.isEmpty3("")

        //伴生对象
        val isEmpty4 = StringUtils.isEmpty4("小子4")
        val isEmpty5 = StringUtils.isEmpty5("")

        println("isEmpty=$isEmpty")
        println("isEmpty1=$isEmpty1")
        println("isEmpty2=$isEmpty2")
        println("isEmpty3=$isEmpty3")
        println("isEmpty4=$isEmpty4")
        println("isEmpty5=$isEmpty5")

    }
}

fun main() {
    val testMain= TestMain()
    testMain.testStringUtils()
}
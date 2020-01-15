package com.yobo.yobo_kotlin.test1_26.test1.test8_DaiLi

import java.lang.reflect.Proxy

/**
 * Created by ZhangBoshi
 * on 2019-12-14
 */

////被代理的对象
//class Pig : Animal {
//
//    override fun pick(voice: String?): String {
//
//        println("被代理对象的叫声：$voice")
//
//        val result: String = "$voice+2"
//
//        return result
//    }
//}
//
////代理对象
//class ProxyPig(animal: Animal) : Animal by animal {
//
//    override fun pick(voice: String?): String {
//
//        println("代理对象的叫声：$voice")
//
//        val result: String = "$voice+3"
//
//        return result
//    }
//}
//
//fun main() {
//    val pig = Pig()
//    val proxyPig = ProxyPig(pig)
//    val result = proxyPig.pick("Mo")
//    println("代理对象调用pick()返回值，result=$result")
//
//}




fun main() {

    val dog = Dog()

    val dong = ProxyAnimal_dong(dog)

    /**
     * 获取到代理对象
     * @param   loader 类加载器，这里可以传 被代理对象的类加载器
     * @param   interfaces 被代理对象实现的接口，这里可以传你只想拦截的那个方法的接口
     * @param   h 代理对象的工具类
     * public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
     *
     */
    val proxyDog = Proxy.newProxyInstance(dong.javaClass.classLoader, dog.javaClass.interfaces, dong) as Animal

    val result = proxyDog.pick("Wang")

    println("代理对象调用pick()返回值，result=$result")
}
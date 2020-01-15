package com.yobo.yobo_kotlin.test1_26.test1.test9_DaiLi

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

/**
 * Created by ZhangBoshi
 * on 2019-12-14
 */

/**
 * 被代理类和代理类的共同接口
 */
interface Animal {

    fun pick(voice: String): String

}

/**
 * 被代理类（target类）
 */
class Dog : com.yobo.yobo_kotlin.test1_26.test1.test8_DaiLi.Animal {

    override fun pick(voice: String): String {

        println("被代理对象的叫声：$voice")

        val result = "$voice+2"
        return result
    }
}

/**
 * 代理类的工具类，它的作用：当代理对象调用target类对象的方法的时候，会被分发到这个工具类的invoke()方法中，
 * 然后你在这里对target类的内部方法进行进一步的封装。
 */
class ProxyAnimal_dong(private val mDog: Dog) : InvocationHandler {

    /**
     * @param proxy 调用该方法的代理实例（proxyDog就是代理实例）
     * @param method 代理实例（proxyDog）调用的方法，可通过method.getName()获取到方法的名称
     * @param args 代理实例（proxyDog）调用方法传入的参数数组。
     * @return 代理实例（proxyDog）调用的方法的返回值。
     */
    @Throws(Throwable::class)
    override fun invoke(proxy: Any, method: Method, args: Array<Any>): Any? {

        //通过method我们就能知道代理实例调用的是哪个方法，然后进一步对其进行封装。
        //这里我们实现和上面静态代理一样的封装，给voice参数+1，给返回值+2+3
        if (method.name == "pick") {
            println("代理对象，调用了pick(),参数args=" + args[0])
            var voice = args[0] as String
            voice = "$voice+1"

            var result = mDog.pick(voice)
            println("被代理对象，调用它的内部方法的返回值，result=$result")

            result = "$result+3"
            return result
        }
        return null
    }

}


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
    val proxyDog =
        Proxy.newProxyInstance(dong.javaClass.classLoader, dog.javaClass.interfaces, dong) as Animal

    val result = proxyDog.pick("Wang")

    println("代理对象调用pick()返回值，result=$result")
}
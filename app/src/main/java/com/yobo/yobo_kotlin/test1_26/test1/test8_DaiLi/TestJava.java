package com.yobo.yobo_kotlin.test1_26.test1.test8_DaiLi;

import java.lang.reflect.Proxy;

/**
 * Created by ZhangBoshi
 * on 2019-12-14
 */
public class TestJava {

//
//    public static void main(String[] args) {
//
//        Dog dog = new Dog();
//        ProxyAnimal proxyAnimal=new ProxyAnimal(dog);
//        String result=proxyAnimal.pick("Wang");
//        System.out.println("总的返回结果："+result);
//
//
//    }


    public static void main(String[] args) {

        Dog dog=new Dog();

        ProxyAnimal_dong dong=new ProxyAnimal_dong(dog);

        /**
         * 获取到代理对象
         * @param   loader 类加载器，这里可以传 被代理对象的类加载器
         * @param   interfaces 被代理对象实现的接口，这里可以传你只想拦截的那个方法的接口
         * @param   h 代理对象的工具类
         * public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
         *
         */
        Animal proxyDog = (Animal) Proxy.newProxyInstance(dong.getClass().getClassLoader(), dog.getClass().getInterfaces(), dong);

        String result=proxyDog.pick("Wang");

        System.out.println("代理对象调用pick()返回值，result="+result);

    }
}

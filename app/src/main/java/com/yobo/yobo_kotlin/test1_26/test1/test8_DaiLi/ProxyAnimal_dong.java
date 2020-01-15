package com.yobo.yobo_kotlin.test1_26.test1.test8_DaiLi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ZhangBoshi
 * on 2019-12-14
 */
public class ProxyAnimal_dong implements InvocationHandler {

    private Dog mDog;

    public ProxyAnimal_dong(Dog mDog) {
        this.mDog = mDog;
    }

    /**
     * @param proxy 调用该方法的代理实例（proxyDog就是代理实例）
     * @param method 代理实例（proxyDog）调用的方法，可通过method.getName()获取到方法的名称
     * @param args 代理实例（proxyDog）调用方法传入的参数数组。
     * @return 代理实例（proxyDog）调用的方法的返回值。
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //通过method我们就能知道代理实例调用的是哪个方法，然后进一步对其进行封装。
        //这里我们实现和上面静态代理一样的封装，给voice参数+1，给返回值+2+3
        if (method.getName().equals("pick")) {
            System.out.println("代理对象，调用了pick(),参数args=" + args[0]);
            String voice = (String) args[0];
            voice = voice + "+1";

            String result = mDog.pick(voice);
            System.out.println("被代理对象，调用它的内部方法的返回值，result="+result);

            result = result + "+3";
            return result;
        }
        return null;
    }

}

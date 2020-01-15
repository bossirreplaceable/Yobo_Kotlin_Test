package com.yobo.yobo_kotlin.test1_26.test1.test8_DaiLi;

/**
 * Created by ZhangBoshi
 * on 2019-12-14
 */
public class Dog implements Animal {

    @Override
    public String pick(String voice) {

        System.out.println("被代理对象的叫声："+voice);
        voice = voice + "+2";
        return voice;
    }
}

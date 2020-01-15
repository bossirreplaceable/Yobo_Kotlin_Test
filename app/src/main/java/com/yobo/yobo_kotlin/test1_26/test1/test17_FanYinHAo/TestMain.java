package com.yobo.yobo_kotlin.test1_26.test1.test17_FanYinHAo;

/**
 * Created by ZhangBoshi
 * on 2019-12-21
 */
public class TestMain {


    public static void main(String[] args) {
        Person person1 = new Person("ZhangSan", 18);
        Person person2=new Person("ZhangSan",18);

        System.out.println(person1==person2);
        System.out.println(person1.equals(person2));

        Dog dog1=new Dog("小黑",3);
        Dog dog2=new Dog("小黑",3);

        System.out.println("dog1==dog2        : "+(dog1==dog2));
        System.out.println("dog1.equals(dog2) : "+dog1.equals(dog2));
    }
}

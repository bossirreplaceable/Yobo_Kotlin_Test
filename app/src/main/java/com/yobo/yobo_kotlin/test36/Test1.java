package com.yobo.yobo_kotlin.test36;

/**
 * Created by ZhangBoshi
 * on 2019-12-30
 */
public class Test1 {
    public static void main(String[] args) {

        Animal animal=new Dog();
        Dog dog=CastUtil.cast(animal);
        dog.bark();
    }

}

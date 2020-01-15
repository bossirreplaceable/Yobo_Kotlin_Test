package com.yobo.yobo_kotlin.test1_26.test1.test17_FanYinHAo;

/**
 * Created by ZhangBoshi
 * on 2019-12-21
 */
public class Test {

    public static void main(String[] args) {
        String name1 = "ZhangSan";
        String name2 = "ZhangSan";
        String name3 = new String("ZhangSan");

        System.out.println("name1==name2         :  "+(name1==name2));
        System.out.println("name2==name3         :  "+(name3==name2));
        System.out.println("name1==name3         :  "+(name1==name3));
        System.out.println("name1.equals(name3)  :  "+name1.equals(name3));

        Integer age1=127;
        Integer age2=127;
        Integer age3=128;
        Integer age4=128;

        System.out.println("age1==age2         :  "+(age1==age2));
        System.out.println("age3==age4         :  "+(age3==age4));


    }
}

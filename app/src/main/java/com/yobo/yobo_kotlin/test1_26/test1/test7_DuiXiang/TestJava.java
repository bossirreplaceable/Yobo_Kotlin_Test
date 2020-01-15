package com.yobo.yobo_kotlin.test1_26.test1.test7_DuiXiang;


public class TestJava {

    public static void main(String[] args) {

        //调用StringUtils类内部的匿名静态类的方法
        boolean isEmpty = StringUtils.InsideUtils.INSTANCE.isEmpty("小子");
        boolean isEmpty1 = StringUtils.InsideUtils.isEmpty1("");

        //调用StringUtils类外部的匿名静态类的方法
        boolean isEmpty2 = OusideUtils.INSTANCE.isEmpty2("小子2");
        boolean isEmpty3 = OusideUtils.isEmpty3("");

        //调用StringUtils的伴生对象的静态方法
        boolean isEmpty4 = StringUtils.Companion.isEmpty4("小子4");
        boolean isEmpty5 = StringUtils.isEmpty5("");

        System.out. println("isEmpty="+isEmpty);
        System.out. println("isEmpty1="+isEmpty1);
        System.out. println("isEmpty2="+isEmpty2);
        System.out. println("isEmpty3="+isEmpty3);
        System.out. println("isEmpty4="+isEmpty4);
        System.out. println("isEmpty5="+isEmpty5);

    }

}

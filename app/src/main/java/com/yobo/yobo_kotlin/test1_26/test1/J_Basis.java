package com.yobo.yobo_kotlin.test1_26.test1;

public class J_Basis {
    /**
     * kotlin中的匿名内部类在编译过程中会生成一个INSTANCE的单例对象，
     * 并把自己的构造函数生命为private
     * （这也是kotlin中单例模式的书写方式）
     */
    public static void main(String[] args) {
        MainActivityKt.outside("张三");
        MainActivity.InsideClass.INSTANCE.sayHello("hello");
        InsideClass1.INSTANCE.sayHello1("hello1");
    }
}

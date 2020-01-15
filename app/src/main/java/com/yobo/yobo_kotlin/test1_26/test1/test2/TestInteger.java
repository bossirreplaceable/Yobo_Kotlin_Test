package com.yobo.yobo_kotlin.test1_26.test1.test2;

import org.jetbrains.annotations.Nullable;

public class TestInteger {

    public static void testInteger(Integer integer) {
        System.out.print("integer=" + integer);
    }

    public static void testInteger1(int integer) {
        System.out.print("integer=" + integer);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

    }

    @Nullable
    public static String testNull(String str) {
        return str.isEmpty() ? null : str;
    }

}

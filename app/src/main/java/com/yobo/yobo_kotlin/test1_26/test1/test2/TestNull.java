package com.yobo.yobo_kotlin.test1_26.test1.test2;

import org.jetbrains.annotations.Nullable;

public class TestNull {

    @Nullable
    public static String testNull(String str) {
        return str.isEmpty() ? null : str;
    }


    public static void main(String[] args) {

        InsideClass.writeName(InsideClass.getName());
        InsideClass.INSTANCE.writeName1(InsideClass.getName());
    }

}



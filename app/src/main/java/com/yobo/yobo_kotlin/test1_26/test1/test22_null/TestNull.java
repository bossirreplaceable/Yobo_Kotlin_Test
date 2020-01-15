package com.yobo.yobo_kotlin.test1_26.test1.test22_null;

import androidx.annotation.Nullable;

import org.jetbrains.annotations.NotNull;


/**
 * Created by ZhangBoshi
 * on 2019-12-22
 */
public class TestNull {

    String name="";
    @Nullable
    String name1=null;
    @NotNull
    String name2=null;

    private void printName(@NotNull String str){
        System.out.println(str.length());
    }
    private void printName1(@Nullable String str){
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        String name2=null;
        TestNull testNull=new TestNull();
        testNull.printName(name2);
        testNull.printName(testNull.name1);
        testNull.printName1(testNull.name1);
    }
}

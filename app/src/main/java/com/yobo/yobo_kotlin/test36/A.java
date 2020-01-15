package com.yobo.yobo_kotlin.test36;

import java.util.Locale;

/**
 * Created by ZhangBoshi
 * on 2020-01-03
 */
public class A {

    private static final String FORMAT_AREA_SPM_ID = "%s.%s.%s";

    public static void main(String[] args) {
      String a= String.format(Locale.getDefault(), "%d%04d", 1,102);

       String b =String.format((Locale) null, FORMAT_AREA_SPM_ID, a, a, a);
        System.out.println(b);
    }
}

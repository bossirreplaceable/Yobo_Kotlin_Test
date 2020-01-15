package com.yobo.yobo_kotlin.test1_26.test1.test11_emun;

import java.util.Arrays;

/**
 * Created by ZhangBoshi
 * on 2019-12-15
 */

public class MyEnum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(JaveEnum.values(

        )));
        System.out.println(JaveEnum.valueOf("BOY_3").ordinal());

        guessBoy(JaveEnum.BOY_3);
        guessBoy(JaveEnum.BOY_1);
        guessBoy(JaveEnum.BOY_5);
    }

    private static void guessBoy(JaveEnum name) {
        if (name == JaveEnum.BOY_1) {
            System.out.println(JaveEnum.BOY_1);
        } else if (name == JaveEnum.BOY_2) {
            System.out.println(JaveEnum.BOY_2);
        } else if (name == JaveEnum.BOY_3) {
            System.out.println(JaveEnum.BOY_3);
        } else if (name == JaveEnum.BOY_4) {
            System.out.println(JaveEnum.BOY_4);
        } else if (name == JaveEnum.BOY_5) {
            System.out.println(JaveEnum.BOY_5);
        }
        switch (name) {
        case BOY_1:
        case BOY_2:
        case BOY_3:
        case BOY_4:
        case BOY_5:
        }
    }

}

enum JaveEnum {

    BOY_1,
    BOY_2,
    BOY_3,
    BOY_4,
    BOY_5
}

package com.yobo.yobo_kotlin.test1_26.test1.test4;

public class Test_KuoZhan {

    /**
     *  在Java中new Thread（）的实现方式
     * @param args
     */
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        thread.start();

    }

}


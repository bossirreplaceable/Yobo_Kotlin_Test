package com.yobo.yobo_kotlin.test1_26.test1.test24_await_async;

import static java.lang.Thread.yield;

/**
 * Created by ZhangBoshi
 * on 2019-12-25
 */

// public class Join01 implements Runnable {
//
// public static void main(String[] args) {
// for (int i = 0; i < 20; i++) {
// final int finalI = i;
// new Thread(new Runnable() {
// @Override
// public void run() {
// System.out.println("没。" + (finalI + 1));
// }
// }).start();
// if (i == 5) {
// Join01 j = new Join01();
// Thread t = new Thread(j);
// t.setName("被邀请先执行的线程.");
// t.start();
// try {// 邀请这个线程，先执行
// t.join();
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// System.out.println("没被邀请的线程。" + (i + 1));
// }
//
// }
//
// public void run() {
// for (int i = 0; i < 10; i++) {
// System.out.println(Thread.currentThread().getName() + (i + 1));
// }
// }
// }

// yield()
// 告诉系统"把自己的CPU时间让掉，让其他线程或者自己运行"，示例代码如下:

public class Join01 {

    public static void main(String[] args) {
        YieldFirst yf = new YieldFirst();
        YieldSecond ys = new YieldSecond();
        YieldThird yt = new YieldThird();
        yf.start();
        ys.start();
        yt.start();
    }

}

class YieldFirst extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("第一个线程第" + (i + 1) + "次运行.");
            // 让当前线程暂停
            yield();
        }
    }

}

class YieldSecond extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("第二个线程第" + (i + 1) + "次运行.");
            // 让当前线程暂停
//            yield();

        }

    }
}

class YieldThird extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("第三个线程第" + (i + 1) + "次运行.");
            // 让当前线程暂停
//            yield();
        }
    }
}






//    synchronized method_1(/*……*/)
//    {//called by thread1.
        // accessdataarea available=true;
        // notify();
        // }
        // synchronized method_2(/*……*/)
        // {
        // called by thread2.while(!available)
        // try{
        // wait();
        // waitfornotify().
        // }catch(InterruptedException e){
        // }
        // accessdataarea
        // }

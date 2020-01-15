package com.yobo.yobo_kotlin.test34_JiCheng;

/**
 * Created by ZhangBoshi
 * on 2019-12-30
 */


abstract class TestFather {
    public abstract void funA();
}
interface Test1 {
    void funB();

}
interface Test2 {
    void funC();
}

public class TestMain extends TestFather implements Test1,Test2{
    @Override
    public void funA() {

    }

    @Override
    public void funB() {

    }

    @Override
    public void funC() {

    }
}


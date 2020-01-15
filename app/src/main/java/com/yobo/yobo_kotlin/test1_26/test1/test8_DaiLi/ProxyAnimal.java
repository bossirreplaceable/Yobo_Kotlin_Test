package com.yobo.yobo_kotlin.test1_26.test1.test8_DaiLi;

/**
 * Created by ZhangBoshi
 * on 2019-12-14
 */
public class ProxyAnimal implements Animal {

    private Dog dog;

    public ProxyAnimal(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String pick(String voice) {

        System.out.println("代理层叫声："+voice);

        String newVoice = voice + "+1";

        String result=dog.pick(newVoice);

        result = result + "+3";

        return result;

    }
}

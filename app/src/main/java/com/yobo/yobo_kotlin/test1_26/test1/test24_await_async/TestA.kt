package com.yobo.yobo_kotlin.test1_26.test1.test24_await_async

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yobo.yobo_kotlin.R

/**
 * Created by ZhangBoshi
 * on 2019-12-24
 */


class TestA : AppCompatActivity() {

    var age: Int = 18   //可变的变量
    var name: String = "Zhang San" //为不可null的变量

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
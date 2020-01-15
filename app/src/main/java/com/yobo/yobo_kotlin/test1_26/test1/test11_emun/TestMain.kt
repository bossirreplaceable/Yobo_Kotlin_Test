package com.yobo.yobo_kotlin.test1_26.test1.test11_emun

import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by ZhangBoshi
 * on 2019-12-15
 */
class TestMain: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

    }

    fun initView(){

        var text=TextView(this)
        text.setTextColor(Color.RED)

    }



}
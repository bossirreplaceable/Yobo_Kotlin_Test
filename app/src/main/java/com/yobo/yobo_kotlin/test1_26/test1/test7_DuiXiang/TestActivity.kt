package com.yobo.yobo_kotlin.test1_26.test1.test7_DuiXiang;

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.yobo.yobo_kotlin.R

public class TestActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

    }

    fun initMain() {

        val text: TextView = findViewById(R.id.text)
        //基础表达
        text.setOnClickListener(View.OnClickListener {
        })
        //object 表达匿名内部类对象 （OnClickListener就是一个匿名内部类）
        val clicListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
            }
        }
        //lambda简化OnClickListener匿名内部类
        val clicListener1 = View.OnClickListener {
        }
        text.setOnClickListener(clicListener1)
    }

}

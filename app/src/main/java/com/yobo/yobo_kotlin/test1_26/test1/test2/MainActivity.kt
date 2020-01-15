package com.yobo.yobo_kotlin.test1_26.test1.test2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.yobo.yobo_kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by ZhangBoshi
 * on 2019-12-24
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initView1()
    }
    private fun initView() {
        main_text.text = "我"
        main_text.textSize = 30f
    }
    private fun initView1() {
        val text = findViewById<TextView>(R.id.main_text)
        text.setTextColor(resources.getColor(R.color.colorAccent))
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}
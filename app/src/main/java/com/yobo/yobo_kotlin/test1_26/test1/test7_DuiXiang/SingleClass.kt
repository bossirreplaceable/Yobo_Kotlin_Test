package com.yobo.yobo_kotlin.test1_26.test1.test7_DuiXiang

class SingleClass private constructor() {

    companion object {
        fun get(): SingleClass {
            return Holder.instance
        }
    }

    private object Holder {
        val instance = SingleClass()
    }
}
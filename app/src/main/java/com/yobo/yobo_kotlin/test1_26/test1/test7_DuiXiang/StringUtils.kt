package com.yobo.yobo_kotlin.test1_26.test1.test7_DuiXiang


object OusideUtils {
    fun isEmpty2(str: String): Boolean {
        return "" == str
    }
    @JvmStatic
    fun isEmpty3(str: String): Boolean {
        return "" == str
    }
}

class StringUtils{


    companion object{
        fun isEmpty4(str: String): Boolean {
            return "" == str
        }
        @JvmStatic
        fun isEmpty5(str: String): Boolean {
            return "" == str
        }

    }



    object InsideUtils {
        fun isEmpty(str: String): Boolean {
            return "" == str
        }
        @JvmStatic
        fun isEmpty1(str: String): Boolean {
            return "" == str
        }
    }

}




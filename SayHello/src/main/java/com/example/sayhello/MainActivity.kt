package com.example.sayhello

import android.util.Log


object HelloWord {
    @JvmStatic
    fun main(args: Array<String>) {
        //Main method
    }

    fun printLog(tag: String?, msg: String?) {
        Log.d(tag, msg!!)
    }
}
package com.zzazzu.newfragmentviewpager_201018

import androidx.appcompat.app.AppCompatActivity


abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()


}
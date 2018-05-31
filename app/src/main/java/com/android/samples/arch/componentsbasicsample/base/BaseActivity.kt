package com.android.samples.arch.componentsbasicsample.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
  abstract fun getLayoutResource(): Int

  abstract fun initData()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(getLayoutResource())
    initData()
  }
}
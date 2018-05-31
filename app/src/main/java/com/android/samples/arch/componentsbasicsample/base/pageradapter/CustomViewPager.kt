package com.android.samples.arch.componentsbasicsample.base.pageradapter

import android.content.Context
import android.content.res.TypedArray
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent
import com.android.samples.arch.componentsbasicsample.R


class CustomViewPager : ViewPager {

  var isDisableSmooth = false
  var isDisableSwipe = false

  constructor(context: Context) : super(context)

  constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
    val a: TypedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomViewPager)
    isDisableSmooth = a.getBoolean(R.styleable.CustomViewPager_is_disable_smooth, false)
    isDisableSwipe = a.getBoolean(R.styleable.CustomViewPager_is_disable_swipe, false)
  }

  override fun setCurrentItem(item: Int) {
    super.setCurrentItem(item, !isDisableSmooth)
  }

  override fun onTouchEvent(event: MotionEvent): Boolean {
    return if (!this.isDisableSwipe) {
      super.onTouchEvent(event)
    } else false

  }

  override fun onInterceptTouchEvent(event: MotionEvent): Boolean {
    return if (!this.isDisableSwipe) {
      super.onInterceptTouchEvent(event)
    } else false

  }
}
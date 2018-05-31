package com.android.samples.arch.componentsbasicsample.base.pageradapter

import android.content.Context
import android.support.design.widget.TabLayout
import android.util.AttributeSet
import android.view.View

class CustomTabLayout : TabLayout {

  constructor(context: Context?) : super(context)

  constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

  constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs,
      defStyleAttr)

}
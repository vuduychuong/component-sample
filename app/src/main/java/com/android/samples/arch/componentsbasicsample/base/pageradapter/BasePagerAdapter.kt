package com.android.samples.arch.componentsbasicsample.base.pageradapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class BasePagerAdapter(fragmentManager: FragmentManager,
    private val itemFragmentList: List<ItemFragment>) : FragmentPagerAdapter(fragmentManager) {
  override fun getItem(position: Int): Fragment {
    return itemFragmentList.get(position).fragment
  }

  override fun getCount(): Int {
    return itemFragmentList.size
  }

  override fun getPageTitle(position: Int): CharSequence? {
    return itemFragmentList.get(position).title
  }
}
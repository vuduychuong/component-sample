package com.android.samples.arch.componentsbasicsample.ui.main

import com.android.samples.arch.componentsbasicsample.R
import com.android.samples.arch.componentsbasicsample.base.BaseActivity
import com.android.samples.arch.componentsbasicsample.base.pageradapter.BasePagerAdapter
import com.android.samples.arch.componentsbasicsample.base.pageradapter.ItemFragment
import com.android.samples.arch.componentsbasicsample.ui.home.HomeFragment
import com.android.samples.arch.componentsbasicsample.ui.movies.MoviesFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
  override fun getLayoutResource(): Int {
    return R.layout.activity_main
  }

  override fun initData() {
    setupViewPager()
    setupTabLayout()
  }

  private fun setupViewPager() {
    val itemFragmentList = ArrayList<ItemFragment>()
    itemFragmentList.add(
        ItemFragment(getString(R.string.home_fragment_title), HomeFragment.newInstance()))
    itemFragmentList.add(
        ItemFragment(getString(R.string.movies_fragment_title), MoviesFragment.newInstance()))
    viewPager.setAdapter(BasePagerAdapter(supportFragmentManager, itemFragmentList))
  }

  private fun setupTabLayout() {
    tabLayout.setupWithViewPager(viewPager, true)
  }
}

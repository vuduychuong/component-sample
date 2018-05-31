package com.android.samples.arch.componentsbasicsample.base

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseFragment<K : ViewDataBinding, V : ViewModel> : Fragment() {

  abstract fun getLayoutResource(): Int

  abstract fun initData()

  protected lateinit var mBinding: K
  protected lateinit var mViewModel: V

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?): View? {
    mBinding = DataBindingUtil.inflate(inflater, getLayoutResource(), container, false)
    return mBinding.root
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    initData()
  }
}
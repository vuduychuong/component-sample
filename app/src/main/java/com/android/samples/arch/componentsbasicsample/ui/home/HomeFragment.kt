package com.android.samples.arch.componentsbasicsample.ui.home

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import com.android.samples.arch.componentsbasicsample.AppExecutors
import com.android.samples.arch.componentsbasicsample.R
import com.android.samples.arch.componentsbasicsample.base.BaseFragment
import com.android.samples.arch.componentsbasicsample.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {


  @Inject
  lateinit var appExecutors: AppExecutors

  private lateinit var adapter: HomeAdapter

  override fun getLayoutResource(): Int {
    return R.layout.fragment_home
  }

  override fun initData() {

    mViewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
    mViewModel.data?.observe(this, Observer { data ->
      if (data != null) {
        adapter.submitList(data)
      } else {
        adapter.submitList(emptyList())

      }
    })
    appExecutors = AppExecutors()
    adapter = HomeAdapter(appExecutors) { video ->
      //TODO item onClick
    }
//    recyclerView.adapter = adapter
  }

  companion object {
    fun newInstance(): HomeFragment {
      return HomeFragment()
    }
  }

}

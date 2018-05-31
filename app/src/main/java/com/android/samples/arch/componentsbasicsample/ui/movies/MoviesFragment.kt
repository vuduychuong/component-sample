package com.android.samples.arch.componentsbasicsample.ui.movies

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import com.android.samples.arch.componentsbasicsample.R
import com.android.samples.arch.componentsbasicsample.base.BaseFragment
import com.android.samples.arch.componentsbasicsample.databinding.FragmentMoviesBinding

class MoviesFragment : BaseFragment<FragmentMoviesBinding, MoviesViewModel>() {

  override fun getLayoutResource(): Int {
    return R.layout.fragment_movies
  }

  override fun initData() {
    mViewModel = ViewModelProviders.of(this).get(MoviesViewModel::class.java)
    mViewModel.data?.observe(this, Observer { t ->
      {

      }
    })
  }

  companion object {
    fun newInstance(): MoviesFragment {
      return MoviesFragment()
    }
  }

}

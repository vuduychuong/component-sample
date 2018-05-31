package com.android.samples.arch.componentsbasicsample.ui.home

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.android.samples.arch.componentsbasicsample.datas.model.Video

class HomeViewModel : ViewModel() {
  var data: LiveData<List<Video>>? = null

}
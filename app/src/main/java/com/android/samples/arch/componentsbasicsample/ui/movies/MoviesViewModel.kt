package com.android.samples.arch.componentsbasicsample.ui.movies

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.android.samples.arch.componentsbasicsample.data.model.Video

class MoviesViewModel : ViewModel() {

  var data: LiveData<List<Video>>? = null
}

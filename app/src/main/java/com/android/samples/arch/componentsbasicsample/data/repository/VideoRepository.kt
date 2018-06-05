package com.android.samples.arch.componentsbasicsample.data.repository

import android.arch.lifecycle.LiveData
import com.android.samples.arch.componentsbasicsample.AppExecutors
import com.android.samples.arch.componentsbasicsample.data.api.TheMovieDbService
import com.android.samples.arch.componentsbasicsample.data.api.response.ApiResponse
import com.android.samples.arch.componentsbasicsample.data.model.Resource
import com.android.samples.arch.componentsbasicsample.data.model.Video
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class VideoRepository @Inject constructor(private val appExecutors: AppExecutors,
    private val videoDao: VideoDao, private val theMovieDbService: TheMovieDbService) {
  
  fun loadListPopular(): LiveData<Resource<List<Video>>> {
    return object : NetworkBoundResource<List<Video>, List<Video>>(appExecutors) {
      override fun saveCallResult(item: List<Video>) {
        TODO(
            "not implemented") //To change body of created functions use File | Settings | File Templates.
      }

      override fun shouldFetch(data: List<Video>?): Boolean {
        TODO(
            "not implemented") //To change body of created functions use File | Settings | File Templates.
      }

      override fun loadFromDb(): LiveData<List<Video>> {
        TODO(
            "not implemented") //To change body of created functions use File | Settings | File Templates.
      }

      override fun createCall(): LiveData<ApiResponse<List<Video>>> {
        TODO(
            "not implemented") //To change body of created functions use File | Settings | File Templates.
      }

    }.asLiveData()
  }

}
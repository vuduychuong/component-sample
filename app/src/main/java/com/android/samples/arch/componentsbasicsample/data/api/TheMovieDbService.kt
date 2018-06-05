package com.android.samples.arch.componentsbasicsample.data.api

import android.arch.lifecycle.LiveData
import com.android.samples.arch.componentsbasicsample.data.api.response.ApiResponse
import com.android.samples.arch.componentsbasicsample.data.model.Video
import retrofit2.http.GET


/**
 * REST API access points
 */
interface TheMovieDbService {

  @GET("/movie/popular")
  fun getListPopular(): LiveData<ApiResponse<Video>>
}

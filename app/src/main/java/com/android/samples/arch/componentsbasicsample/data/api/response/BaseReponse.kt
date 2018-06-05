package com.android.samples.arch.componentsbasicsample.data.api.response

import com.google.gson.annotations.SerializedName

class BaseReponse<T>() {
  @SerializedName("page")
  var page: Int? = 0
  @SerializedName("total_results")
  var totalResults: Int? = 0
  @SerializedName("total_pages")
  var totalPages: Int? = 0
  @SerializedName("results")
  var data: T? = null
}
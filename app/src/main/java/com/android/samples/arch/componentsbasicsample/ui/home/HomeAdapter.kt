package com.android.samples.arch.componentsbasicsample.ui.home

import android.databinding.DataBindingUtil
import android.support.v7.util.DiffUtil
import android.view.LayoutInflater
import android.view.ViewGroup
import com.android.samples.arch.componentsbasicsample.AppExecutors
import com.android.samples.arch.componentsbasicsample.R
import com.android.samples.arch.componentsbasicsample.databinding.ItemHomeBinding
import com.android.samples.arch.componentsbasicsample.data.model.Video
import com.android.samples.arch.componentsbasicsample.ui.common.DataBoundListAdapter

class HomeAdapter(
    appExecutors: AppExecutors,
    private val callback: ((Video) -> Unit)?) : DataBoundListAdapter<Video, ItemHomeBinding>(
    appExecutors = appExecutors,
    diffCallback = object : DiffUtil.ItemCallback<Video>() {
      override fun areItemsTheSame(oldItem: Video, newItem: Video): Boolean {
        return oldItem.id == newItem.id
      }

      override fun areContentsTheSame(oldItem: Video, newItem: Video): Boolean {
        return oldItem.id == newItem.id && oldItem.link == newItem.link
      }
    }) {


  override fun createBinding(parent: ViewGroup): ItemHomeBinding {
    val binding = DataBindingUtil.inflate<ItemHomeBinding>(LayoutInflater.from(parent.context),
        R.layout.item_home, parent, false)
    binding.root.setOnClickListener { binding.video?.let { callback } }
    return binding
  }

  override fun bind(binding: ItemHomeBinding, item: Video) {
    binding.video = item
  }

}
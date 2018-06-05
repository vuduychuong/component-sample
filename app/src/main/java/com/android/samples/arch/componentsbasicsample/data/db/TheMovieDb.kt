package com.android.samples.arch.componentsbasicsample.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.android.samples.arch.componentsbasicsample.data.model.Video


@Database(
    entities = [
      Video::class],
    version = 1,
    exportSchema = false)

abstract class TheMovieDb : RoomDatabase() {
  abstract fun videoDao(): VideoDao
}
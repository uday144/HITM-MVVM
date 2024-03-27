package com.hilt.hiltmvvm

import android.app.Application
import com.example.hiltdi.UserRepository
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class HILTApplication : Application()  {

    override fun onCreate() {
        super.onCreate()
    }
}
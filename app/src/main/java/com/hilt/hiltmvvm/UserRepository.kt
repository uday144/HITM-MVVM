package com.example.hiltdi

import android.util.Log
import com.hilt.hiltmvvm.utils.Constants.TAG
import javax.inject.Inject


class UserRepository @Inject constructor() {
    fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in DB")
    }
}
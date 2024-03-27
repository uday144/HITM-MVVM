package com.example.hiltdi

import android.util.Log
import com.hilt.hiltmvvm.utils.Constants.TAG
import javax.inject.Inject


interface UserRepository{
    fun saveUser(email: String, password: String)
}
class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in DB")
    }
}

class FirebaseRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in Firebase")
    }
}
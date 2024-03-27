package com.hilt.hiltmvvm.di

import com.example.hiltdi.FirebaseRepository
import com.example.hiltdi.UserRepository
import com.hilt.hiltmvvm.MainFragment
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class)
@Module
class UserModule {

    @Provides
    fun provideUserRepository() :  UserRepository{
        return FirebaseRepository()
    }
}
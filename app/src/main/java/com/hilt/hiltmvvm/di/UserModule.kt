package com.hilt.hiltmvvm.di

import com.example.hiltdi.FirebaseRepository
import com.example.hiltdi.SQLRepository
import com.example.hiltdi.UserRepository
import com.hilt.hiltmvvm.MainFragment
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
class UserModule {

    @Provides
    @Named("sql")
    fun provideSQLRepository(sqlRepository: SQLRepository) :  UserRepository{
        return sqlRepository
    }

    @Provides
    @Named("firebase")
    fun provideFirebaseRepository() :  UserRepository{
        return FirebaseRepository()
    }

    // OR

/*    @Binds
    abstract fun bindsUserRepository(sqlRepository: SQLRepository) :  UserRepository*/
}
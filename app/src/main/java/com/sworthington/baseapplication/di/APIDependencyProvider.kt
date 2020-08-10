package com.sworthington.baseapplication.di

import com.sworthington.baseapplication.network.EmptyAPI
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
internal object APIDependencyProvider {

    //TODO - add a provides function for any Retrofit APIs in project

    @JvmStatic
    @Provides
    fun provideBaseApi(retrofit: Retrofit): EmptyAPI = retrofit.create(EmptyAPI::class.java)
}
package uz.gita.magazineapp.di

import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

/**
 *   Created by Jamik on 6/16/2023 ot 3:46 PM
 **/
@Module
@InstallIn(SingletonComponent::class)
interface ContextModule {

    @Binds
    fun contextBind(@ApplicationContext context: Context): Context

}
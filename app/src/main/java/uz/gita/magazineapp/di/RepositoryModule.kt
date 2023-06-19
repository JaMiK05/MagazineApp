package uz.gita.magazineapp.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.magazineapp.domain.repositories.authrepository.AuthRepository
import uz.gita.magazineapp.domain.repositories.authrepository.impl.AuthRepositoryImpl
import uz.gita.magazineapp.domain.repositories.datarepository.DataRepository
import uz.gita.magazineapp.domain.repositories.datarepository.impl.DataRepositoryImpl
import javax.inject.Singleton

/**
 *   Created by Jamik on 6/16/2023 ot 3:44 PM
 **/
@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @[Binds Singleton]
    fun authRepositoryBind(impl: AuthRepositoryImpl): AuthRepository

    @[Binds Singleton]
    fun dataRepositoryBind(impl: DataRepositoryImpl): DataRepository

}
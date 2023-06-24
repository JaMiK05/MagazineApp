package uz.gita.magazineapp.di;

import java.lang.System;

/**
 * Created by Jamik on 6/16/2023 ot 3:44 PM
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Luz/gita/magazineapp/di/RepositoryModule;", "", "authRepositoryBind", "Luz/gita/magazineapp/domain/repositories/authrepository/AuthRepository;", "impl", "Luz/gita/magazineapp/domain/repositories/authrepository/impl/AuthRepositoryImpl;", "dataRepositoryBind", "Luz/gita/magazineapp/domain/repositories/datarepository/DataRepository;", "Luz/gita/magazineapp/domain/repositories/datarepository/impl/DataRepositoryImpl;", "app_debug"})
@dagger.Module
public abstract interface RepositoryModule {
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.magazineapp.domain.repositories.authrepository.AuthRepository authRepositoryBind(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.domain.repositories.authrepository.impl.AuthRepositoryImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Binds
    public abstract uz.gita.magazineapp.domain.repositories.datarepository.DataRepository dataRepositoryBind(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.domain.repositories.datarepository.impl.DataRepositoryImpl impl);
}
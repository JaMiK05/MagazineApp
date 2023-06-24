package uz.gita.magazineapp.di;

import java.lang.System;

/**
 * Created by Jamik on 6/16/2023 ot 3:46 PM
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Luz/gita/magazineapp/di/ContextModule;", "", "contextBind", "Landroid/content/Context;", "context", "app_debug"})
@dagger.Module
public abstract interface ContextModule {
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract android.content.Context contextBind(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context);
}
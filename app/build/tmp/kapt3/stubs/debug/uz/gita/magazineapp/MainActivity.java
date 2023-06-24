package uz.gita.magazineapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Luz/gita/magazineapp/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "authRepository", "Luz/gita/magazineapp/domain/repositories/authrepository/AuthRepository;", "getAuthRepository", "()Luz/gita/magazineapp/domain/repositories/authrepository/AuthRepository;", "setAuthRepository", "(Luz/gita/magazineapp/domain/repositories/authrepository/AuthRepository;)V", "navigationHandler", "Luz/gita/magazineapp/util/navigation/NavigationHandler;", "getNavigationHandler", "()Luz/gita/magazineapp/util/navigation/NavigationHandler;", "setNavigationHandler", "(Luz/gita/magazineapp/util/navigation/NavigationHandler;)V", "getScreen", "Lcafe/adriel/voyager/androidx/AndroidScreen;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MainActivity extends androidx.activity.ComponentActivity {
    @javax.inject.Inject
    public uz.gita.magazineapp.util.navigation.NavigationHandler navigationHandler;
    @javax.inject.Inject
    public uz.gita.magazineapp.domain.repositories.authrepository.AuthRepository authRepository;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final uz.gita.magazineapp.util.navigation.NavigationHandler getNavigationHandler() {
        return null;
    }
    
    public final void setNavigationHandler(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.util.navigation.NavigationHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final uz.gita.magazineapp.domain.repositories.authrepository.AuthRepository getAuthRepository() {
        return null;
    }
    
    public final void setAuthRepository(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.domain.repositories.authrepository.AuthRepository p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final cafe.adriel.voyager.androidx.AndroidScreen getScreen() {
        return null;
    }
}
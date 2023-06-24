package uz.gita.magazineapp.presentation.screens.signup;

import java.lang.System;

/**
 * Created by Jamik on 6/16/2023 ot 7:35 PM
 */
@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Luz/gita/magazineapp/presentation/screens/signup/SignUpScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/magazineapp/presentation/screens/signup/SignUpScreenContract$ViewModel;", "authRepository", "Luz/gita/magazineapp/domain/repositories/authrepository/AuthRepository;", "direction", "Luz/gita/magazineapp/presentation/screens/signup/SignUpDirection;", "(Luz/gita/magazineapp/domain/repositories/authrepository/AuthRepository;Luz/gita/magazineapp/presentation/screens/signup/SignUpDirection;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "onEventDispatcher", "", "intent", "Luz/gita/magazineapp/presentation/screens/signup/SignUpScreenContract$Intent;", "saveUser", "email", "", "password", "app_debug"})
public final class SignUpScreenViewModel extends androidx.lifecycle.ViewModel implements uz.gita.magazineapp.presentation.screens.signup.SignUpScreenContract.ViewModel {
    private final uz.gita.magazineapp.domain.repositories.authrepository.AuthRepository authRepository = null;
    private final uz.gita.magazineapp.presentation.screens.signup.SignUpDirection direction = null;
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    @javax.inject.Inject
    public android.content.Context context;
    
    @javax.inject.Inject
    public SignUpScreenViewModel(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.domain.repositories.authrepository.AuthRepository authRepository, @org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.signup.SignUpDirection direction) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    @java.lang.Override
    public void onEventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.signup.SignUpScreenContract.Intent intent) {
    }
    
    private final void saveUser(java.lang.String email, java.lang.String password) {
    }
}
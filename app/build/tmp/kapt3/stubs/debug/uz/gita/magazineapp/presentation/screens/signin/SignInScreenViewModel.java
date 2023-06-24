package uz.gita.magazineapp.presentation.screens.signin;

import java.lang.System;

/**
 * Created by Jamik on 6/16/2023 ot 6:10 PM
 */
@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Luz/gita/magazineapp/presentation/screens/signin/SignInScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$ViewModel;", "direction", "Luz/gita/magazineapp/presentation/screens/signin/SignInDirection;", "authRepository", "Luz/gita/magazineapp/domain/repositories/authrepository/AuthRepository;", "(Luz/gita/magazineapp/presentation/screens/signin/SignInDirection;Luz/gita/magazineapp/domain/repositories/authrepository/AuthRepository;)V", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$UiState;", "getUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "onEventDispatcher", "", "intent", "Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$Intent;", "saveUser", "email", "", "password", "app_debug"})
public final class SignInScreenViewModel extends androidx.lifecycle.ViewModel implements uz.gita.magazineapp.presentation.screens.signin.SignInScreenContract.ViewModel {
    private final uz.gita.magazineapp.presentation.screens.signin.SignInDirection direction = null;
    private final uz.gita.magazineapp.domain.repositories.authrepository.AuthRepository authRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<uz.gita.magazineapp.presentation.screens.signin.SignInScreenContract.UiState> uiState = null;
    
    @javax.inject.Inject
    public SignInScreenViewModel(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.signin.SignInDirection direction, @org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.domain.repositories.authrepository.AuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.MutableStateFlow<uz.gita.magazineapp.presentation.screens.signin.SignInScreenContract.UiState> getUiState() {
        return null;
    }
    
    @java.lang.Override
    public void onEventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.signin.SignInScreenContract.Intent intent) {
    }
    
    private final void saveUser(java.lang.String email, java.lang.String password) {
    }
}
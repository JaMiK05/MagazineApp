package uz.gita.magazineapp.presentation.screens.accountscreen;

import java.lang.System;

/**
 * Created by Jamik on 6/16/2023 ot 3:58 PM
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Luz/gita/magazineapp/presentation/screens/accountscreen/AccountScreenContract;", "", "Intent", "ViewModel", "app_debug"})
public abstract interface AccountScreenContract {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Luz/gita/magazineapp/presentation/screens/accountscreen/AccountScreenContract$Intent;", "", "Back", "OpenLoginScreen", "OpenSignUpScreen", "Luz/gita/magazineapp/presentation/screens/accountscreen/AccountScreenContract$Intent$Back;", "Luz/gita/magazineapp/presentation/screens/accountscreen/AccountScreenContract$Intent$OpenLoginScreen;", "Luz/gita/magazineapp/presentation/screens/accountscreen/AccountScreenContract$Intent$OpenSignUpScreen;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/magazineapp/presentation/screens/accountscreen/AccountScreenContract$Intent$Back;", "Luz/gita/magazineapp/presentation/screens/accountscreen/AccountScreenContract$Intent;", "()V", "app_debug"})
        public static final class Back implements uz.gita.magazineapp.presentation.screens.accountscreen.AccountScreenContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.magazineapp.presentation.screens.accountscreen.AccountScreenContract.Intent.Back INSTANCE = null;
            
            private Back() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/magazineapp/presentation/screens/accountscreen/AccountScreenContract$Intent$OpenLoginScreen;", "Luz/gita/magazineapp/presentation/screens/accountscreen/AccountScreenContract$Intent;", "()V", "app_debug"})
        public static final class OpenLoginScreen implements uz.gita.magazineapp.presentation.screens.accountscreen.AccountScreenContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.magazineapp.presentation.screens.accountscreen.AccountScreenContract.Intent.OpenLoginScreen INSTANCE = null;
            
            private OpenLoginScreen() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/magazineapp/presentation/screens/accountscreen/AccountScreenContract$Intent$OpenSignUpScreen;", "Luz/gita/magazineapp/presentation/screens/accountscreen/AccountScreenContract$Intent;", "()V", "app_debug"})
        public static final class OpenSignUpScreen implements uz.gita.magazineapp.presentation.screens.accountscreen.AccountScreenContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.magazineapp.presentation.screens.accountscreen.AccountScreenContract.Intent.OpenSignUpScreen INSTANCE = null;
            
            private OpenSignUpScreen() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Luz/gita/magazineapp/presentation/screens/accountscreen/AccountScreenContract$ViewModel;", "", "onEventDispatcher", "", "intent", "Luz/gita/magazineapp/presentation/screens/accountscreen/AccountScreenContract$Intent;", "app_debug"})
    public static abstract interface ViewModel {
        
        public abstract void onEventDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.magazineapp.presentation.screens.accountscreen.AccountScreenContract.Intent intent);
    }
}
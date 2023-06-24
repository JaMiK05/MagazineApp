package uz.gita.magazineapp.presentation.screens.signin;

import java.lang.System;

/**
 * Created by Jamik on 6/16/2023 ot 6:04 PM
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract;", "", "Intent", "UiState", "ViewModel", "app_debug"})
public abstract interface SignInScreenContract {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$Intent;", "", "Back", "LogInUser", "OpenSHopScreen", "ProgressBar", "Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$Intent$Back;", "Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$Intent$LogInUser;", "Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$Intent$OpenSHopScreen;", "Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$Intent$ProgressBar;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$Intent$Back;", "Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$Intent;", "()V", "app_debug"})
        public static final class Back implements uz.gita.magazineapp.presentation.screens.signin.SignInScreenContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.magazineapp.presentation.screens.signin.SignInScreenContract.Intent.Back INSTANCE = null;
            
            private Back() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$Intent$OpenSHopScreen;", "Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$Intent;", "()V", "app_debug"})
        public static final class OpenSHopScreen implements uz.gita.magazineapp.presentation.screens.signin.SignInScreenContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.magazineapp.presentation.screens.signin.SignInScreenContract.Intent.OpenSHopScreen INSTANCE = null;
            
            private OpenSHopScreen() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$Intent$LogInUser;", "Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$Intent;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPassword", "app_debug"})
        public static final class LogInUser implements uz.gita.magazineapp.presentation.screens.signin.SignInScreenContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String email = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String password = null;
            
            public LogInUser(@org.jetbrains.annotations.NotNull
            java.lang.String email, @org.jetbrains.annotations.NotNull
            java.lang.String password) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getEmail() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getPassword() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$Intent$ProgressBar;", "Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$Intent;", "bool", "", "(Z)V", "getBool", "()Z", "app_debug"})
        public static final class ProgressBar implements uz.gita.magazineapp.presentation.screens.signin.SignInScreenContract.Intent {
            private final boolean bool = false;
            
            public ProgressBar(boolean bool) {
                super();
            }
            
            public final boolean getBool() {
                return false;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0010"}, d2 = {"Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$UiState;", "", "bool", "", "(Z)V", "getBool", "()Z", "setBool", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class UiState {
        private boolean bool;
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.magazineapp.presentation.screens.signin.SignInScreenContract.UiState copy(boolean bool) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public UiState() {
            super();
        }
        
        public UiState(boolean bool) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean getBool() {
            return false;
        }
        
        public final void setBool(boolean p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$ViewModel;", "", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$UiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEventDispatcher", "", "intent", "Luz/gita/magazineapp/presentation/screens/signin/SignInScreenContract$Intent;", "app_debug"})
    public static abstract interface ViewModel {
        
        @org.jetbrains.annotations.NotNull
        public abstract kotlinx.coroutines.flow.StateFlow<uz.gita.magazineapp.presentation.screens.signin.SignInScreenContract.UiState> getUiState();
        
        public abstract void onEventDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.magazineapp.presentation.screens.signin.SignInScreenContract.Intent intent);
    }
}
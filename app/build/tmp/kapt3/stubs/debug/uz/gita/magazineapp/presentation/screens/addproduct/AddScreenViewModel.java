package uz.gita.magazineapp.presentation.screens.addproduct;

import java.lang.System;

/**
 * Created by Jamik on 6/17/2023 ot 12:54 AM
 */
@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$ViewModel;", "repository", "Luz/gita/magazineapp/domain/repositories/datarepository/DataRepository;", "direction", "Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenDirection;", "(Luz/gita/magazineapp/domain/repositories/datarepository/DataRepository;Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenDirection;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$UiState;", "getUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "onEventDispatcher", "", "intent", "Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$Intent;", "app_debug"})
public final class AddScreenViewModel extends androidx.lifecycle.ViewModel implements uz.gita.magazineapp.presentation.screens.addproduct.AddScreenContract.ViewModel {
    private final uz.gita.magazineapp.domain.repositories.datarepository.DataRepository repository = null;
    private final uz.gita.magazineapp.presentation.screens.addproduct.AddScreenDirection direction = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<uz.gita.magazineapp.presentation.screens.addproduct.AddScreenContract.UiState> uiState = null;
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    @javax.inject.Inject
    public android.content.Context context;
    
    @javax.inject.Inject
    public AddScreenViewModel(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.domain.repositories.datarepository.DataRepository repository, @org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.addproduct.AddScreenDirection direction) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.MutableStateFlow<uz.gita.magazineapp.presentation.screens.addproduct.AddScreenContract.UiState> getUiState() {
        return null;
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
    uz.gita.magazineapp.presentation.screens.addproduct.AddScreenContract.Intent intent) {
    }
}
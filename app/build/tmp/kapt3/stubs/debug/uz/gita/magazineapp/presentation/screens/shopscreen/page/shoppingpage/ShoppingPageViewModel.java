package uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage;

import java.lang.System;

/**
 * Created by Jamik on 6/19/2023 ot 2:19 PM
 */
@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Luz/gita/magazineapp/presentation/screens/shopscreen/page/shoppingpage/ShoppingPageViewModel;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/magazineapp/presentation/screens/shopscreen/page/shoppingpage/ShoppingPageContract$ViewModel;", "direction", "Luz/gita/magazineapp/presentation/screens/shopscreen/page/shoppingpage/ShoppingPageDirection;", "repository", "Luz/gita/magazineapp/domain/repositories/datarepository/DataRepository;", "(Luz/gita/magazineapp/presentation/screens/shopscreen/page/shoppingpage/ShoppingPageDirection;Luz/gita/magazineapp/domain/repositories/datarepository/DataRepository;)V", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Luz/gita/magazineapp/presentation/screens/shopscreen/page/shoppingpage/ShoppingPageContract$UiState;", "getUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "onEventDispatcher", "", "intent", "Luz/gita/magazineapp/presentation/screens/shopscreen/page/shoppingpage/ShoppingPageContract$Intent;", "app_debug"})
public final class ShoppingPageViewModel extends androidx.lifecycle.ViewModel implements uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage.ShoppingPageContract.ViewModel {
    private final uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage.ShoppingPageDirection direction = null;
    private final uz.gita.magazineapp.domain.repositories.datarepository.DataRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage.ShoppingPageContract.UiState> uiState = null;
    
    @javax.inject.Inject
    public ShoppingPageViewModel(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage.ShoppingPageDirection direction, @org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.domain.repositories.datarepository.DataRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.MutableStateFlow<uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage.ShoppingPageContract.UiState> getUiState() {
        return null;
    }
    
    @java.lang.Override
    public void onEventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage.ShoppingPageContract.Intent intent) {
    }
}
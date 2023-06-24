package uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage;

import java.lang.System;

/**
 * Created by Jamik on 6/18/2023 ot 3:56 PM
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Luz/gita/magazineapp/presentation/screens/shopscreen/page/shoppingpage/ShoppingPageContract;", "", "Intent", "UiState", "ViewModel", "app_debug"})
public abstract interface ShoppingPageContract {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Luz/gita/magazineapp/presentation/screens/shopscreen/page/shoppingpage/ShoppingPageContract$Intent;", "", "Add", "Luz/gita/magazineapp/presentation/screens/shopscreen/page/shoppingpage/ShoppingPageContract$Intent$Add;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/magazineapp/presentation/screens/shopscreen/page/shoppingpage/ShoppingPageContract$Intent$Add;", "Luz/gita/magazineapp/presentation/screens/shopscreen/page/shoppingpage/ShoppingPageContract$Intent;", "()V", "app_debug"})
        public static final class Add implements uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage.ShoppingPageContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage.ShoppingPageContract.Intent.Add INSTANCE = null;
            
            private Add() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Luz/gita/magazineapp/presentation/screens/shopscreen/page/shoppingpage/ShoppingPageContract$UiState;", "", "myProduct", "", "Luz/gita/magazineapp/data/model/ProductData;", "(Ljava/util/List;)V", "getMyProduct", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class UiState {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<uz.gita.magazineapp.data.model.ProductData> myProduct = null;
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage.ShoppingPageContract.UiState copy(@org.jetbrains.annotations.NotNull
        java.util.List<uz.gita.magazineapp.data.model.ProductData> myProduct) {
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
        
        public UiState(@org.jetbrains.annotations.NotNull
        java.util.List<uz.gita.magazineapp.data.model.ProductData> myProduct) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<uz.gita.magazineapp.data.model.ProductData> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<uz.gita.magazineapp.data.model.ProductData> getMyProduct() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Luz/gita/magazineapp/presentation/screens/shopscreen/page/shoppingpage/ShoppingPageContract$ViewModel;", "", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Luz/gita/magazineapp/presentation/screens/shopscreen/page/shoppingpage/ShoppingPageContract$UiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEventDispatcher", "", "intent", "Luz/gita/magazineapp/presentation/screens/shopscreen/page/shoppingpage/ShoppingPageContract$Intent;", "app_debug"})
    public static abstract interface ViewModel {
        
        @org.jetbrains.annotations.NotNull
        public abstract kotlinx.coroutines.flow.StateFlow<uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage.ShoppingPageContract.UiState> getUiState();
        
        public abstract void onEventDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage.ShoppingPageContract.Intent intent);
    }
}
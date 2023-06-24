package uz.gita.magazineapp.presentation.screens.addproduct;

import java.lang.System;

/**
 * Created by Jamik on 6/16/2023 ot 11:46 PM
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract;", "", "Intent", "UiState", "ViewModel", "app_debug"})
public abstract interface AddScreenContract {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$Intent;", "", "AddCategory", "AddToBack", "Back", "Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$Intent$AddCategory;", "Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$Intent$AddToBack;", "Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$Intent$Back;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$Intent$Back;", "Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$Intent;", "()V", "app_debug"})
        public static final class Back implements uz.gita.magazineapp.presentation.screens.addproduct.AddScreenContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.magazineapp.presentation.screens.addproduct.AddScreenContract.Intent.Back INSTANCE = null;
            
            private Back() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$Intent$AddCategory;", "Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$Intent;", "()V", "app_debug"})
        public static final class AddCategory implements uz.gita.magazineapp.presentation.screens.addproduct.AddScreenContract.Intent {
            @org.jetbrains.annotations.NotNull
            public static final uz.gita.magazineapp.presentation.screens.addproduct.AddScreenContract.Intent.AddCategory INSTANCE = null;
            
            private AddCategory() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$Intent$AddToBack;", "Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$Intent;", "productData", "Luz/gita/magazineapp/data/model/ProductData;", "(Luz/gita/magazineapp/data/model/ProductData;)V", "getProductData", "()Luz/gita/magazineapp/data/model/ProductData;", "app_debug"})
        public static final class AddToBack implements uz.gita.magazineapp.presentation.screens.addproduct.AddScreenContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final uz.gita.magazineapp.data.model.ProductData productData = null;
            
            public AddToBack(@org.jetbrains.annotations.NotNull
            uz.gita.magazineapp.data.model.ProductData productData) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.magazineapp.data.model.ProductData getProductData() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$UiState;", "", "list", "", "Luz/gita/magazineapp/data/model/CategoryData;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class UiState {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<uz.gita.magazineapp.data.model.CategoryData> list = null;
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.magazineapp.presentation.screens.addproduct.AddScreenContract.UiState copy(@org.jetbrains.annotations.NotNull
        java.util.List<uz.gita.magazineapp.data.model.CategoryData> list) {
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
        java.util.List<uz.gita.magazineapp.data.model.CategoryData> list) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<uz.gita.magazineapp.data.model.CategoryData> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<uz.gita.magazineapp.data.model.CategoryData> getList() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$ViewModel;", "", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$UiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEventDispatcher", "", "intent", "Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$Intent;", "app_debug"})
    public static abstract interface ViewModel {
        
        @org.jetbrains.annotations.NotNull
        public abstract kotlinx.coroutines.flow.StateFlow<uz.gita.magazineapp.presentation.screens.addproduct.AddScreenContract.UiState> getUiState();
        
        public abstract void onEventDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.magazineapp.presentation.screens.addproduct.AddScreenContract.Intent intent);
    }
}
package uz.gita.magazineapp.presentation.screens.addcategories;

import java.lang.System;

/**
 * Created by Jamik on 6/16/2023 ot 10:38 pM
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Luz/gita/magazineapp/presentation/screens/addcategories/AddCategoryContract;", "", "Intent", "ViewModel", "app_debug"})
public abstract interface AddCategoryContract {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Luz/gita/magazineapp/presentation/screens/addcategories/AddCategoryContract$Intent;", "", "AddToBack", "Luz/gita/magazineapp/presentation/screens/addcategories/AddCategoryContract$Intent$AddToBack;", "app_debug"})
    public static abstract interface Intent {
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Luz/gita/magazineapp/presentation/screens/addcategories/AddCategoryContract$Intent$AddToBack;", "Luz/gita/magazineapp/presentation/screens/addcategories/AddCategoryContract$Intent;", "categoryData", "Luz/gita/magazineapp/data/model/CategoryData;", "(Luz/gita/magazineapp/data/model/CategoryData;)V", "getCategoryData", "()Luz/gita/magazineapp/data/model/CategoryData;", "app_debug"})
        public static final class AddToBack implements uz.gita.magazineapp.presentation.screens.addcategories.AddCategoryContract.Intent {
            @org.jetbrains.annotations.NotNull
            private final uz.gita.magazineapp.data.model.CategoryData categoryData = null;
            
            public AddToBack(@org.jetbrains.annotations.NotNull
            uz.gita.magazineapp.data.model.CategoryData categoryData) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final uz.gita.magazineapp.data.model.CategoryData getCategoryData() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Luz/gita/magazineapp/presentation/screens/addcategories/AddCategoryContract$ViewModel;", "", "onEventDispatcher", "", "intent", "Luz/gita/magazineapp/presentation/screens/addcategories/AddCategoryContract$Intent;", "app_debug"})
    public static abstract interface ViewModel {
        
        public abstract void onEventDispatcher(@org.jetbrains.annotations.NotNull
        uz.gita.magazineapp.presentation.screens.addcategories.AddCategoryContract.Intent intent);
    }
}
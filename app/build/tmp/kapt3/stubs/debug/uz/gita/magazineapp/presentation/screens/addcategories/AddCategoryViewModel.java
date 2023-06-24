package uz.gita.magazineapp.presentation.screens.addcategories;

import java.lang.System;

/**
 * Created by Jamik on 6/17/2023 ot 7:39 AM
 */
@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Luz/gita/magazineapp/presentation/screens/addcategories/AddCategoryViewModel;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/magazineapp/presentation/screens/addcategories/AddCategoryContract$ViewModel;", "repository", "Luz/gita/magazineapp/domain/repositories/datarepository/DataRepository;", "direction", "Luz/gita/magazineapp/presentation/screens/addcategories/AddCategoryDirection;", "(Luz/gita/magazineapp/domain/repositories/datarepository/DataRepository;Luz/gita/magazineapp/presentation/screens/addcategories/AddCategoryDirection;)V", "onEventDispatcher", "", "intent", "Luz/gita/magazineapp/presentation/screens/addcategories/AddCategoryContract$Intent;", "app_debug"})
public final class AddCategoryViewModel extends androidx.lifecycle.ViewModel implements uz.gita.magazineapp.presentation.screens.addcategories.AddCategoryContract.ViewModel {
    private final uz.gita.magazineapp.domain.repositories.datarepository.DataRepository repository = null;
    private final uz.gita.magazineapp.presentation.screens.addcategories.AddCategoryDirection direction = null;
    
    @javax.inject.Inject
    public AddCategoryViewModel(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.domain.repositories.datarepository.DataRepository repository, @org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.addcategories.AddCategoryDirection direction) {
        super();
    }
    
    @java.lang.Override
    public void onEventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.presentation.screens.addcategories.AddCategoryContract.Intent intent) {
    }
}
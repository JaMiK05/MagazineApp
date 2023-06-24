package uz.gita.magazineapp.presentation.screens.addproduct;

import java.lang.System;

/**
 * Created by Jamik on 6/16/2023 ot 11:41 PM
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0011H\u0003J\b\u0010\u0013\u001a\u00020\fH\u0017J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0003R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Luz/gita/magazineapp/presentation/screens/addproduct/AddProductScreen;", "Lcafe/adriel/voyager/androidx/AndroidScreen;", "()V", "category", "", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "shared", "Luz/gita/magazineapp/data/local/MyShared;", "AddContent", "", "uiState", "Landroidx/compose/runtime/State;", "Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$UiState;", "eventDispatcher", "Lkotlin/Function1;", "Luz/gita/magazineapp/presentation/screens/addproduct/AddScreenContract$Intent;", "Content", "Item", "data", "Luz/gita/magazineapp/data/model/CategoryData;", "app_debug"})
public final class AddProductScreen extends cafe.adriel.voyager.androidx.AndroidScreen {
    public java.lang.String category;
    private final uz.gita.magazineapp.data.local.MyShared shared = null;
    
    public AddProductScreen() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    @java.lang.Override
    public void Content() {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    private final void AddContent(androidx.compose.runtime.State<uz.gita.magazineapp.presentation.screens.addproduct.AddScreenContract.UiState> uiState, kotlin.jvm.functions.Function1<? super uz.gita.magazineapp.presentation.screens.addproduct.AddScreenContract.Intent, kotlin.Unit> eventDispatcher) {
    }
    
    @androidx.compose.runtime.Composable
    private final void Item(uz.gita.magazineapp.data.model.CategoryData data) {
    }
}
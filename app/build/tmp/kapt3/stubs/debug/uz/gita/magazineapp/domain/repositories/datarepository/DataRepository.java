package uz.gita.magazineapp.domain.repositories.datarepository;

import java.lang.System;

/**
 * Created by Jamik on 6/16/2023 ot 9:06 PM
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00f8\u0001\u0000J\u001f\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\t\u001a\u00020\nH&\u00f8\u0001\u0000J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H&J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u0003H&J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u0003H&J\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH&J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u00032\u0006\u0010\u0014\u001a\u00020\u0005H&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Luz/gita/magazineapp/domain/repositories/datarepository/DataRepository;", "", "addCategory", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "category", "Luz/gita/magazineapp/data/model/CategoryData;", "addProduct", "product", "Luz/gita/magazineapp/data/model/ProductData;", "addProductTOCategory", "productId", "categoryId", "getALlProducts", "", "getAllCategories", "getProducts", "list", "myProducts", "userid", "app_debug"})
public abstract interface DataRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.lang.String> addProductTOCategory(@org.jetbrains.annotations.NotNull
    java.lang.String productId, @org.jetbrains.annotations.NotNull
    java.lang.String categoryId);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.magazineapp.data.model.CategoryData>> getAllCategories();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.magazineapp.data.model.ProductData>> getProducts(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> list);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.magazineapp.data.model.ProductData>> getALlProducts();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.magazineapp.data.model.ProductData>> myProducts(@org.jetbrains.annotations.NotNull
    java.lang.String userid);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> addProduct(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.data.model.ProductData product);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> addCategory(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.data.model.CategoryData category);
}
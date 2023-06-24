package uz.gita.magazineapp.domain.repositories.datarepository.impl;

import java.lang.System;

/**
 * Created by Jamik on 6/16/2023 ot 9:07 PM
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016\u00f8\u0001\u0000J\u001f\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\f\u001a\u00020\rH\u0016\u00f8\u0001\u0000J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00120\u0006H\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120\u0006H\u0016J\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00120\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0016J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00120\u00062\u0006\u0010\u0017\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Luz/gita/magazineapp/domain/repositories/datarepository/impl/DataRepositoryImpl;", "Luz/gita/magazineapp/domain/repositories/datarepository/DataRepository;", "()V", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "addCategory", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "category", "Luz/gita/magazineapp/data/model/CategoryData;", "addProduct", "product", "Luz/gita/magazineapp/data/model/ProductData;", "addProductTOCategory", "productId", "categoryId", "getALlProducts", "", "getAllCategories", "getProducts", "list", "myProducts", "userid", "app_debug"})
public final class DataRepositoryImpl implements uz.gita.magazineapp.domain.repositories.datarepository.DataRepository {
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    
    @javax.inject.Inject
    public DataRepositoryImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.lang.String> addProductTOCategory(@org.jetbrains.annotations.NotNull
    java.lang.String productId, @org.jetbrains.annotations.NotNull
    java.lang.String categoryId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.magazineapp.data.model.CategoryData>> getAllCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.magazineapp.data.model.ProductData>> getProducts(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> list) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.magazineapp.data.model.ProductData>> getALlProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<uz.gita.magazineapp.data.model.ProductData>> myProducts(@org.jetbrains.annotations.NotNull
    java.lang.String userid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> addProduct(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.data.model.ProductData product) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> addCategory(@org.jetbrains.annotations.NotNull
    uz.gita.magazineapp.data.model.CategoryData category) {
        return null;
    }
}
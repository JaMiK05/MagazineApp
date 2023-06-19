package uz.gita.magazineapp.domain.repositories.datarepository

import kotlinx.coroutines.flow.Flow
import uz.gita.magazineapp.data.model.CategoryData
import uz.gita.magazineapp.data.model.ProductData

/**
 *   Created by Jamik on 6/16/2023 ot 9:06 PM
 **/
interface DataRepository {

    fun addProductTOCategory(productId: String, categoryId: String): Flow<String>

    fun getAllCategories(): Flow<List<CategoryData>>

    fun getProducts(list: List<String>): Flow<List<ProductData>>

    fun getALlProducts(): Flow<List<ProductData>>

    fun myProducts(userid: String): Flow<List<ProductData>>

    fun addProduct(product: ProductData): Flow<Result<String>>

    fun addCategory(category: CategoryData): Flow<Result<String>>

}
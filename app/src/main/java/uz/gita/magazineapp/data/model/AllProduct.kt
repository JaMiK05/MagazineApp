package uz.gita.magazineapp.data.model

/**
 *   Created by Jamik on 6/16/2023 ot 10:58 PM
 **/
data class AllProduct(
    val categoryData: CategoryData,
    val list: List<ProductData> = emptyList(),
)

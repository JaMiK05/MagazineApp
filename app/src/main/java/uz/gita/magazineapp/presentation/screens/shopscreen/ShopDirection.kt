package uz.gita.magazineapp.presentation.screens.shopscreen

import uz.gita.magazineapp.presentation.screens.addproduct.AddProductScreen
import uz.gita.magazineapp.util.navigation.AppNavigator
import javax.inject.Inject

/**
 *   Created by Jamik on 6/17/2023 ot 1:08 AM
 **/
interface ShopDirection {
    suspend fun addProduct()
}

class ShopDirectionImpl @Inject constructor(
    private val navigator: AppNavigator,
) : ShopDirection {
    override suspend fun addProduct() {
        navigator.navigateTo(AddProductScreen())
    }

}
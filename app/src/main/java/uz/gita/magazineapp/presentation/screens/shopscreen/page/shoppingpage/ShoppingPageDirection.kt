package uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage

import uz.gita.magazineapp.presentation.screens.addproduct.AddProductScreen
import uz.gita.magazineapp.presentation.screens.shopscreen.page.homepage.HomePageDirection
import uz.gita.magazineapp.util.navigation.AppNavigator
import javax.inject.Inject

/**
 *   Created by Jamik on 6/19/2023 ot 2:17 PM
 **/
interface ShoppingPageDirection {
    suspend fun addProduct()
}

class ShoppingPageDirectionImpl @Inject constructor(
    private val navigator: AppNavigator,
) : ShoppingPageDirection {
    override suspend fun addProduct() {
        navigator.navigateTo(AddProductScreen())
    }
}
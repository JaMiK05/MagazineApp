package uz.gita.magazineapp.presentation.screens.shopscreen.page.homepage

import uz.gita.magazineapp.presentation.screens.addproduct.AddProductScreen
import uz.gita.magazineapp.presentation.screens.shopscreen.ShopDirection
import uz.gita.magazineapp.util.navigation.AppNavigator
import javax.inject.Inject

/**
 *   Created by Jamik on 6/18/2023 ot 11:01 AM
 **/
interface HomePageDirection {
    suspend fun addProduct()
}

class HomePageDirectionImpl @Inject constructor(
    private val navigator: AppNavigator,
) : HomePageDirection {
    override suspend fun addProduct() {
        navigator.navigateTo(AddProductScreen())
    }
}
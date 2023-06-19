package uz.gita.magazineapp.presentation.screens.signup

import uz.gita.magazineapp.presentation.screens.shopscreen.ShopScreen
import uz.gita.magazineapp.util.navigation.AppNavigator
import javax.inject.Inject

/**
 *   Created by Jamik on 6/16/2023 ot 7:36 PM
 **/
interface SignUpDirection {
    suspend fun back()
    suspend fun openShopScreen()
}

class SignUpDirectionImpl @Inject constructor(
    private val navigator: AppNavigator,
) : SignUpDirection {
    override suspend fun back() {
        navigator.back()
    }

    override suspend fun openShopScreen() {
        navigator.replaceAll(ShopScreen())
    }


}
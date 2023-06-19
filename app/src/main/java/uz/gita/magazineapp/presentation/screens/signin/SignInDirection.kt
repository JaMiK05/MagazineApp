package uz.gita.magazineapp.presentation.screens.signin

import uz.gita.magazineapp.presentation.screens.shopscreen.ShopScreen
import uz.gita.magazineapp.util.navigation.AppNavigator
import javax.inject.Inject

/**
 *   Created by Jamik on 6/16/2023 ot 6:01 PM
 **/
interface SignInDirection {
    suspend fun back()
    suspend fun openShopScreen()
}

class SignInDirectionImpl @Inject constructor(
    private val navigator: AppNavigator,
) : SignInDirection {
    override suspend fun back() {
        navigator.back()
    }

    override suspend fun openShopScreen() {
        navigator.replaceAll(ShopScreen())
    }

}
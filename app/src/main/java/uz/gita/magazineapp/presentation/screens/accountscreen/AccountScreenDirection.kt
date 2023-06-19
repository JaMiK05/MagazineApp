package uz.gita.magazineapp.presentation.screens.accountscreen

import uz.gita.magazineapp.presentation.screens.signin.SigninScreen
import uz.gita.magazineapp.presentation.screens.signup.SignUpScreen
import uz.gita.magazineapp.util.navigation.AppNavigator
import javax.inject.Inject

/**
 *   Created by Jamik on 6/16/2023 ot 3:59 PM
 **/
interface AccountScreenDirection {
    suspend fun backScreen()
    suspend fun openLogInScreen()
    suspend fun openSignUpScreen()
}

class AccountScreenDirectionImpl @Inject constructor(
    private val navigator: AppNavigator,
) : AccountScreenDirection {

    override suspend fun backScreen() {
        navigator.back()
    }

    override suspend fun openLogInScreen() {
        navigator.navigateTo(SigninScreen())
    }

    override suspend fun openSignUpScreen() {
        navigator.replaceAll(SignUpScreen())
    }

}
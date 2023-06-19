package uz.gita.magazineapp.presentation.screens.onboarding

import uz.gita.magazineapp.presentation.screens.accountscreen.AccountScreen
import uz.gita.magazineapp.util.navigation.AppNavigator
import javax.inject.Inject

/**
 *   Created by Jamik on 6/16/2023 ot 4:59 PM
 **/
interface OnBoardingDirection {
    suspend fun openAccountScreen()
}

class OnBoardingDirectionIMpl @Inject constructor(
    private val navigator: AppNavigator,
) : OnBoardingDirection {
    override suspend fun openAccountScreen() {
        navigator.navigateTo(AccountScreen())
    }

}
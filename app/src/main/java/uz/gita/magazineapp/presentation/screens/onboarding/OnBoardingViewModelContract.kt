package uz.gita.magazineapp.presentation.screens.onboarding

/**
 *   Created by Jamik on 6/16/2023 ot 5:10 PM
 **/
interface OnBoardingViewModelContract {

    sealed interface Intent {
        object OpenAccountScreen : Intent
    }

    interface ViewModel {
        fun onEventDispatcher(intent: Intent)
    }

}
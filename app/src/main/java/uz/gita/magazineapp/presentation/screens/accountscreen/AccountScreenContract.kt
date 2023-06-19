package uz.gita.magazineapp.presentation.screens.accountscreen


/**
 *   Created by Jamik on 6/16/2023 ot 3:58 PM
 **/
interface AccountScreenContract {

    sealed interface Intent {
        object Back : Intent
        object OpenLoginScreen : Intent
        object OpenSignUpScreen : Intent
    }

    interface ViewModel {
        fun onEventDispatcher(intent: Intent)
    }

}
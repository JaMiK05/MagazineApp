package uz.gita.magazineapp.presentation.screens.signup

/**
 *   Created by Jamik on 6/16/2023 ot 7:32 PM
 **/
interface SignUpScreenContract {


    sealed interface Intent {
        data class CreateUser(val email: String, val password: String) : Intent
        object Back : Intent
    }

    interface ViewModel {
        fun onEventDispatcher(intent: Intent)
    }

}
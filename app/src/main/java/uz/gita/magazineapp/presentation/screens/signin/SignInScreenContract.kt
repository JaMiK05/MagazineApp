package uz.gita.magazineapp.presentation.screens.signin

import kotlinx.coroutines.flow.StateFlow


/**
 *   Created by Jamik on 6/16/2023 ot 6:04 PM
 **/
interface SignInScreenContract {

    sealed interface Intent {
        object Back : Intent
        object OpenSHopScreen : Intent
        class LogInUser(val email: String, val password: String) : Intent
        class ProgressBar(val bool: Boolean) : Intent
    }

    data class UiState(
        var bool: Boolean = false,
    )

    interface ViewModel {
        val uiState: StateFlow<UiState>

        fun onEventDispatcher(intent: Intent)

    }

}
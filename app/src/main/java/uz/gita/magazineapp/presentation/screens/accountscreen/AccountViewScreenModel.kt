package uz.gita.magazineapp.presentation.screens.accountscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 *   Created by Jamik on 6/16/2023 ot 4:03 PM
 **/
@HiltViewModel
class AccountViewScreenModel @Inject constructor(
    private val direction: AccountScreenDirection,
) : ViewModel(), AccountScreenContract.ViewModel {

    override fun onEventDispatcher(intent: AccountScreenContract.Intent) {

        when (intent) {
            is AccountScreenContract.Intent.Back -> {
                viewModelScope.launch {
                    direction.backScreen()
                }
            }

            is AccountScreenContract.Intent.OpenLoginScreen -> {
                viewModelScope.launch {
                    direction.openLogInScreen()
                }
            }

            is AccountScreenContract.Intent.OpenSignUpScreen -> {
                viewModelScope.launch {
                    direction.openSignUpScreen()
                }
            }
        }

    }
}
package uz.gita.magazineapp.presentation.screens.signin

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import uz.gita.magazineapp.data.local.MyShared
import uz.gita.magazineapp.domain.repositories.authrepository.AuthRepository
import uz.gita.magazineapp.domain.repositories.authrepository.impl.user
import uz.gita.magazineapp.util.myLog
import javax.inject.Inject

/**
 *   Created by Jamik on 6/16/2023 ot 6:10 PM
 **/

@HiltViewModel
class SignInScreenViewModel @Inject constructor(
    private val direction: SignInDirection,
    private val authRepository: AuthRepository,
) : ViewModel(), SignInScreenContract.ViewModel {

    override val uiState = MutableStateFlow(SignInScreenContract.UiState())

    override fun onEventDispatcher(intent: SignInScreenContract.Intent) {

        when (intent) {

            is SignInScreenContract.Intent.Back -> {
                viewModelScope.launch {
                    direction.back()
                }
            }

            is SignInScreenContract.Intent.ProgressBar -> {
                uiState.update { it.copy(bool = intent.bool) }
            }

            is SignInScreenContract.Intent.OpenSHopScreen -> {
                viewModelScope.launch {
                    direction.openShopScreen()
                }
            }

            is SignInScreenContract.Intent.LogInUser -> {
                authRepository.logIn(intent.email, intent.password).onEach {
                    it.onSuccess {
                        saveUser(intent.email, intent.password)
                        onEventDispatcher(SignInScreenContract.Intent.OpenSHopScreen)
                    }
                    it.onFailure {
                        onEventDispatcher(SignInScreenContract.Intent.ProgressBar(false))
                    }
                }.launchIn(viewModelScope)
            }

        }

    }

    private fun saveUser(email: String, password: String) {
        val shared = MyShared.getShared()
        shared.saveUser(email, password)
    }


}
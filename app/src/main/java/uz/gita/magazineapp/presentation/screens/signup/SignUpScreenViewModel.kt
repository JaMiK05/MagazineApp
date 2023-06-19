package uz.gita.magazineapp.presentation.screens.signup

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import uz.gita.magazineapp.data.local.MyShared
import uz.gita.magazineapp.domain.repositories.authrepository.AuthRepository
import uz.gita.magazineapp.domain.repositories.authrepository.impl.user
import uz.gita.magazineapp.util.myLog
import javax.inject.Inject

/**
 *   Created by Jamik on 6/16/2023 ot 7:35 PM
 **/

@HiltViewModel
class SignUpScreenViewModel @Inject constructor(
    private val authRepository: AuthRepository,
    private val direction: SignUpDirection,
) : ViewModel(), SignUpScreenContract.ViewModel {

    @SuppressLint("StaticFieldLeak")
    @Inject
    lateinit var context: Context

    override fun onEventDispatcher(intent: SignUpScreenContract.Intent) {
        when (intent) {

            is SignUpScreenContract.Intent.Back -> {
                viewModelScope.launch {
                    direction.back()
                }
            }

            is SignUpScreenContract.Intent.CreateUser -> {
                authRepository.createUser(intent.email, intent.password).onEach {
                    it.onSuccess {
                        saveUser(intent.email, intent.password)
                        direction.openShopScreen()
                    }
                    it.onFailure { it ->
                        Toast.makeText(
                            context,
                            it.message,
                            Toast.LENGTH_SHORT
                        ).show()
                        myLog("not create user sign up fail")
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
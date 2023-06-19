package uz.gita.magazineapp.presentation.screens.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import uz.gita.magazineapp.util.myLog
import javax.inject.Inject

/**
 *   Created by Jamik on 6/16/2023 ot 5:09 PM
 **/

@HiltViewModel
class OnBoardingViewModel @Inject constructor(
    private val direction: OnBoardingDirection,
) : ViewModel(), OnBoardingViewModelContract.ViewModel {

    override fun onEventDispatcher(intent: OnBoardingViewModelContract.Intent) {

        when (intent) {
            is OnBoardingViewModelContract.Intent.OpenAccountScreen -> {
                viewModelScope.launch {
                    myLog("dipatcherio")
                    direction.openAccountScreen()
                }
            }
        }

    }


}
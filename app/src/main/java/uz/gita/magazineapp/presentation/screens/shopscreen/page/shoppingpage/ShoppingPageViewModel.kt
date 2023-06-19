package uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import uz.gita.magazineapp.data.local.MyShared
import uz.gita.magazineapp.data.model.AllProduct
import uz.gita.magazineapp.data.model.CategoryData
import uz.gita.magazineapp.domain.repositories.datarepository.DataRepository
import javax.inject.Inject

/**
 *   Created by Jamik on 6/19/2023 ot 2:19 PM
 **/
@HiltViewModel
class ShoppingPageViewModel @Inject constructor(
    private val direction: ShoppingPageDirection,
    private val repository: DataRepository,
) : ViewModel(), ShoppingPageContract.ViewModel {
    override val uiState = MutableStateFlow(ShoppingPageContract.UiState())

    init {
        val shared = MyShared.getShared()
        val email = shared.getEmail()
        repository.myProducts(email.toString()).onEach { list ->
            uiState.update { it.copy(myProduct = list) }
        }.launchIn(viewModelScope)
    }

    override fun onEventDispatcher(intent: ShoppingPageContract.Intent) {
        when (intent) {
            is ShoppingPageContract.Intent.Add -> {
                viewModelScope.launch {
                    direction.addProduct()
                }
            }
        }
    }
}
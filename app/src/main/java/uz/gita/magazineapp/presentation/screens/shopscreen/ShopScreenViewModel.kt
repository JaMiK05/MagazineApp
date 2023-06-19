package uz.gita.magazineapp.presentation.screens.shopscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import uz.gita.magazineapp.data.local.MyShared
import uz.gita.magazineapp.data.model.AllProduct
import uz.gita.magazineapp.data.model.ProductData
import uz.gita.magazineapp.domain.repositories.datarepository.DataRepository
import uz.gita.magazineapp.util.myLog
import javax.inject.Inject

/**
 *   Created by Jamik on 6/16/2023 ot 10:46 PM
 **/
@HiltViewModel
class ShopScreenViewModel @Inject constructor(
    private val repository: DataRepository,
    private val direction: ShopDirection,
) : ViewModel(), ShopScreenContract.ViewModel {
    override val uiState = MutableStateFlow(ShopScreenContract.UiState())

    override fun onEventDispatcher(intent: ShopScreenContract.Intent) {

        when (intent) {
            is ShopScreenContract.Intent.Add -> {
                viewModelScope.launch {
                    direction.addProduct()
                }
            }

            is ShopScreenContract.Intent.GetData -> {
            }
        }

    }
}
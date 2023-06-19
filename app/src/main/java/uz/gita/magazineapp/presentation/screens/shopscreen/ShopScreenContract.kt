package uz.gita.magazineapp.presentation.screens.shopscreen

import kotlinx.coroutines.flow.StateFlow
import uz.gita.magazineapp.data.model.AllProduct
import uz.gita.magazineapp.data.model.CategoryData
import uz.gita.magazineapp.data.model.ProductData
import uz.gita.magazineapp.presentation.screens.signin.SignInScreenContract

/**
 *   Created by Jamik on 6/16/2023 ot 10:43 PM
 **/
interface ShopScreenContract {

    sealed interface Intent {
        object Add : Intent
        object GetData : Intent
    }

    data class UiState(
        val myProduct: List<ProductData> = emptyList(),
        val allProduct: List<AllProduct> = emptyList(),
    )

    interface ViewModel {
        val uiState: StateFlow<UiState>

        fun onEventDispatcher(intent: Intent)


    }

}
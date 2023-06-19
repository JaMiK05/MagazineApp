package uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage

import kotlinx.coroutines.flow.StateFlow
import uz.gita.magazineapp.data.model.ProductData

/**
 *   Created by Jamik on 6/18/2023 ot 3:56 PM
 **/
interface ShoppingPageContract {

    sealed interface Intent {
        object Add : Intent
    }

    data class UiState(
        val myProduct: List<ProductData> = emptyList(),
    )

    interface ViewModel {
        val uiState: StateFlow<UiState>
        fun onEventDispatcher(intent: Intent)
    }

}
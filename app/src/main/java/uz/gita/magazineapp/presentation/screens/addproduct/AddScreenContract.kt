package uz.gita.magazineapp.presentation.screens.addproduct

import kotlinx.coroutines.flow.StateFlow
import uz.gita.magazineapp.data.model.CategoryData
import uz.gita.magazineapp.data.model.ProductData
import uz.gita.magazineapp.presentation.screens.shopscreen.ShopScreenContract

/**
 *   Created by Jamik on 6/16/2023 ot 11:46 PM
 **/
interface AddScreenContract {

    sealed interface Intent {
        object Back : Intent
        object AddCategory : Intent
        class AddToBack(val productData: ProductData) : Intent
    }

    data class UiState(
        val list: List<CategoryData> = emptyList(),
    )

    interface ViewModel {
        val uiState: StateFlow<UiState>
        fun onEventDispatcher(intent: Intent)
    }

}
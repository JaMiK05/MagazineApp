package uz.gita.magazineapp.presentation.screens.shopscreen.page.homepage

import kotlinx.coroutines.flow.StateFlow
import uz.gita.magazineapp.data.model.AllProduct
import uz.gita.magazineapp.data.model.CategoryData

/**
 *   Created by Jamik on 6/18/2023 ot 10:58 AM
 **/
interface HomePageContract {


    sealed interface Intent {
        object Add : Intent
    }

    data class UiState(
        val allProductAndCategory: List<AllProduct> = emptyList(),
        val allProduct: AllProduct = AllProduct(CategoryData("id", "null", arrayListOf())),
    )

    interface ViewModel {
        val uiState: StateFlow<UiState>
        fun onEventDispatcher(intent: Intent)
    }

}
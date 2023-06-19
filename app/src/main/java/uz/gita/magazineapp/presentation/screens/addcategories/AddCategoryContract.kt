package uz.gita.magazineapp.presentation.screens.addcategories

import kotlinx.coroutines.flow.StateFlow
import uz.gita.magazineapp.data.model.CategoryData
import uz.gita.magazineapp.data.model.ProductData

/**
 *   Created by Jamik on 6/16/2023 ot 10:38 pM
 **/
interface AddCategoryContract {

    sealed interface Intent {
        class AddToBack(val categoryData: CategoryData) : Intent
    }

    interface ViewModel {
        fun onEventDispatcher(intent: Intent)
    }
}
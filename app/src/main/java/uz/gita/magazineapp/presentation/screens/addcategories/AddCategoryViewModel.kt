package uz.gita.magazineapp.presentation.screens.addcategories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.magazineapp.domain.repositories.datarepository.DataRepository
import javax.inject.Inject

/**
 *   Created by Jamik on 6/17/2023 ot 7:39 AM
 **/
@HiltViewModel
class AddCategoryViewModel @Inject constructor(
    private val repository: DataRepository,
    private val direction: AddCategoryDirection,
) : ViewModel(), AddCategoryContract.ViewModel {
    override fun onEventDispatcher(intent: AddCategoryContract.Intent) {
        when (intent) {
            is AddCategoryContract.Intent.AddToBack -> {
                repository.addCategory(intent.categoryData).onEach {
                    direction.back()
                }.launchIn(viewModelScope)
            }
        }
    }
}
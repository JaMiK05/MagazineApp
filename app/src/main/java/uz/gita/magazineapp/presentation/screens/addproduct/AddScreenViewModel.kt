package uz.gita.magazineapp.presentation.screens.addproduct

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import uz.gita.magazineapp.domain.repositories.datarepository.DataRepository
import uz.gita.magazineapp.util.myLog
import javax.inject.Inject

/**
 *   Created by Jamik on 6/17/2023 ot 12:54 AM
 **/
@HiltViewModel
class AddScreenViewModel @Inject constructor(
    private val repository: DataRepository,
    private val direction: AddScreenDirection,
) : ViewModel(), AddScreenContract.ViewModel {
    override val uiState = MutableStateFlow(AddScreenContract.UiState())

    @SuppressLint("StaticFieldLeak")
    @Inject
    lateinit var context: Context

    init {
        repository.getAllCategories()
            .onEach { list ->
                myLog(list.size.toString())
                uiState.update { it.copy(list = list) }
            }.launchIn(viewModelScope)
    }

    override fun onEventDispatcher(intent: AddScreenContract.Intent) {

        when (intent) {

            is AddScreenContract.Intent.AddCategory -> {
                viewModelScope.launch {
                    direction.addCategory()
                }
            }

            is AddScreenContract.Intent.Back -> {
                viewModelScope.launch {
                    direction.back()
                }
            }

            is AddScreenContract.Intent.AddToBack -> {
                val product = intent.productData
                repository.addProduct(product).onEach { result ->
                    result.onSuccess {
                        repository.addProductTOCategory(product.id, product.category)
                            .launchIn(viewModelScope)
                        direction.back()
                    }
                    result.onFailure {
                        Toast.makeText(context, it.message, Toast.LENGTH_SHORT).show()
                    }
                }.launchIn(viewModelScope)
            }
        }

    }
}
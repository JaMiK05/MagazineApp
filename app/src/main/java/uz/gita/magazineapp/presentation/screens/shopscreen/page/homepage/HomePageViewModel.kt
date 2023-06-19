package uz.gita.magazineapp.presentation.screens.shopscreen.page.homepage

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import uz.gita.magazineapp.data.model.AllProduct
import uz.gita.magazineapp.data.model.CategoryData
import uz.gita.magazineapp.domain.repositories.datarepository.DataRepository
import uz.gita.magazineapp.util.myLog
import javax.inject.Inject

/**
 *   Created by Jamik on 6/18/2023 ot 10:59 AM
 **/
@HiltViewModel
class HomePageViewModel @Inject constructor(
    private val repository: DataRepository,
    private val direction: HomePageDirection,
) : ViewModel(), HomePageContract.ViewModel {

    override val uiState = MutableStateFlow(HomePageContract.UiState())


    init {
        repository.getAllCategories().onEach { categoryList ->
            val alList = ArrayList<AllProduct>()
            categoryList.forEach { category1 ->
                myLog(category1.name)
                repository.getProducts(category1.products).onEach { productList ->
                    val alPRoduct = AllProduct(
                        categoryData = category1,
                        list = productList
                    )
                    if (!alList.contains(alPRoduct)) {
                        alList.add(alPRoduct)
                    }
                    myLog(alList.size.toString())
                    uiState.update { it.copy(allProductAndCategory = alList) }
                }.launchIn(viewModelScope)
            }
        }.launchIn(viewModelScope)

        repository.getALlProducts().onEach { list ->
            val category = CategoryData(
                "id",
                "All",
                arrayListOf()
            )
            val data = AllProduct(
                category,
                list
            )
            uiState.update { it.copy(allProduct = data) }
        }.launchIn(viewModelScope)


    }

    override fun onEventDispatcher(intent: HomePageContract.Intent) {
        when (intent) {
            is HomePageContract.Intent.Add -> {
                viewModelScope.launch {
                    direction.addProduct()
                }
            }
        }
    }


}
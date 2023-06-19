package uz.gita.magazineapp.presentation.screens.addproduct

import uz.gita.magazineapp.presentation.screens.addcategories.AddCategoriesScreen
import uz.gita.magazineapp.util.navigation.AppNavigator
import javax.inject.Inject

/**
 *   Created by Jamik on 6/16/2023 ot 11:42 PM
 **/
interface AddScreenDirection {

    suspend fun back()

    suspend fun addCategory()

}

class AddScreenDirectionImpl @Inject constructor(
    private val navigator: AppNavigator,
) : AddScreenDirection {
    override suspend fun back() {
        navigator.back()
    }

    override suspend fun addCategory() {
        navigator.navigateTo(AddCategoriesScreen())
    }


}
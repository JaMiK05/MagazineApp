package uz.gita.magazineapp.presentation.screens.addcategories

import uz.gita.magazineapp.util.navigation.AppNavigator
import javax.inject.Inject

/**
 *   Created by Jamik on 6/16/2023 ot 11:10 PM
 **/
interface AddCategoryDirection {
    suspend fun back()
}

class AddCategoryDirectionIMpl @Inject constructor(
    private val navigator: AppNavigator,
) : AddCategoryDirection {
    override suspend fun back() {
        navigator.back()
    }


}
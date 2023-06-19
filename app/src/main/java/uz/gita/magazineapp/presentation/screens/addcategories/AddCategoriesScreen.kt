package uz.gita.magazineapp.presentation.screens.addcategories

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.hilt.getViewModel
import uz.gita.magazineapp.data.model.CategoryData
import uz.gita.magazineapp.data.model.ProductData
import uz.gita.magazineapp.presentation.screens.addproduct.AddScreenContract

/**
 *   Created by Jamik on 6/16/2023 ot 11:30 PM
 **/
class AddCategoriesScreen : AndroidScreen() {

    @Composable
    override fun Content() {
        val viewModel: AddCategoryContract.ViewModel = getViewModel<AddCategoryViewModel>()
        AddContent(eventDispatcher = viewModel::onEventDispatcher)
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun AddContent(
        eventDispatcher: (AddCategoryContract.Intent) -> Unit,
    ) {
        var nameinput by remember { mutableStateOf("") }
        Surface(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .align(Alignment.Center), horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Add Category", style = MaterialTheme.typography.displayMedium)
                    Text(
                        modifier = Modifier.fillMaxWidth(1f), text = "Name"
                    )
                    Spacer(modifier = Modifier.padding(4.dp))
                    TextField(modifier = Modifier.fillMaxWidth(),
                        value = nameinput,
                        onValueChange = {
                            nameinput = it
                        },
                        colors = TextFieldDefaults.textFieldColors(
                            disabledTextColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent
                        ),
                        placeholder = { Text(text = "Catefory name", color = Color.Gray) },
                        singleLine = true,
                        shape = RoundedCornerShape(16.dp),
                        leadingIcon = {})
                    Spacer(modifier = Modifier.padding(8.dp))
                    Button(modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 56.dp), onClick = {

                        val product = CategoryData(
                            nameinput + "id",
                            nameinput,
                            ArrayList()
                        )
                        eventDispatcher(AddCategoryContract.Intent.AddToBack(categoryData = product))
                    }) {
                        Text(text = "Add Production")
                    }
                }
            }
        }
    }

}
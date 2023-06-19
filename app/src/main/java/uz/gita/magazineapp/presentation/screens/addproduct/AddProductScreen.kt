package uz.gita.magazineapp.presentation.screens.addproduct

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.hilt.getViewModel
import uz.gita.magazineapp.data.local.MyShared
import uz.gita.magazineapp.data.model.CategoryData
import uz.gita.magazineapp.data.model.ProductData

/**
 *   Created by Jamik on 6/16/2023 ot 11:41 PM
 **/
class AddProductScreen : AndroidScreen() {

    lateinit var category: String
    private val shared = MyShared.getShared()


    @Preview
    @Composable
    override fun Content() {
        val viewModel: AddScreenContract.ViewModel = getViewModel<AddScreenViewModel>()
        val uiState = viewModel.uiState.collectAsState()
        AddContent(uiState, viewModel::onEventDispatcher)
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun AddContent(
        uiState: State<AddScreenContract.UiState>,
        eventDispatcher: (AddScreenContract.Intent) -> Unit,
    ) {
        var nameinput by remember { mutableStateOf("") }
        var priceinput by remember { mutableStateOf("") }
        var description by remember { mutableStateOf("") }
        category = if (uiState.value.list.isNotEmpty()) uiState.value.list[0].id else "ovqatlar"
        Surface(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .align(Alignment.Center), horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Add Product", style = MaterialTheme.typography.displayMedium)
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
                        placeholder = { Text(text = "Product name", color = Color.Gray) },
                        singleLine = true,
                        shape = RoundedCornerShape(16.dp),
                        leadingIcon = {})
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        modifier = Modifier.fillMaxWidth(1f), text = "Price"
                    )
                    Spacer(modifier = Modifier.padding(8.dp))
                    TextField(modifier = Modifier.fillMaxWidth(),
                        value = priceinput,
                        onValueChange = {
                            priceinput = it
                        },
                        colors = TextFieldDefaults.textFieldColors(
                            disabledTextColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent
                        ),
                        placeholder = { Text(text = "price 15$", color = Color.Gray) },
                        singleLine = true,
                        shape = RoundedCornerShape(16.dp),
                        leadingIcon = {}


                    )
                    Spacer(modifier = Modifier.padding(8.dp))
                    Text(
                        modifier = Modifier.fillMaxWidth(1f), text = "Description"
                    )
                    Spacer(modifier = Modifier.padding(8.dp))
                    TextField(modifier = Modifier.fillMaxWidth(),
                        value = description,
                        onValueChange = {
                            description = it
                        },
                        colors = TextFieldDefaults.textFieldColors(
                            disabledTextColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent
                        ),
                        placeholder = { Text(text = "description", color = Color.Gray) },
                        singleLine = true,
                        shape = RoundedCornerShape(16.dp),
                        leadingIcon = {}


                    )
                    Spacer(modifier = Modifier.padding(8.dp))

                    LazyRow(content = {
                        items(uiState.value.list) {
                            Item(data = it)
                            Spacer(modifier = Modifier.width(10.dp))
                        }
                        item {
                            Button(modifier = Modifier
                                .width(200.dp)
                                .height(50.dp), onClick = {
                                eventDispatcher(AddScreenContract.Intent.AddCategory)
                            }) {
                                Text(
                                    modifier = Modifier.fillMaxSize(), text = "add categoories"
                                )
                            }
                        }

                    })

                    Spacer(modifier = Modifier.padding(8.dp))
                    Button(modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 56.dp), onClick = {
                        if (nameinput.length < 4 || priceinput.length < 2 || description.isEmpty()) {
                            return@Button
                        }

                        val product = ProductData(
                            nameinput + "id",
                            shared.getEmail().toString(),
                            nameinput,
                            priceinput,
                            description,
                            category
                        )
                        eventDispatcher(AddScreenContract.Intent.AddToBack(productData = product))
                    }) {
                        Text(text = "Add Production")
                    }
                }
                TextButton(modifier = Modifier.align(Alignment.BottomCenter), onClick = {
                    eventDispatcher(AddScreenContract.Intent.Back)
                }) {
                    Text(
                        text = "back",
                        style = MaterialTheme.typography.labelMedium,

                        )
                }
            }
        }
    }


    @Composable
    private fun Item(data: CategoryData) {
        Button(modifier = Modifier
            .width(150.dp)
            .height(50.dp), onClick = {
            category = data.id
        }) {
            Text(
                modifier = Modifier.fillMaxSize(), text = data.name
            )
        }
    }

}
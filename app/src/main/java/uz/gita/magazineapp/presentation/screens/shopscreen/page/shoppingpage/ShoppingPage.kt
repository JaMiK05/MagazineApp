package uz.gita.magazineapp.presentation.screens.shopscreen.page.shoppingpage

import android.annotation.SuppressLint
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.hilt.getViewModel
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import uz.gita.magazineapp.R
import uz.gita.magazineapp.presentation.componenta.ProductItem

/**
 *   Created by Jamik on 6/17/2023 ot 9:00 AM
 **/
class ShoppingPage : Tab {
    override val options: TabOptions
        @Composable get() {
            val title = "Shopping"
            val icon = rememberVectorPainter(Icons.Default.ShoppingCart)

            return remember {
                TabOptions(
                    index = 1u, title = title, icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        val viewModel: ShoppingPageContract.ViewModel = getViewModel<ShoppingPageViewModel>()
        val uistate = viewModel.uiState.collectAsState()
        ShoppingContent(uistate, viewModel::onEventDispatcher)
    }

    @Composable
    fun ShoppingContent(
        uiState: State<ShoppingPageContract.UiState>,
        onEvenDispatcher: (ShoppingPageContract.Intent) -> Unit,
    ) {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier.background(Color(0xFFF8F8F8))
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Image(
                        modifier = Modifier
                            .size(50.dp)
                            .padding(start = 20.dp)
                            .clickable {
                            },
                        painter = painterResource(id = R.drawable.three_line),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "My Products",
                        modifier = Modifier,
                        fontSize = 32.sp
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Image(
                        modifier = Modifier
                            .size(70.dp)
                            .padding(end = 20.dp)
                            .clickable {
                                run {
                                    /* profil oynaga otish */
                                }
                            },
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = null
                    )

                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                ) {
                    if (uiState.value.myProduct.isEmpty()) {
                        Image(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .fillMaxSize()
                                .padding(50.dp ),
                            painter = painterResource(id = R.drawable.empty_list),
                            contentDescription = "Empty"
                        )
                    }
                    LazyColumn(modifier = Modifier, content = {
                        itemsIndexed(uiState.value.myProduct) { index, item ->
                            ProductItem(item)
                            if (index != uiState.value.myProduct.size - 1) Spacer(
                                modifier = Modifier.size(
                                    8.dp
                                )
                            )
                        }
                    })

                }
                Button(modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .padding(start = 50.dp, top = 20.dp, end = 50.dp),
                    onClick = {
                        onEvenDispatcher.invoke(ShoppingPageContract.Intent.Add)
                    }) {
                    Text(text = "Add Product", fontSize = 22.sp)
                }
            }

        }

    }

    @SuppressLint("UnrememberedMutableState")
    @Preview
    @Composable
    private fun PrevContent() {
        ShoppingContent(uiState =mutableStateOf(ShoppingPageContract.UiState()) ){}
    }
}

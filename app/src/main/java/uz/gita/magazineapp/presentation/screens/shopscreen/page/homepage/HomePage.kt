package uz.gita.magazineapp.presentation.screens.shopscreen.page.homepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.hilt.getViewModel
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import uz.gita.magazineapp.R
import uz.gita.magazineapp.presentation.componenta.ItemHome

/**
 *   Created by Jamik on 6/17/2023 ot 8:47 AM
 **/
class HomePage : Tab {
    override val options: TabOptions
        @Composable get() {
            val title = "Home"
            val icon = rememberVectorPainter(image = Icons.Default.Home)

            return remember {
                TabOptions(
                    index = 0u, title, icon
                )
            }
        }

    @Composable
    override fun Content() {
        val viewModel: HomePageContract.ViewModel = getViewModel<HomePageViewModel>()
        val uiState = viewModel.uiState.collectAsState()
        HomeContent(uiState = uiState)
    }


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun HomeContent(
        uiState: State<HomePageContract.UiState>,
    ) {

        var searchInput by remember { mutableStateOf("") }


        Surface(modifier = Modifier) {
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
                            .clickable {},
                        painter = painterResource(id = R.drawable.three_line),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Image(
                        modifier = Modifier
                            .size(70.dp)
                            .padding(end = 20.dp)
                            .clickable {
                                run {
                                    //onEvenDispatcher(ShoppingBagContract.Intent.Back)
                                }
                            },
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = null
                    )

                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp, top = 25.dp, end = 30.dp),
                ) {
                    TextField(modifier = Modifier.fillMaxWidth(),
                        value = searchInput,
                        onValueChange = {
                            searchInput = it
                        },
                        colors = TextFieldDefaults.textFieldColors(
                            disabledTextColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent
                        ),
                        placeholder = { Text(text = "Search", color = Color.Gray) },
                        singleLine = true,
                        shape = RoundedCornerShape(16.dp),
                        leadingIcon = {
                            Icon(imageVector = Icons.Default.Search, contentDescription = null)
                        })
                }

                LazyColumn(modifier = Modifier.padding(top = 20.dp), content = {

                    item {
                        ItemHome(data = uiState.value.allProduct!!)
                    }
                    items(uiState.value.allProductAndCategory) { item ->
                        ItemHome(data = item)
                    }

                })
            }

        }
    }

}
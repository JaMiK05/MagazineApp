package uz.gita.magazineapp.presentation.componenta

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.gita.magazineapp.R
import uz.gita.magazineapp.data.model.AllProduct
import uz.gita.magazineapp.data.model.CategoryData
import uz.gita.magazineapp.data.model.ProductData

/**
 *   Created by Jamik on 6/18/2023 ot 8:24 AM
 **/

@Composable
fun ProductItem(
    data: ProductData,
) {
    Card(elevation = CardDefaults.cardElevation(), modifier = Modifier.padding(12.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
        ) {
            Image(
                modifier = Modifier
                    .size(150.dp)
                    .padding(5.dp),
                painter = painterResource(id = R.drawable.dairy_products),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .width(250.dp),
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Row() {
                    Text(
                        text = data.name.uppercase(),
                        color = Color.Black,
                        fontSize = 28.sp,
                        fontWeight = FontWeight(900),
                        modifier = Modifier
                            .width(0.dp)
                            .weight(1f, true)
                            .padding(end = 8.dp)
                    )
                }

                Text(
                    modifier = Modifier, text = data.description, maxLines = 4, fontSize = 14.sp
                )

                Row(
                    modifier = Modifier.weight(1f), verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = ("Price : " + data.price.lowercase()),
                        color = Color.Blue,
                        fontSize = 14.sp,
                        fontWeight = FontWeight(900),
                        modifier = Modifier
                            .width(0.dp)
                            .weight(1f, true)
                            .padding(end = 8.dp)
                    )
                }
                Row(modifier = Modifier.weight(1f), verticalAlignment = Alignment.Bottom) {
                    Text(
                        text = ("Category : " + data.category.substring(
                            0, data.category.length - 2
                        ).uppercase()),
                        color = Color.Magenta,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(900),
                        modifier = Modifier
                            .width(0.dp)
                            .weight(1f, true)
                            .padding(bottom = 8.dp)
                    )
                }
            }
        }

    }
}


@Composable
fun ItemHome(data: AllProduct) {
    Column(Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = data.categoryData.name,
                color = Color.Black,
                fontSize = 28.sp,
                fontWeight = FontWeight(900),
                modifier = Modifier
                    .padding(start = 25.dp, top = 20.dp, bottom = 15.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Image(
                modifier = Modifier
                    .size(70.dp)
                    .padding(end = 20.dp, top = 20.dp, bottom = 15.dp),
                painter = painterResource(id = R.drawable.menu),
                contentDescription = null
            )
        }
        LazyRow(modifier = Modifier.fillMaxWidth(), content = {
            items(data.list) {
                HomeProduct(it)
            }
        })
    }
}

@Composable
fun HomeProduct(data: ProductData) {

    Column(
        modifier = Modifier
            .width(220.dp)
            .padding(15.dp)
    ) {

        Card(elevation = CardDefaults.cardElevation()) {
            Image(
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
                    .padding(5.dp),
                painter = painterResource(id = R.drawable.dairy_products),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
        Text(
            text = data.price.uppercase(),
            color = Color.Black,
            fontSize = 28.sp,
            fontWeight = FontWeight(900),
            modifier = Modifier
                .padding(top = 8.dp)
        )
        Text(
            text = (data.name.uppercase() + " : " + data.description.lowercase()),
            color = Color.DarkGray,
            maxLines = 3,
            fontSize = 18.sp,
            fontWeight = FontWeight(700),
            modifier = Modifier
                .padding(top = 8.dp)
        )

    }

}


@Preview
@Composable
fun ItemPrev() {

    val product = ProductData(
        "shorvaid", "jamik@gmail.com", "shorva", "25000", "suyuq ovqat va juda mazali", "ovqatlarid"
    )

    val list = ArrayList<ProductData>()
    list.add(product)
    list.add(product)
    list.add(product)
    list.add(product)

    val category = CategoryData(
        "id", "palov", arrayListOf()
    )

    val data = AllProduct(
        category, list
    )
    Surface(modifier = Modifier.fillMaxSize()) {
        Column() {
            ItemHome(data = data)
            //   HomeProduct(product)
        }
    }

}
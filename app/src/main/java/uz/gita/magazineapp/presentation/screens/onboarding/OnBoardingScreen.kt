package uz.gita.magazineapp.presentation.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.hilt.getViewModel
import uz.gita.magazineapp.R
import uz.gita.magazineapp.util.myLog


class OnBoardingScreen : AndroidScreen() {


    @Preview
    @Composable
    override fun Content() {
        val viewModel: OnBoardingViewModelContract.ViewModel = getViewModel<OnBoardingViewModel>()
        ContentOnboarding(viewModel::onEventDispatcher)
    }
}

@Composable
fun ContentOnboarding(
    onEvenDispatcher: (OnBoardingViewModelContract.Intent) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEEF1F4))
    ) {
        Spacer(modifier = Modifier.height(200.dp))
        Image(
            painterResource(R.drawable.marketlogo),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        )
        Text(
            modifier = Modifier.padding(55.dp, 36.dp, 52.dp),
            text = "Lorem ipsum dolor sit, consectetur",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            modifier = Modifier.padding(46.dp, 16.dp, 43.dp),
            text = "Lorem ipsum dolor sit amet, consectetur  adipiscin adipiscing elit.",
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal
        )
        Button(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(90.dp, 50.dp, 90.dp),
            onClick = {
                myLog("click")
                onEvenDispatcher(OnBoardingViewModelContract.Intent.OpenAccountScreen)
            }) {
            Text(text = "START")
        }
    }

}
package uz.gita.magazineapp.presentation.screens.accountscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.hilt.getViewModel
import uz.gita.magazineapp.R
import uz.gita.magazineapp.presentation.screens.onboarding.OnBoardingViewModelContract
import uz.gita.magazineapp.ui.theme.MagazineAppTheme

/**
 *   Created by Jamik on 6/16/2023 ot 3:54 PM
 **/
class AccountScreen : AndroidScreen() {

    @Preview
    @Composable
    override fun Content() {
        val viewModel: AccountScreenContract.ViewModel = getViewModel<AccountViewScreenModel>()
        AccountContent(viewModel::onEventDispatcher)
    }

    @Composable
    private fun AccountContent(
        onEvenDispatcher: (AccountScreenContract.Intent) -> Unit,
    ) {

        Column() {

            Row(
                modifier = Modifier.fillMaxWidth(),
            ) {

                Image(
                    modifier = Modifier
                        .size(70.dp)
                        .padding(top = 30.dp)
                        .padding(start = 20.dp)
                        .clickable {
                            run {
                                onEvenDispatcher(AccountScreenContract.Intent.Back)
                            }
                        },
                    painter = painterResource(id = R.drawable.back_icon),
                    contentDescription = null
                )

                Spacer(modifier = Modifier.weight(1f))

                Text(
                    modifier = Modifier
                        .size(100.dp)
                        .padding(top = 30.dp)
                        .padding(end = 30.dp),
                    fontSize = 20.sp,
                    text = "Profile"
                )

            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {

                Spacer(modifier = Modifier.weight(0.8f))

                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = null,
                    modifier = Modifier
                )

                Button(
                    modifier = Modifier
                        .width(250.dp)
                        .height(80.dp)
                        .padding(top = 20.dp),
                    onClick = {
                        onEvenDispatcher(AccountScreenContract.Intent.OpenLoginScreen)
                    }
                ) {
                    Text(
                        modifier = Modifier,
                        fontSize = 25.sp,
                        text = "SIGN IN",
                    )
                }

                Text(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clickable {
                            run {
                                onEvenDispatcher(AccountScreenContract.Intent.OpenSignUpScreen)
                            }
                        },
                    fontSize = 25.sp,
                    text = "Create new account"
                )

                Spacer(modifier = Modifier.weight(1f))
            }

        }

    }
}
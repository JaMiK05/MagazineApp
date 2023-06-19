package uz.gita.magazineapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import uz.gita.magazineapp.data.local.MyShared
import uz.gita.magazineapp.domain.repositories.authrepository.AuthRepository
import uz.gita.magazineapp.domain.repositories.authrepository.impl.user
import uz.gita.magazineapp.presentation.screens.onboarding.OnBoardingScreen
import uz.gita.magazineapp.presentation.screens.shopscreen.ShopScreen
import uz.gita.magazineapp.presentation.screens.signin.SignInScreenContract
import uz.gita.magazineapp.ui.theme.MagazineAppTheme
import uz.gita.magazineapp.util.myLog
import uz.gita.magazineapp.util.navigation.NavigationHandler
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationHandler: NavigationHandler

    @Inject
    lateinit var authRepository: AuthRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MagazineAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val screen = getScreen()
                    Navigator(screen = screen) { navigator ->
                        LaunchedEffect(navigator) {
                            navigationHandler.navigationStack
                                .onEach { it.invoke(navigator) }
                                .launchIn(lifecycleScope)
                        }
                        CurrentScreen()
                    }
                }
            }
        }
    }

    private fun getScreen(): AndroidScreen {
        val shared = MyShared.getShared()
        val userr = shared.getUser()
        val screen = if (userr) {
            ShopScreen()
        } else {
            OnBoardingScreen()
        }
        return screen
    }
}
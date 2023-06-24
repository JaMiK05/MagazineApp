package uz.gita.magazineapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.navigator.*
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.*
import uz.gita.magazineapp.data.local.MyShared
import uz.gita.magazineapp.presentation.screens.onboarding.OnBoardingScreen
import uz.gita.magazineapp.presentation.screens.shopscreen.ShopScreen
import uz.gita.magazineapp.ui.theme.MagazineAppTheme
import uz.gita.magazineapp.util.navigation.NavigationHandler
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationHandler: NavigationHandler

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
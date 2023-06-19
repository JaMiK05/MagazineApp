package uz.gita.magazineapp.presentation.screens.signin

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.hilt.getViewModel

/**
 *   Created by Jamik on 6/15/2023 ot 5:45 PM
 **/
class SigninScreen : AndroidScreen() {

    @Preview
    @Composable
    override fun Content() {
        val viewModel: SignInScreenContract.ViewModel = getViewModel<SignInScreenViewModel>()
        val uiState = viewModel.uiState.collectAsState()
        LoginContent(uiState, viewModel::onEventDispatcher)

    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun LoginContent(
        uiState: State<SignInScreenContract.UiState>,
        eventDispatcher: (SignInScreenContract.Intent) -> Unit,
    ) {

        var emailInput by remember { mutableStateOf("") }
        var passwordInput by remember { mutableStateOf("") }
        var snackbarShow by remember { mutableStateOf(false) }

        if (snackbarShow) {
            Toast.makeText(
                LocalContext.current,
                "Maydonlar togri kiritlganiga ishonch xosil qiling",
                Toast.LENGTH_SHORT
            ).show()
            snackbarShow = false
        }
        Box(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Login", style = MaterialTheme.typography.displayMedium)
                Spacer(modifier = Modifier.padding(4.dp))
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = emailInput,
                    onValueChange = {
                        emailInput = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        disabledTextColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent
                    ),
                    placeholder = { Text(text = "examle.user@gmail.com", color = Color.Gray) },
                    singleLine = true,
                    shape = RoundedCornerShape(16.dp),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Email, contentDescription = null)
                    }

                )
                Spacer(modifier = Modifier.padding(8.dp))
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = passwordInput,
                    onValueChange = {
                        passwordInput = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        disabledTextColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent
                    ),
                    placeholder = { Text(text = "your password here", color = Color.Gray) },
                    singleLine = true,
                    shape = RoundedCornerShape(16.dp),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Lock, contentDescription = null)
                    }


                )
                Spacer(modifier = Modifier.padding(8.dp))
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 56.dp),
                    onClick = {
                        if (emailInput.length < 12 || passwordInput.length < 6) {
                            snackbarShow = true
                            return@Button
                        }
                        eventDispatcher(
                            SignInScreenContract.Intent.LogInUser(
                                emailInput,
                                passwordInput
                            )
                        )
                    }) {
                    Text(text = "Sign in")
                }
            }
            TextButton(
                modifier = Modifier.align(Alignment.BottomCenter),
                onClick = {
                    eventDispatcher(SignInScreenContract.Intent.Back)
                }) {
                Text(
                    text = "back",
                    style = MaterialTheme.typography.labelMedium,

                    )
            }
        }
    }
}
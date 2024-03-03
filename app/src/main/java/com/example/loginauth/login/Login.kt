package com.example.loginauth.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginauth.R
import com.google.firebase.annotations.concurrent.Background
import java.time.format.TextStyle


@Composable
fun LoginScreen(
    loginViewModel: LoginViewModel? = null,
    onNavToHomePage:() -> Unit,
    onNavToSignUpPage:() -> Unit,
) {
    val loginUiState = loginViewModel?.loginUiState
    val isError = loginUiState?.loginError != null
    val context = LocalContext.current



    Box {
        Image(painter = painterResource(id = R.drawable.login),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp, 219.dp)
        ) {
            Text(
                text = "Masuk",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Black,
                color = Color.Black,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(16.dp, 1.dp)
            )

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp, 2.dp),
                value = loginUiState?.userName ?: "",
                onValueChange = { loginViewModel?.onUserNameChange(it) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = null
                    )
                },
                label = {
                    Text(text = "Masukkan Email")
                },
                isError = isError
            )
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                value = loginUiState?.password ?: "",
                onValueChange = { loginViewModel?.onPassswordChange(it) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = null
                    )
                },
                label = {
                    Text(text = "Masukkan Kata Sandi")
                },
                visualTransformation = PasswordVisualTransformation(),
                isError = isError
            )
            Button(
                onClick = { loginViewModel?.loginUser(context) }, modifier = Modifier
                    .padding(16.dp, 50.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors( Color(0xFF0069B0)))
             {
                Text(text = "Masuk",
                    fontSize = 20.sp)
            }
            Spacer(modifier = Modifier.size(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = "Dont have an Account?")
                Spacer(modifier = Modifier.size(8.dp))
                TextButton(onClick = { onNavToSignUpPage.invoke() }) {
                    Text(text = "Sign Up")
                }

            }

            if (loginUiState?.isLoading == true) {
                CircularProgressIndicator()
            }

            LaunchedEffect(key1 = loginViewModel?.hasUser) {
                if (loginViewModel?.hasUser == true) {
                    onNavToHomePage.invoke()
                }
            }

            if (isError) {
                Text(
                    text = loginUiState?.loginError ?: "unknown error",
                    color = Color.Red
                )
            }

        }
    }


}

@Composable
fun SignUpScreen(
    loginViewModel: LoginViewModel? = null,
    onNavToHomePage:() -> Unit,
    onNavToLoginPage:() -> Unit,
) {
    val loginUiState = loginViewModel?.loginUiState
    val isError = loginUiState?.signUpError != null
    val context = LocalContext.current

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,) {
        Text(
            text="Sign Up",
            style = MaterialTheme.typography.displayLarge,
            fontWeight = FontWeight.Black,
            color = MaterialTheme.colorScheme.primary
        )
        if(isError){
            Text(text = loginUiState?.signUpError ?: "unknown error",
                color = Color.Red)
        }

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            value = loginUiState?.userNameSignUp ?: "",
            onValueChange = {loginViewModel?.onUserNameChangeSignUp(it)},
            leadingIcon = {
                Icon(imageVector = Icons.Default.Person,
                    contentDescription = null)
            },
            label = {
                Text(text = "Masukkan Email")
            },
            isError = isError
        )
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            value = loginUiState?.passwordSignup ?: "",
            onValueChange = {loginViewModel?.onPasswordChangeSignup(it)},
            leadingIcon = {
                Icon(imageVector = Icons.Default.Lock,
                    contentDescription = null)
            },
            label = {
                Text(text = "Masukkan Kata Sandi")
            },
            visualTransformation = PasswordVisualTransformation(),
            isError = isError
        )
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            value = loginUiState?.confirmPasswordSignup ?: "",
            onValueChange = {loginViewModel?.onConfirmPasswordChange(it)},
            leadingIcon = {
                Icon(imageVector = Icons.Default.Lock,
                    contentDescription = null)
            },
            label = {
                Text(text = "Masukkan Ulang Kata Sandi")
            },
            visualTransformation = PasswordVisualTransformation(),
            isError = isError
        )
        Button(onClick = { loginViewModel?. createUser(context) }) {
            Text(text = "Sign in")
        }
        Spacer(modifier = Modifier.size(16.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center,
        ){
            Text(text = "Already Have an Account")
            Spacer(modifier = Modifier.size(8.dp))
            TextButton(onClick = { onNavToLoginPage.invoke() }) {
                Text(text = "Sign In")
            }

        }

        if(loginUiState?.isLoading == true){
            CircularProgressIndicator()
        }

        LaunchedEffect(key1 = loginViewModel?.hasUser){
            if (loginViewModel?.hasUser == true){
                onNavToHomePage.invoke()
            }
        }



    }

}

@Preview(showSystemUi = true)
@Composable
fun PrevLoginScreen() {
    LoginScreen(onNavToHomePage = { /*TODO*/ }) {
        
    }
}

@Preview(showSystemUi = true)
@Composable
fun PrevSignUpScreen() {
    SignUpScreen(onNavToHomePage = { /*TODO*/ }) {

    }
}
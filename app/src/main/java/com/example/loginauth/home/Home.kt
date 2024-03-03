package com.example.loginauth.home

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
import com.example.loginauth.login.LoginViewModel


@Composable
fun Home(loginViewModel: LoginViewModel? = null,
         onNavToHomePage:() -> Unit,
         onNavToSignUpPage:() -> Unit,
         onNavToLoginPage:() -> Unit) {
    Text(
        text = "This is Homepage")
    
    Button(onClick = { onNavToLoginPage.invoke() }, modifier = Modifier.padding(300.dp).size(30.dp, 60.dp)) {
        Text(text = "Log Out")
    }
}

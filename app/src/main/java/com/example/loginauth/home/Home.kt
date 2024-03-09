package com.example.loginauth.home

import android.graphics.Paint.Style
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginauth.login.LoginViewModel
import java.time.format.TextStyle


@Composable
fun Home(loginViewModel: LoginViewModel? = null,
         onNavToHomePage:() -> Unit,
         onNavToSignUpPage:() -> Unit,
         onNavToLoginPage:() -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "This is Homepage",
            textAlign = TextAlign.Center,
            color = Color.Black,
            modifier = Modifier
                .padding(top = 24.dp)
                .fillMaxWidth(),
            fontSize = 34.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Black
        )
    }
}

@Preview
@Composable
fun prevHome() {
    Home(onNavToHomePage = { /*TODO*/ }, onNavToSignUpPage = { /*TODO*/ }) {

    }
    
}

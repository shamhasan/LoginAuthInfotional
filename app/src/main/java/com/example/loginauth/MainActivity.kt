package com.example.loginauth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.findNavController
import com.example.loginauth.login.LoginViewModel
import com.example.loginauth.threeMainPages.MentorDetail.DetailMentor
import com.example.loginauth.threeMainPages.MentorDetail.MetodePembayaran
import com.example.loginauth.ui.theme.LoginAuthTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val loginViewModel = viewModel(modelClass = LoginViewModel::class.java)
            LoginAuthTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Navigation(loginViewModel = loginViewModel, onNavToLoginPage = null)
                }
            }
//            PagerScreen()
//
//             val navController = rememberNavController()
//            NavHost(navController = navController, startDestination = "DetailMentor"){
//                composable("DetailMentor"){ DetailMentor(navController)}
//                composable("MetodeBayar"){ MetodePembayaran(navController) }
//            }

        }
    }

}



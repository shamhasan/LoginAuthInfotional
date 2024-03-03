package com.example.loginauth

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginauth.home.Home
import com.example.loginauth.login.LoginScreen
import com.example.loginauth.login.LoginViewModel
import com.example.loginauth.login.SignUpScreen

enum class LoginRoutes{
    Signup,
    Signin
}

enum class HomeRoutes{
    Home,
    Detail

}

@Composable
fun Navigation(
    navController: NavHostController = rememberNavController(),
    loginViewModel: LoginViewModel
    ) {
        NavHost(navController = navController,
            startDestination = LoginRoutes.Signin.name ){
            composable(route = LoginRoutes.Signin.name){
                LoginScreen(onNavToHomePage = {navController.navigate(HomeRoutes.Home.name){
                    launchSingleTop = true
                    popUpTo(route = LoginRoutes.Signin.name){
                        inclusive = true
                    }
                }
                },
                    loginViewModel = loginViewModel
                ) {
                    navController.navigate(LoginRoutes.Signup.name){
                        launchSingleTop = true
                        popUpTo(LoginRoutes.Signin.name){
                            inclusive = true
                        }
                    }
                }
            }
            composable(route = LoginRoutes.Signup.name){
                SignUpScreen(onNavToHomePage = {
                    navController.navigate(HomeRoutes.Home.name){
                        popUpTo(LoginRoutes.Signup.name){
                            inclusive = true
                        }
                    }
                },
                    loginViewModel = loginViewModel
                    ) {
                    navController.navigate(LoginRoutes.Signup.name)
                }
            }

            composable(route = HomeRoutes.Home.name){
               Home(onNavToHomePage = { /*TODO*/ }, onNavToSignUpPage = { /*TODO*/ }) {
                   
               }
            }
        }



}
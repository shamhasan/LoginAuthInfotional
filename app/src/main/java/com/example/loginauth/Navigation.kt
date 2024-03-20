package com.example.loginauth

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.LoginAuth.threeMainPages.CariMentor
import com.example.LoginAuth.threeMainPages.Profile
import com.example.loginauth.home.Home
import com.example.loginauth.login.LoginScreen
import com.example.loginauth.login.LoginViewModel
import com.example.loginauth.login.SignUpScreen

enum class LoginRoutes{
    Signup,
    Signin
}

enum class HomeRoutes{
    Homepage,
    CariMentor,
    Profile,
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
                LoginScreen(onNavToHomePage = {navController.navigate(HomeRoutes.Homepage.name){
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
                    navController.navigate(HomeRoutes.Homepage.name){
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

            composable(route = HomeRoutes.Homepage.name){
               Home(navController)
            }
            composable(route = HomeRoutes.CariMentor.name){
                CariMentor(navController)
            }
            composable(route = HomeRoutes.Profile.name){
                Profile(navController)
            }
        }
}
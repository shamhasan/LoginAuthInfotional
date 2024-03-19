package com.example.loginauth.login

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.loginauth.repository.AuthehnticationRepository
import kotlinx.coroutines.launch

class LoginViewModel(
    private val repository: AuthehnticationRepository = AuthehnticationRepository()
):ViewModel() {
    val currentUser = repository.currentUser

    val hasUser: Boolean
        get() = repository.hasUser()

    var loginUiState by mutableStateOf(LoginUiState())
        private set

    fun onUserNameChange(userName: String){
        loginUiState = loginUiState.copy(userName = userName)
    }
    fun onPassswordChange(password: String){
        loginUiState = loginUiState.copy(password = password)
    }
    fun onUserNameChangeSignUp(userName: String){
        loginUiState = loginUiState.copy(userNameSignUp = userName)
    }
    fun onPasswordChangeSignup(password: String){
        loginUiState = loginUiState.copy(passwordSignup = password)
    }
    fun onConfirmPasswordChange(password: String){
        loginUiState = loginUiState.copy(confirmPasswordSignup = password)
    }

    fun onNameChange(name: String){
        loginUiState = loginUiState.copy(name = name)
    }

    private fun validateLoginForm() =
        loginUiState.userName.isNotBlank() &&
                loginUiState.password.isNotBlank()

    private fun validateSignupForm() =
        loginUiState.userNameSignUp.isNotBlank() &&
                loginUiState.passwordSignup.isNotBlank()&&
                loginUiState.confirmPasswordSignup.isNotBlank()

    fun createUser(context: Context) = viewModelScope.launch{
        repository.createUser(loginUiState.userNameSignUp, loginUiState.passwordSignup, loginUiState.confirmPasswordSignup){ isSuccessful ->
            loginUiState = if (isSuccessful){
                Toast.makeText(
                    context,
                    "Success login",
                    Toast.LENGTH_SHORT
                ).show()
                loginUiState.copy(isSuccessLogin = true)
            } else {
                Toast.makeText(
                    context,
                    "Failed login",
                    Toast.LENGTH_SHORT
                ).show()
                loginUiState.copy(isSuccessLogin = false)
            }
        }
    }
    fun loginUser(context: Context) = viewModelScope.launch {
        try{
            if(!validateLoginForm()){
                throw IllegalArgumentException("email and password cannot be empty")
            }
            loginUiState = loginUiState.copy(isLoading = true)
            loginUiState = loginUiState.copy(loginError = null)
            repository.login(
                loginUiState.userName,
                loginUiState.password
            ){ isSuccessful ->
                if (isSuccessful){
                    Toast.makeText(
                        context,
                        "Success login",
                        Toast.LENGTH_SHORT
                    ).show()
                    loginUiState = loginUiState.copy(isSuccessLogin = true)
                } else {
                    Toast.makeText(
                        context,
                        "Failed login",
                        Toast.LENGTH_SHORT
                    ).show()
                    loginUiState = loginUiState.copy(isSuccessLogin = false)
                }

            }
        }catch (e:Exception){
            loginUiState = loginUiState.copy(loginError = e.localizedMessage)
            e.printStackTrace()
        }finally {
            loginUiState = loginUiState.copy(isLoading = false)
        }

    }



}

data class LoginUiState(
    val name:String="",
    val userName:String = "",
    val password:String = "",
    val userNameSignUp:String = "",
    val passwordSignup:String = "",
    val confirmPasswordSignup:String = "",
    val isLoading:Boolean = false,
    val isSuccessLogin:Boolean = false,
    val signUpError:String? = null,
    val loginError:String? = null

)
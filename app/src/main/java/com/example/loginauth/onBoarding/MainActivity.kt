package com.example.loginauth.onBoarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.example.loginauth.R
import com.example.loginauth.onBoarding.screen.PagerScreen
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PagerScreen()
        }
    }
}
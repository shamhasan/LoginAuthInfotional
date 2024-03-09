package com.example.LoginAuth.threeMainPages


import com.example.loginauth.R

sealed class Routes (val id: String, val icon: Int, val route: String) {
    data object CariMentor: Routes("Cari Mentor", R.drawable.icon_carimentor, "cariMentor")
    data object Homepage: Routes("Homepage", R.drawable.icon_homepage, "homepage")
    data object Profile: Routes("Profile", R.drawable.icon_profile, "profile")
}
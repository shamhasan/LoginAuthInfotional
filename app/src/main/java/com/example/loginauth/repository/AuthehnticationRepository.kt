package com.example.loginauth.repository

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.auth
import com.google.firebase.firestore.firestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

class AuthehnticationRepository {
    val currentUser: FirebaseUser? = Firebase.auth.currentUser

    fun hasUser():Boolean = Firebase.auth.currentUser != null

    fun getUserId():String = Firebase.auth.currentUser?.uid.orEmpty()

    suspend fun createUser(

        name:String,
        email:String,
        password:String,
        confirmPassword:String,
        onComplete:(Boolean) -> Unit
    ) = withContext(Dispatchers.IO){
        Firebase.auth
        if (password != confirmPassword) {
            onComplete.invoke(false)
            return@withContext
        }
        val db = Firebase.firestore

        val user = hashMapOf(
            "name" to name,
            "email" to email,
            "password" to password,
            "confirmPassword" to confirmPassword
        )

        db.collection("Users")
            .add(user)

            .addOnFailureListener { e ->
                onComplete.invoke(false)
            }

        Firebase.auth
            .createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener() {
                if (it.isSuccessful){
                    onComplete.invoke(true)
                } else {
                    onComplete.invoke(false)
                }
            }.await()
    }


    suspend fun login(
        email:String,
        password:String,
        onComplete:(Boolean) ->Unit
    ) = withContext(Dispatchers.IO){
        Firebase.auth
            .signInWithEmailAndPassword(email, password)
            .addOnCompleteListener() {
                if (it.isSuccessful){
                    onComplete.invoke(true)
                }else{
                    onComplete.invoke(false)
                }
            }.await()
    }

    }

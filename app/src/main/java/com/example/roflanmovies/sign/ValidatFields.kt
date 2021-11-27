package com.example.roflanmovies.sign

import android.content.Intent
import android.widget.Toast
import com.example.roflanmovies.MoviesActivity

fun ValidationEmail(email : String) : Boolean {
    val regex = "[a-zA-Z0-9]+\\@[a-zA-Z]+.[a-zA-Z]+".toRegex()
    return regex.containsMatchIn(email)
}

fun Validation(email : String, pwd : String) : Boolean
{
    if (email == "" && pwd == "") {
        return false
    } else {
        if (ValidationEmail(email)) {
            return true
        }
    }
    return false
}
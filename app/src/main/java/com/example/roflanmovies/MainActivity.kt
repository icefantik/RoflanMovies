package com.example.roflanmovies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roflanmovies.sign.`in`.SignInActivity
import com.example.roflanmovies.sign.up.SignUpActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
    }

    fun onClickIntentSignIn(view: android.view.View) {
        val intent = Intent(this@MainActivity, SignInActivity::class.java)
        startActivity(intent)
    }
    fun onClickIntentSignUp(view: android.view.View) {
        val intent = Intent(this@MainActivity, SignUpActivity::class.java)
        startActivity(intent)
    }

}
package com.example.roflanmovies.sign.up

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.roflanmovies.MoviesActivity
import com.example.roflanmovies.R

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen)
    }

    fun onClickReg(view: View) {
        val intent = Intent(this@SignUpActivity, MoviesActivity::class.java)
        startActivity(intent)
    }
}
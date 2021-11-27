package com.example.roflanmovies.sign.`in`

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.roflanmovies.MoviesActivity
import com.example.roflanmovies.R
import com.example.roflanmovies.sign.Validation

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_screen)
    }

    fun onClickLogin(view: View) {
        val textEditEmail : EditText = findViewById(R.id.editTextEmail)
        val textEditPwd : EditText = findViewById(R.id.editTextPwd)
        if (Validation(textEditEmail.text.toString(), textEditPwd.text.toString())) {
            val intent = Intent(this@SignInActivity, MoviesActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Вы ввели некорректные данные", Toast.LENGTH_SHORT).show()
        }
    }
}
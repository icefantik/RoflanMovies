package com.example.roflanmovies.sign.up

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.roflanmovies.MoviesActivity
import com.example.roflanmovies.R
import com.example.roflanmovies.sign.Validation

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen)
    }

    fun onClickReg(view: View) {
        val textEditEmail : EditText = findViewById(R.id.editTextEmailSignUp)
        val textEditPwd : EditText = findViewById(R.id.editTextPwdSignUp)
        if (Validation(textEditEmail.text.toString(), textEditPwd.text.toString())) {
            val intent = Intent(this@SignUpActivity, MoviesActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Вы ввели некорректные данные", Toast.LENGTH_SHORT).show()
        }
    }
}
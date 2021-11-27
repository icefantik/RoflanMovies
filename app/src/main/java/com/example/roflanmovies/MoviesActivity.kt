package com.example.roflanmovies

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MoviesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies_screen)
    }

    fun onClickDetalMovie(view: View) {
        val intent = Intent(this@MoviesActivity, DetailedMovieActivity::class.java)
        startActivity(intent)
    }
}
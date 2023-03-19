package com.example.ageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        Handler(Looper.getMainLooper()).postDelayed({

       val intent = Intent(this@SplashScreen , MainActivity::class.java)


            startActivity(intent)
            finish()


        },3000)
    }

    }

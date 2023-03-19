package com.example.ageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    lateinit var textAge: TextView
    lateinit var editText: EditText
    lateinit var buttonage : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Age Calculator"

        textAge = findViewById(R.id.Txtview)
        editText = findViewById(R.id.Edt_dob)
        buttonage = findViewById(R.id.btnShowAge)




        buttonage.setOnClickListener{


            val yearofBirth = Integer.parseInt(editText.text.toString())
            val cuurentYear = Calendar.getInstance().get(Calendar.YEAR)

            val age = cuurentYear - yearofBirth

            textAge.text = "Your age is $age"

        }


    }
}
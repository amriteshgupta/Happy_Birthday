package com.amritesh.happybirthday

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var img_Wish:ImageView=findViewById(R.id.img_Wish)
        var txt_Wish:TextView=findViewById(R.id.txt_Wish)
        var txt_from:TextView=findViewById(R.id.txt_from)
        var bt_sumit: Button = findViewById(R.id.bt_Submit)
        var et_Their_Name: EditText= findViewById(R.id.et_Thier_Name)
        var et_From: EditText= findViewById(R.id.et_From)
        var txt_Name:TextView=findViewById(R.id.txt_Name)
        val wish="Happy Birthday "
        val from="From "

        bt_sumit.setOnClickListener {
            img_Wish.setVisibility(View.VISIBLE)
            txt_Wish.setVisibility(View.VISIBLE)
            txt_from.setVisibility(View.VISIBLE)
            bt_sumit.setVisibility(View.INVISIBLE)
            et_Their_Name.setVisibility(View.INVISIBLE)
            et_From.setVisibility(View.INVISIBLE)
            txt_Name.setVisibility(View.INVISIBLE)

            val content: String = et_Their_Name.getText().toString() //gets you the contents of edit text
            txt_Wish.setText(wish + content) //displays it in a textview..


            val content2: String = et_From.getText().toString() //gets you the contents of edit text
            txt_from.setText(from + content2) //displays it in a textview..

        }

    }
}
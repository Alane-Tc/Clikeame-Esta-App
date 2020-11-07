package com.alane.clikeame_esta

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Easy : AppCompatActivity() {
    lateinit var button_counter : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_easy)

        button_counter=findViewById(R.id.btn_counter)

        button_counter.setOnClickListener(){
            Toast.makeText(this, "Estoy aprendiendo a contar perro :v ", Toast.LENGTH_SHORT).show()
        }


    }
}
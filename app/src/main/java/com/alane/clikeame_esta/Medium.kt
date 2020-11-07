package com.alane.clikeame_esta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Medium : AppCompatActivity() {
    lateinit var button_counterMedium : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medium)

        button_counterMedium=findViewById(R.id.btn_counterMedium)

        button_counterMedium.setOnClickListener(){
            Toast.makeText(this, "Estoy aprendiendo a contar perro :v ", Toast.LENGTH_SHORT).show()
        }
    }
}
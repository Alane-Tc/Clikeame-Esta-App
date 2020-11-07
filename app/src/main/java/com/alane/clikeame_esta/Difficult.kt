package com.alane.clikeame_esta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Difficult : AppCompatActivity() {
    lateinit var button_counterDifficult : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_difficult)

        button_counterDifficult=findViewById(R.id.btn_counterDifficult)

        button_counterDifficult.setOnClickListener(){
            Toast.makeText(this, "Estoy aprendiendo a contar perro :v ", Toast.LENGTH_SHORT).show()
        }
    }
}
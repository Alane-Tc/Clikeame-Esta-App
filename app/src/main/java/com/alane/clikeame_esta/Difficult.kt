package com.alane.clikeame_esta

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Difficult : AppCompatActivity() {
    lateinit var button_counterDifficult : Button
    lateinit var text_counter_difficult : TextView
    var counter=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_difficult)

        button_counterDifficult=findViewById(R.id.btn_counterDifficult)
        text_counter_difficult=findViewById(R.id.show_clicks_difficult)

        button_counterDifficult.setOnClickListener(){
           // Toast.makeText(this, "Estoy aprendiendo a contar perro :v ", Toast.LENGTH_SHORT).show()
            Counter_difficult()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun Counter_difficult(){
        counter++
        if (counter == 1){
            Toast.makeText(this, "Iniciaste el juego ", Toast.LENGTH_SHORT).show()
        }
        text_counter_difficult.setText("Has Dado Click: "+counter+ " Veces")
    }
}
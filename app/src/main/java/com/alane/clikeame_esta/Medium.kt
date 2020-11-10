package com.alane.clikeame_esta

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Medium : AppCompatActivity() {
    lateinit var button_counterMedium : Button
    lateinit var text_counter_medium : TextView
    var counter=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medium)

        button_counterMedium=findViewById(R.id.btn_counterMedium)
        text_counter_medium=findViewById(R.id.show_clicks_medium)

        button_counterMedium.setOnClickListener(){
            Counter_medium()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun Counter_medium(){
        counter++
        
        if (counter == 1){
            Toast.makeText(this, "Iniciaste el juego ", Toast.LENGTH_SHORT).show()
        }
        text_counter_medium.setText("Has Dado Click: "+counter+ " Veces")

    }
}
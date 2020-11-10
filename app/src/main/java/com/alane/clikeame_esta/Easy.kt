package com.alane.clikeame_esta

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Easy : AppCompatActivity() {
    lateinit var button_counter : Button
    lateinit var text_counter : TextView
    var counter=0
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_easy)

        button_counter=findViewById(R.id.btn_counter)
        text_counter=findViewById(R.id.show_clicks_easy)

        button_counter.setOnClickListener(){
            Counter_easy()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun Counter_easy(){
        counter++

        if (counter == 1){
            Toast.makeText(this, "Iniciaste el juego ", Toast.LENGTH_SHORT).show()
        }
        text_counter.setText("Has Dado Click: "+counter+ " Veces")

    }
}
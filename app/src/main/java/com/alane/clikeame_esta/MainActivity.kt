package com.alane.clikeame_esta

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button_easy : Button
    lateinit var button_medium : Button
    lateinit var button_difficult : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        //Thread.sleep(2000)
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_easy=findViewById(R.id.btn_facil)
        button_medium=findViewById(R.id.btn_medio)
        button_difficult=findViewById(R.id.btn_dificil)

        button_easy.setOnClickListener(){
            val intent: Intent = Intent(this, Test::class.java);
            startActivity(intent);
        }

        button_medium.setOnClickListener(){
            val intent: Intent = Intent(this, Medium::class.java);
            startActivity(intent);
        }

        button_difficult.setOnClickListener(){
            val intent: Intent = Intent(this, Difficult::class.java);
            startActivity(intent);
        }




    }
}
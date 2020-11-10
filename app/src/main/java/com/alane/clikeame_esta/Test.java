package com.alane.clikeame_esta;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Test extends AppCompatActivity {
    int counter=0;
    String[] answer = {"Ya perdiste jajaja", "Sigue intentado", "Qué pendejo estas", "Vulve a intentarlo", "JAJAJAJAJA",
            "¿Qué?, ¿No puedes ganar?", "Eres un perdedor", "Pinche cara de mi miembro", "Pinche chairo estúpido", "F en el chat shavales"};

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Button boton_counter = (Button) findViewById(R.id.btn_counter_test);
        boton_counter.setOnClickListener(this::onClick);
    }


    @SuppressLint("SetTextI18n")
    public void onClick(View view){
        counter ++;
        int valorDado = (int) Math.floor(Math.random()*20+1);
        int number = (int) Math.floor(Math.random()*answer.length);
        if (counter == 1){
            Toast.makeText(Test.this, "Iniciaste el juego", Toast.LENGTH_LONG).show();
        }



        TextView texto_Counter = (TextView) findViewById(R.id.show_clicks_test);
        TextView texto_random = (TextView) findViewById(R.id.textRandom);
        texto_Counter.setText("Has Dado Click: "+counter+ " Veces");

        if (valorDado == 5){
            texto_random.setText(answer[(int) Math.floor(Math.random()*answer.length)]);

        }

    }
}
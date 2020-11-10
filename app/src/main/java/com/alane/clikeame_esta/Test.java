package com.alane.clikeame_esta;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
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

        TextView texto_Counter = (TextView) findViewById(R.id.show_clicks_test);
        TextView texto_random = (TextView) findViewById(R.id.textRandom);
        texto_Counter.setText("Has Dado Click: "+counter+ " Veces");
        if (counter == 1){
            texto_random.setText("Iniciaste el juego");
        }

        if (valorDado == 5){
            buttonColor();
            texto_random.setText(answer[(int) Math.floor(Math.random()*answer.length)]);
        }

        if (counter ==50){
            buttonColor();
            texto_random.setText("Felicidades crack");
        }

    }
    private void buttonColor(){
        Button boton_counter = (Button) findViewById(R.id.btn_counter_test);
        boton_counter.setEnabled(false);
        boton_counter.setTextColor(Color.parseColor("#22223b"));
        boton_counter.setBackgroundColor(Color.parseColor("#8d99ae"));
    }
}
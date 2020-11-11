package com.alane.clikeame_esta;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Test extends AppCompatActivity {
    int counter=0;
    String[] answer = {"Ya perdiste jajaja", "Sigue intentado", "Qué pendejo estas", "Vulve a intentarlo", "JAJAJAJAJA",
            "¿Qué?, ¿No puedes ganar?", "Eres un perdedor", "Pinche cara de mi miembro", "Pinche chairo estúpido", "F en el chat shavales"};

    Integer[] imagenesID = {R.drawable.win1, R.drawable.win2, R.drawable.win3,R.drawable.win4,R.drawable.win5,
            R.drawable.win6,R.drawable.win7,R.drawable.win8,R.drawable.win9,R.drawable.win10};

    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Button boton_counter = (Button) findViewById(R.id.btn_counter_test);
        Button buttonReset = (Button) findViewById(R.id.btn_counter_reset_Test);
        Button buttonOver = (Button) findViewById(R.id.btn_counter_over_Test);
        boton_counter.setOnClickListener(this::onClick);
        buttonReset.setOnClickListener(this::resetGame);
        buttonOver.setOnClickListener(this::gameOver);
    }

    @SuppressLint("SetTextI18n")
    public void onClick(View view){
        initCouter();
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
            buttonReset();
            buttonOver();
        }

        if (counter ==50){
            buttonColor();
            showImgRandom();
            Toast.makeText(this, "Felicidades Ganaste el juego", Toast.LENGTH_SHORT).show();
        }

    }

    private void buttonOver(){
        Button buttonOver = (Button) findViewById(R.id.btn_counter_over_Test);
        buttonOver.setVisibility(View.VISIBLE);
        buttonOver.setEnabled(true);
    }

    private void buttonReset(){
        Button buttonReset = (Button) findViewById(R.id.btn_counter_reset_Test);
        buttonReset.setVisibility(View.VISIBLE);
        buttonReset.setEnabled(true);
    }

    private void resetGame(View view){
        Toast.makeText(this, "Reiniciaste el juego", Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(Test.this, Test.class);
        startActivity(intent);
    }

    private void gameOver(View view){
        Intent intent= new Intent(view.getContext(), MainActivity.class);
        //startActivityForResult(intent, 0);
        startActivity(intent);
    }

    private void initCouter(){
        counter ++;
    }

    private void buttonColor(){
        Button boton_counter = (Button) findViewById(R.id.btn_counter_test);
        boton_counter.setEnabled(false);
        boton_counter.setTextColor(Color.parseColor("#22223b"));
        boton_counter.setBackgroundColor(Color.parseColor("#8d99ae"));
    }

    private void showImgRandom(){
        ImageView imgRandom = (ImageView) findViewById(R.id.imgRandomEasy);
        imgRandom.setImageResource(imagenesID[(int)Math.floor(Math.random()*imagenesID.length)]);
    }
}
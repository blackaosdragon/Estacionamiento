package com.example.black.gg.mx.estacionamiento;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText hora, minutos;
    Button inicio, fin;
    ProgressBar tiempo;
    TextView texto, texto2;
    Chronometer cronometro;
    int horas,hora2, minuto,minuto2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hora = (EditText) findViewById(R.id.hora);
        minutos = (EditText) findViewById(R.id.minutos);
        inicio = (Button) findViewById(R.id.inicio);
        fin = (Button) findViewById(R.id.fin);
        tiempo = (ProgressBar) findViewById(R.id.tiempo);
        texto = (TextView) findViewById(R.id.texto);
        texto2 = (TextView) findViewById(R.id.texto2);
        final Calendar tim = Calendar.getInstance();
        final Calendar end = Calendar.getInstance();


        tiempo.setVisibility(View.INVISIBLE);
        fin.setVisibility(View.INVISIBLE);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiempo.setVisibility(View.VISIBLE);
                fin.setVisibility(View.VISIBLE);
                inicio.setVisibility(View.INVISIBLE);
                hora.setVisibility(View.INVISIBLE);
                minutos.setVisibility(View.INVISIBLE);




                horas = tim.get(Calendar.HOUR_OF_DAY);
                minuto = tim.get(Calendar.MINUTE);
                texto.setText("\nhoras iniciales: "+horas+"Minutos iniciales: "+minuto);
                //texto.setText("\nhoras iniciales: "+tim.get(Calendar.HOUR_OF_DAY)+"Minutos iniciales: "+tim.get(Calendar.MINUTE));




            }
        });
        fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tiempo.setVisibility(View.INVISIBLE);
                inicio.setVisibility(View.VISIBLE);
                fin.setVisibility(View.INVISIBLE);

                hora2 = end.get(Calendar.HOUR_OF_DAY);
                minuto2 = end.get(Calendar.MINUTE);
                texto2.setText("\nhoras: "+hora2+"minutos: "+minuto2);
                texto2.append("\nhoras:"+horas+"Minutos: "+minuto);


            }
        });
    }
}

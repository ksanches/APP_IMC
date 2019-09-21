package com.example.projeto_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BoasVindas extends AppCompatActivity {


    private TextView textViewSaudacao;
    private TextView textViewIdade;
    private TextView textViewPeso;
    private TextView textViewAltura;
    private Button buttonVamosLa;

    public static final String NOME_KEY = "nome";
    public static final String IDADE_KEY = "idade";
    public static final String PESO_KEY = "peso";
    public static final String ALTURA_KEY = "altura";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boas_vindas);

        textViewSaudacao = findViewById(R.id.textViewSaudacao);
        textViewIdade = findViewById(R.id.textViewIdade);
        textViewPeso = findViewById(R.id.textViewPeso);
        textViewAltura = findViewById(R.id.textViewAltura);
        buttonVamosLa = findViewById(R.id.buttonVamosLa);

        final Intent intent = getIntent();

        if (getIntent() != null && intent.getExtras() != null){

            Bundle bundle = intent.getExtras();


        }

        buttonVamosLa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //enviar dados para proxima activity
                //calculo é feito no botão listenar da proxima activity

                String nome = textViewSaudacao.getEditableText().toString();
                String idade = textViewIdade.getEditableText().toString();
                String peso = textViewPeso.getEditableText().toString();
                String altura = textViewAltura.getEditableText().toString();

                Intent intent1 = new Intent(BoasVindas.this, MainActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString(IDADE_KEY, idade);
                bundle.putString(PESO_KEY, peso);
                bundle.putString(ALTURA_KEY, altura);

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });
    }
}

package com.example.projeto_imc.views;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.projeto_imc.R;
import com.example.projeto_imc.interfaces.Comunicador;
import com.example.projeto_imc.model.IMC;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrimeiroFragment extends Fragment {
    private Comunicador comunicador;
    private Button btnCalcular;
    private Button btnInformacoes;


    public PrimeiroFragment() {
        // Required empty public constructor
    }

    //Sobreescrita do método onAttach e inicialização do atributo comunicador
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        try {
            comunicador = (Comunicador) context;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_primeiro, container, false);

        //Chamada do método que inicializa as views
        initViews(view);

        //Ação de clique no botão referente ao Android
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Criando um objeto
                IMC calcular = new IMC(R.drawable.calcular,
                        "Seu IMC está entre XX e YY e sua classificação é normal");

                //passagem do parametro do objeto android
                comunicador.recebeMensagem(calcular);
            }
        });

        btnInformacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Criando um objeto
                IMC informacoes= new IMC(R.drawable.info,
                        "O cálculo do IMC é feito dividindo o peso (em quilogramas) pela altura (em metros) ao quadrado.");

                //passagem do parametro do objeto android
                comunicador.recebeMensagem(informacoes);
            }
        });

        //Retorno da view
        return view;
    }

    //Método que inicializa a view
    public void initViews(View view){
        btnCalcular = view.findViewById(R.id.btnCalcular);
        btnInformacoes = view.findViewById(R.id.btnInformacoes);
    }

}

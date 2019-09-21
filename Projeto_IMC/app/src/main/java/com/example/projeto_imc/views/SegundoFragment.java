package com.example.projeto_imc.views;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projeto_imc.R;
import com.example.projeto_imc.model.IMC;

import static com.example.projeto_imc.views.MainActivity.SO_KEY;


/**
 * A simple {@link Fragment} subclass.
 */
public class SegundoFragment extends Fragment {

    private ImageView imagem;
    private TextView txtNome;


    public SegundoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_segundo, container, false);

        //Método que inicializa a view
        initView(view);

        //Condição que verifica se o getArguments não está vindo nulo
        if (!getArguments().isEmpty()){

            //Adicionando as informações vindas para um novo objeto
            IMC imc = getArguments().getParcelable(SO_KEY);

            //Verifica se o objeto não é nulo
            if (imc != null){

                //Nova instancia de um objeto drawable
                Drawable drawable = getResources().getDrawable(imc.getImagem());

                //Setando a imagem para o componente imageView
                imagem.setImageDrawable(drawable);

                //Setando um texto para um componente TextView
                txtNome.setText(imc.getNome());
            }
        }

        //Retorna a View
        return view;
    }

    //Método que inicializa as views
    private void initView(View view){
        imagem = view.findViewById(R.id.imageViewFragment);
        txtNome = view.findViewById(R.id.textoFragment);
    }

}

package com.example.projeto_imc.interfaces;

import com.example.projeto_imc.model.IMC;

public interface Comunicador {
    //Método que recebe como parametro um objeto do tipo SistemaOperacional
    void recebeMensagem(IMC imc);
}


package com.example.projeto_imc.model;

import android.os.Parcel;
import android.os.Parcelable;

public class IMC implements Parcelable {
    private int imagem;
    private String nome;

    public IMC() {
    }

    public IMC(int imagem, String infoIMC) {
        this.imagem = imagem;
        this.nome = infoIMC;
    }
    //Implementações geradas através da implementação da interface Parcelable
    protected IMC(Parcel in) {
        imagem = in.readInt();
        nome = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imagem);
        dest.writeString(nome);

    }

    //Implementações geradas através da implementação da interface Parcelable
    public static final Creator<IMC> CREATOR = new Creator<IMC>() {
        @Override
        public IMC createFromParcel(Parcel in) {
            return new IMC(in);
        }

        @Override
        public IMC[] newArray(int size) {
            return new IMC[size];
        }
    };

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

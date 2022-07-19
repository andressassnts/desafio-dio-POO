package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo { //classe mentoria é filha de conteudo
    private LocalDate data;

    @Override
    public double calcularXp() {
        return 0;
    }

    public Mentoria(){

    }

//alt + insert abre o atalho para get e set, tostring...

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }



}

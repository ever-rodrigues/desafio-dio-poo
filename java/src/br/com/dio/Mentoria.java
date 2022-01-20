package br.com.dio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    //Modificadores de acesso (private, protected, public)

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO+20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +
                "Titulo"+ getTitulo()+
                "Descricao"+getDescricao()+
                '}';
    }
}

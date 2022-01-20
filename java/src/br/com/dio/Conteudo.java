package br.com.dio;

import java.time.LocalDate;

//Classe abstrata quer dizer que eu nao consigo instanciar o conteudo
public abstract class Conteudo {

    //Static e porque voce consegue acessar o XP_PADRAO fora da classe conteudo
    protected static final double XP_PADRAO=10;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

}

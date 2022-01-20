package br.com.dio;

public class Curso extends Conteudo{
    //Modificadores de acesso (private, protected, public)

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO+20d;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHorario=" + cargaHoraria+
                '}';
    }
}

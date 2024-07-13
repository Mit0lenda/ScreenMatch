package br.com.alura.screenmatch.modelos;

public class Movie extends Titulo {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    @Override
    public int getDuracaoEmMinutos() {
        return super.getDuracaoEmMinutos();
    }
}

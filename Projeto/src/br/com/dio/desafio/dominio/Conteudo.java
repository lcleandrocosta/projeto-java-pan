package br.com.dio.desafio.dominio;

import static br.com.dio.desafio.util.Util.COR;

public abstract class Conteudo {

    private String titulo;
    private String descricao;
    protected final static double XP_PADRAO = 10d;

    public abstract double calcularXp();

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

    public void apresentarRelatorio(Bootcamp bootcamp) {
        System.out.print (COR + "31" + "m"); //Vermelho
        System.out.print(bootcamp.getNome() + " - ");
        System.out.print(COR + "m");
        System.out.print (COR + "33" + "m"); //Vermelho
        System.out.print(bootcamp.getDescricao());
        System.out.println (COR + "m"); //Vermelho

    }

}

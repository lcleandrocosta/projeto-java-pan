package br.com.dio.desafio.util;

import br.com.dio.desafio.dominio.Curso;

import java.util.List;

public class Util {

    private String COR = "\u001B[";
    public void formatarTela() {

        System.out.print (COR + "31" + "m"); //Vermelho
        System.out.println("********************* Bootcamp *********************");
        System.out.print (COR + "m");
        System.out.print (COR + "34" + "m"); // Azul
        System.out.println("----------------------------------------------------");
        System.out.println("|                 Banco PAN - DIO                  |");
        System.out.println("----------------------------------------------------");
        System.out.print (COR + "m");
    }

    public void apresentarOpcoesBootcamp() {
        System.out.println (COR + "33" + "m"); //Amarelo
        System.out.println("########### Opções de cursos no Bootcamp ###########");
        System.out.print (COR + "m");
        System.out.println();
    }

    public void selecionarOpcaoCurso() {

        //System.out.println();
        System.out.println(COR + "32" + "m"); // Verde
        System.out.println("Selecione uma opção de curso: ");
        System.out.println(COR + "m");
    }

    public void listarCursos(List<Curso> cursos){
        for(int i = 0; i < cursos.size(); i++){
            int opcao = i + 1;
            System.out.println( "Opção " + opcao +" - " + cursos.get(i));
        }
    }

    public void exibirMensagemSucesso() {
        System.out.println("Inscrição efetuada com sucesso no curso de : ");
    }
}

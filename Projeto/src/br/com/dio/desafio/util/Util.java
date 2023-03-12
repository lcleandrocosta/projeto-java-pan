package br.com.dio.desafio.util;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;

import java.util.List;
import java.util.Scanner;

public class Util {

    Dev dev;
    public final static String COR = "\u001B[";
    public void formatarTela() {

        System.out.println (COR + "34" + "m"); // Azul
        System.out.println("-------------------------------------------------------");
        System.out.print (COR + "31" + "m"); //Vermelho
        System.out.println("|******************** Bootcamp ***********************|");
        System.out.print (COR + "m");
        System.out.print (COR + "34" + "m"); // Azul
        System.out.println("|                  Banco PAN - DIO                    |");
        System.out.print (COR + "31" + "m"); //Vermelho
        System.out.println("|                  Java Developer                     |");
        System.out.print (COR + "m");
        System.out.print (COR + "34" + "m"); // Azul
        System.out.println("-------------------------------------------------------");
        System.out.print (COR + "m"); // Azul
        System.out.print (COR + "m");
    }

    public void apresentarOpcoesBootcamp() {
        System.out.print(COR + "33" + "m"); //Amarelo
        System.out.println("############ Opções de cursos no Bootcamp #############");
        System.out.print (COR + "m");
        System.out.println();
    }

    public void selecionarOpcaoCurso() {
        System.out.print(COR + "32" + "m"); // Verde
        System.out.print("Deseja inscrever-se no Bootcamp? [S] ou [N]: ");
        System.out.print(COR + "m");
    }

    public void listarCursos(List<Curso> cursos){
        System.out.print(COR + "33" + "m"); //Amarelo
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < cursos.size(); i++){
            System.out.print (COR + "34" + "m"); // Azul
            System.out.println(" - " + cursos.get(i));
            System.out.print(COR + "m");
        }
        System.out.print (COR + "33" + "m"); //Amarelo
        System.out.print("-------------------------------------------------------");
        System.out.println(COR + "m");
    }

    public void exibirMensagemSucesso() {
        System.out.println("Inscrição efetuada com sucesso no curso de : ");
    }

    public void limparTela() {
        for(int i = 0; i < 1; i++) {
            System.out.println("\n");
        }
        this.formatarTela();
    }
}

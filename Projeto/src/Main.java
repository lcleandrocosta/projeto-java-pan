import br.com.dio.desafio.dominio.*;
import br.com.dio.desafio.util.Util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dev dev;
        Curso cursoJava = new Curso();
        Curso cursoJavaScript = new Curso();
        Util formatacao = new Util();
        List<Curso> cursos = new ArrayList<>();

        Conteudo conteudoCurso = new Curso();
        Conteudo conteudoMentoria = new Mentoria();

        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Java e orientação a objetos");
        cursoJava.setCargaHoraria(8);
        cursoJava.setTitulo("Curso de Java");

        cursoJavaScript.setTitulo("Curso de Javascript");
        cursoJavaScript.setDescricao("Descrição do curso de Javascript");
        cursoJavaScript.setCargaHoraria(8);

        cursos.add(cursoJava);
        cursos.add(cursoJavaScript);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setCargaHoraria(8);
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        //bootcamp.getConteudos().add(curso1);
        //bootcamp.getConteudos().add(curso2);
        //bootcamp.getConteudos().add(mentoria);

        formatacao.formatarTela();
        formatacao.apresentarOpcoesBootcamp();
        formatacao.listarCursos(cursos);

        formatacao.selecionarOpcaoCurso();

        Scanner entradaDoUsuario = new Scanner(System.in);
        int opcao = entradaDoUsuario.nextInt();

        if(opcao > 0) {
            if(opcao == 1) {
                System.out.println("Digite seu nome: ");
                String nome = entradaDoUsuario.next();
                dev = new Dev();
                dev.setNome(nome);
                dev.inscreverBootcamp(bootcamp);
                formatacao.exibirMensagemSucesso();
                System.out.println(cursoJava.getTitulo() + " - " + cursoJava.getDescricao());

            }
        }

        /*
        Dev devLeandro = new Dev();
        devLeandro.setNome("Leandro Costa");
        devLeandro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + " " + devLeandro.getNome() + ": " + devLeandro.getConteudosInscrito());
        devLeandro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos: " + devLeandro.getConteudosConcluidos());
        System.out.println("XP: " +devLeandro.calcularXp());

        Dev outroDev = new Dev();
        outroDev.setNome("Outro Dev");
        outroDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscritos de " + " " + outroDev.getNome() + ": " + outroDev.getConteudosInscrito());
        outroDev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos: " + outroDev.getConteudosConcluidos());
        System.out.println("XP: " +outroDev.calcularXp()); */
    }
}

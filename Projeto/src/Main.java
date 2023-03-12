import br.com.dio.desafio.dominio.*;
import br.com.dio.desafio.util.Util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static br.com.dio.desafio.util.Util.COR;

public class Main {

    public static void main(String[] args) {

        Dev dev = new Dev();
        Curso cursoJava = new Curso();
        Curso cursoJavaScript = new Curso();
        Util util = new Util();
        List<Curso> cursos = new ArrayList<>();

        Conteudo conteudoCurso = new Curso();
        Conteudo conteudoMentoria = new Mentoria();

        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Java e orientação a objetos");
        cursoJava.setCargaHoraria(8);
        cursoJava.setTitulo("Curso de Java");

        cursoJavaScript.setTitulo("Curso de Javascript");
        cursoJavaScript.setDescricao("Javascript completo");
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
        bootcamp.setDescricao("Descrição Bootcamp Java Deve-\nloper");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJavaScript);
        bootcamp.getConteudos().add(mentoria);

        util.formatarTela();
        util.apresentarOpcoesBootcamp();
        util.listarCursos(cursos);

        util.selecionarOpcaoCurso();

        Scanner entradaDoUsuario = new Scanner(System.in);
        String opcao = entradaDoUsuario.next();
        String converter = opcao.toUpperCase();
        switch(converter) {
            case ("S"):
                System.out.print(COR + "32" + "m");
                System.out.print("Digite seu nome: ");
                System.out.print(COR + "m");
                String nome = entradaDoUsuario.next();
                dev.setNome(nome);
                dev.inscreverBootcamp(bootcamp);
                util.limparTela();
                util.exibirMensagemSucesso();
                conteudoCurso.apresentarRelatorio(bootcamp);
                break;
            default:
                util.limparTela();
        }
    }

    //formatacao.limparTela();

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


import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        Conteudo cconteudoCurso = new Curso();
        Conteudo conteudoMentoria = new Mentoria();

        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);curso1.setTitulo("Curso de Java");

        curso2.setTitulo("Curso de Javascript");
        curso2.setDescricao("Descrição do curso de Javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setCargaHoraria(8);
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeandro = new Dev();
        devLeandro.setNome("Leandro Costa");
        devLeandro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + " " + devLeandro.getNome() + ": " + devLeandro.getConteudosInscrito());
        devLeandro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos: " + devLeandro.getConteudosConcluidos());
        System.out.println("XP: " +devLeandro.calcularXp());

        System.out.println("-------------");

        Dev outroDev = new Dev();
        outroDev.setNome("Outro Dev");
        outroDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscritos de " + " " + outroDev.getNome() + ": " + outroDev.getConteudosInscrito());
        outroDev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos: " + outroDev.getConteudosConcluidos());
        System.out.println("XP: " +outroDev.calcularXp());
    }
}

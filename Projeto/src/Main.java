import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setCargaHoraria(8);
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

    }
}

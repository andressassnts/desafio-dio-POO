import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.util.Set;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição da mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAndressa = new Dev();
        devAndressa.setNome("Andressa");
        devAndressa.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos" + devAndressa.getConteudosInscritos());
        devAndressa.progredir();
        System.out.println("Conteudo Inscritos" + devAndressa.getConteudosInscritos());
        System.out.println("Conteudo Concluidos" + devAndressa.getConteudosConcluidos());

        System.out.println("---------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteudo Inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteudo Concluidos" + devCamila.getConteudosConcluidos());





    }

}

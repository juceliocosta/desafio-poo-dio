import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: "+ devCamila.getConteudosInscritos());
        System.out.println("-");
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();//executando o metodo mesmo sem conteúdo
        System.out.println("Conteúdos Inscritos Camila: "+ devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: "+ devCamila.getConteudosConcluidos());
        System.out.println("XP: "+ devCamila.calcularTotalXp());

        System.out.println("-----------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: "+ devJoao.getConteudosInscritos());
        System.out.println("-");
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Inscritos João: "+ devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: "+ devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());

        devJoao.desinscreverBootcamp(bootcamp);
        System.out.println("-");
        System.out.println("João cancelou a inscrição do Bootcamp: ");
        System.out.println("Conteúdos Inscritos João: "+ devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: "+ devJoao.getConteudosConcluidos());


    }
}
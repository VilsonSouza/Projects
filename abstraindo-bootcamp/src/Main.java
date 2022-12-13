import com.eumemu.desafio.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("curso de orientacao a objeto com java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("curso de javascript");
        curso2.setCargaHoraria(10);





        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("descricao mentoria de java");
        mentoria1.setData(LocalDate.now());



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCleber = new Dev();
        devCleber.setNome("Cleber");
        devCleber.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos "+devCleber.getNome()+": "+devCleber.getConteudosInscritos());

        devCleber.progredir();
        devCleber.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos "+devCleber.getNome()+": "+devCleber.getConteudosInscritos());
        System.out.println("Conteudos concluidos "+devCleber.getNome()+": "+devCleber.getConteudosConcluidos());
        System.out.println("XP: "+devCleber.calularTotalXp());

        System.out.println("----------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos "+devJoao.getNome()+": "+devJoao.getConteudosInscritos());

        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos "+devJoao.getNome()+": "+devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos "+devJoao.getNome()+": "+devJoao.getConteudosConcluidos());
        System.out.println("XP: "+devJoao.calularTotalXp());


    }
}
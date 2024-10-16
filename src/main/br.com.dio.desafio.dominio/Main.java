import java.time.LocalDate;


public class Main{
    public static void main(String[] args){

//instanciando os objetos

        Curso curso1  = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2  = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descricao curso JS");
        curso2.setCargaHoraria(4);


        Curso curso3  = new Curso();
        curso3 .setTitulo("Curso Python");
        curso3 .setDescricao("Descricao Curso Python");
        curso3 .setCargaHoraria(6);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        LocalDate LocalDate = null;
        mentoria.setDescricao("Descricao mentoria de Java");
                mentoria.setData(LocalDate.now());


        // imprimindo objetos criados
        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(curso3);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("bootcamp java developer");
        bootcamp.setDescricao("Descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);


        Dev devAgner = new Dev();
        devAgner.setNome("Agner");
        devAgner.inscreverBootcamp(bootcamp);
        devAgner.progredir();


        System.out.println("Conteudos Inscritos Agner" + devAgner.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Agner" + devAgner.getConteudosConcluidos());
        System.out.println("XP: " + devAgner.calcularTotalXp());


        System.out.println("---------------------");

        Dev devMarlon = new Dev();
        devMarlon.setNome("Marlon");
        devMarlon.inscreverBootcamp(bootcamp);
        devMarlon.progredir();
        devMarlon.progredir();
        devMarlon.progredir();

        System.out.println("---------------------");


        System.out.println("Conteudos Inscritos Marlon" + devMarlon.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Marlon" + devMarlon.getConteudosConcluidos());
        System.out.println("XP: " + devMarlon.calcularTotalXp());
    }

}

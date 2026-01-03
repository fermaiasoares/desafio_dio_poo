import java.time.LocalDate;

import com.dio.desafio.dominio.Bootcamp;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
import com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(new Curso("Curso Java", "Descrição curso Java", 48));
        bootcamp.getConteudos().add(new Mentoria("Mentoria Java", "Descrição mentoria Java", LocalDate.now()));

        Dev dev1 = new Dev("Fernando Maia");
        dev1.inscreverBootcamp(bootcamp);

        System.out.println("Desenvolvedor");
        System.out.println(dev1.getNome());
        System.out.println("Conteúdos inscritos");
        dev1.getConteudosInscritos().forEach(conteudo -> System.out.println(conteudo.getTitulo()));

        for (int i = 0; i <= dev1.getConteudosInscritos().size(); i++) {
            dev1.progredir();
        }

        System.out.println("Conteúdos concluídos");
        dev1.getConteudosConcluidos().forEach(conteudo -> System.out.println(conteudo.getTitulo()));

        System.out.println(dev1.calcularTotalXp());

        System.out.println(bootcamp);
    }
}

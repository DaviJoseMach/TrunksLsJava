package Ex.Projects.Seminario.Test;

import Ex.Projects.Seminario.Domain.Apresentador;
import Ex.Projects.Seminario.Domain.Local;
import Ex.Projects.Seminario.Domain.Professor;
import Ex.Projects.Seminario.Domain.Seminario;

public class NewSeminario {
    public static void main(String[] args) {
        Local local = new Local("Madreperola N11");
        Apresentador apresentador = new Apresentador("Gonzaga", 21);
        Professor professor = new Professor("Lucas", "História");
        Apresentador[] alunosDoSeminario = {apresentador};
        Seminario seminario = new Seminario("Como loopar por mais de 20 minutos", alunosDoSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.emprimir();

    }
}

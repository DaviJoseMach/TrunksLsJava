package JavaDojo.st.core.test;

import JavaDojo.st.core.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Luciano";
        professor.materia = "Mecanica";
        professor.turma = 3;

        System.out.println(professor.nome + " " + professor.materia + " " +  professor.turma);
    }
}

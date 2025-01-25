package JavaDojo.st.core.test;

import JavaDojo.st.core.metodos.domains.Student;

public class StudentTest02 {

    public static void main(String[] args) {
        Student estudante = new Student();
        Student estudante2 = new Student();

        estudante2.nome = "Eren Jeager";
        estudante2.ra = 1;
        estudante2.idade = 16;

        estudante.nome = "Armin Arlet";
        estudante.ra = 777;
        estudante.idade = 16;

        estudante.imprime();
        estudante2.imprime();
    }
}

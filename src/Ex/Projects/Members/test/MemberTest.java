package Ex.Projects.Members.test;

import Ex.Projects.Members.domain.Member;

public class MemberTest {
    public static void main(String[] args) {
        Member membro1 = new Member();
        Member membro2 = new Member();
        Member membro3 = new Member();
        Member sals = new Member();

        membro1.nome = "João";
        membro1.idade = 18;
        membro1.salario = 1345.50;

        membro2.nome = "Gabriel";
        membro2.idade = 29;
        membro2.salario = 3400.00;

        membro3.nome = "Pedro";
        membro3.idade = 65;
        membro3.salario = 9231.11;

        membro1.imprimeMember();
        membro2.imprimeMember();
        membro3.imprimeMember();

        double[] salarios = {membro1.salario, membro2.salario, membro3.salario};

        double media = 0;
        for(double salario : salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\n Média salarial dos funcionarios " + media);

    }
}

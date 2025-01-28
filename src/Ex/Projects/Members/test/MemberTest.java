package Ex.Projects.Members.test;

import Ex.Projects.Members.domain.Member;

public class MemberTest {
    public static void main(String[] args) {
        Member membro1 = new Member();


        membro1.setNome("Pedro Paulo");
        membro1.setSalario(1500);
        membro1.setIdade(28);

        double[] salarios = {membro1.getSalario()};

        membro1.impress();
        for(double i : salarios){
            System.out.println(i);
        }

    }
}

package JavaDojo.st.core.Associacao.test;

import JavaDojo.st.core.Associacao.dominio.Manager;
import JavaDojo.st.core.Associacao.dominio.Time;

public class ManagerTest03 {
    public static void main(String[] args) {
        Manager tecnico = new Manager("Mario Games", 18);
        Time time = new Time("CeiraFc", 15 );
        Manager[] managers = {tecnico};
        tecnico.setTime(time);
        time.setMembrosJogadores(managers);

        tecnico.exibirManager();
        time.imprimi();

    }
}

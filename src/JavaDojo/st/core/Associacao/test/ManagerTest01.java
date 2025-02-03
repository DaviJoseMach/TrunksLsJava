package JavaDojo.st.core.Associacao.test;

import JavaDojo.st.core.Associacao.dominio.Manager;
import JavaDojo.st.core.Associacao.dominio.Time;

public class ManagerTest01 {
    public static void main(String[] args) {
        Manager tecnico01 = new Manager("Ezio Auditore", 68);
        Time time01 = new Time("FcAssasinos", 15);
        tecnico01.setTime(time01);

        tecnico01.exibirManager();
    }
}

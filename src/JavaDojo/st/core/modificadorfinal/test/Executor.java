package JavaDojo.st.core.modificadorfinal.test;

import JavaDojo.st.core.modificadorfinal.domain.Carro;
import JavaDojo.st.core.modificadorfinal.domain.Comprador;

public class Executor {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador = new Comprador();
        carro.COMPRADOR.setNome("Davi");
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(Carro.COMPRADOR);
    }
}

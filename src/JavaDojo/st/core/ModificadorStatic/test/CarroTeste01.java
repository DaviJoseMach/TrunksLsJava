package JavaDojo.st.core.ModificadorStatic.test;

import JavaDojo.st.core.ModificadorStatic.domain.CarroDomain;

public class CarroTeste01 {
    public static void main(String[] args) {
        CarroDomain carro = new CarroDomain("BMW", 242);
        CarroDomain carro2 = new CarroDomain("Audi", 290);
        CarroDomain carro3 = new CarroDomain("BMW", 315);

        carro.imprimirCarro();
        carro2.imprimirCarro();
        carro3.imprimirCarro();

    }
}

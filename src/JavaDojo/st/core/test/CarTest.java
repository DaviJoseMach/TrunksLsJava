package JavaDojo.st.core.test;

import JavaDojo.st.core.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car carro1 = new Car();
        Car carro2 = new Car();


        carro1.nome = "Fusca Preto";
        carro1.ano = 1997;
        carro1.modelo = "Lendário";

        carro2.nome = "Kwid Bosta";
        carro2.ano = 2030;
        carro2.modelo = "Ruim";

        carro1 = carro2;

        System.out.println("Carro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano + "\n");
        System.out.println("Carro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}

package JavaDojo.st.core.metodos.test;

import JavaDojo.st.core.metodos.domains.Calculadora;

public class DiviTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultDivi = calculadora.dividir(3.4, 0);
        System.out.println(resultDivi);
    }
}

package JavaDojo.st.core.test;

import JavaDojo.st.core.metodos.domains.Calculadora;

public class CaclTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numbers = {1,2,3,4,5,6};
        calculadora.somaArray(numbers);
    }
}

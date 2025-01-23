package JavaDojo.st.core.metodos.test;

import JavaDojo.st.core.metodos.Calculadora;

public class CalcTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumbers();
        calculadora.subDoisNumber();

        int num1 = 15;
        calculadora.multiplicador(num1, 15);
    }

}

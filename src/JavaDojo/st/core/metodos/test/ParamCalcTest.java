package JavaDojo.st.core.metodos.test;

import JavaDojo.st.core.metodos.domains.Calculadora;

public class ParamCalcTest {
    public static void main(String [] args){
        Calculadora calculadora = new Calculadora();

        int num1 = 1;
        int num2 = 2;

        calculadora.alterTwo(num1, num2);
    }
}

package JavaDojo.st.core.metodos.domains;

public class Calculadora {
    public void somaDoisNumbers(){
        System.out.println(10 + 10);
    }
    public void subDoisNumber(){
        System.out.println(20 - 5);
    }
    public void multiplicador(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public double dividir(double num1, double num2){
        if(num1 == 0 || num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public void alterTwo(int num1, int num2){
        num1 = 15;
        num2 = 23;

        System.out.println("This is in hehers ");
        System.out.println(num1);
        System.out.println(num2);
    }
}

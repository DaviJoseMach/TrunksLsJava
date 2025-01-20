package JavaDojo.st.tierone;

public class Ternario {
    public static void main (String [] args){
        double salario = 1350;
        String doar = "Vou doar 500";
        String notDoar = "Não vou doar nada";
        String result = salario > 3000 ? doar : notDoar;

        System.out.println(result);
}
}

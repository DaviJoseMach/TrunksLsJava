package JavaDojo.st.tierone;

public class exCond {
    public static void main (String[] args) {
        double salario = 40000; // Corrigido para remover separador de milhar inválido
        double taxa;
        String payString = "Taxa de pagamento em %: ";

        if (salario <= 34712) {
            taxa = 9.70;
        } else if (salario >= 34713 && salario <= 68507) {
            taxa = 37.35;
        } else {
            taxa = 49.50;
        }
        System.out.println(payString + taxa);
    }
}

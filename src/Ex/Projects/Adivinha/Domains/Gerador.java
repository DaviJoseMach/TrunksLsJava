package Ex.Projects.Adivinha.Domains;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Gerador {
    public void numberGer (){
        Random random = new Random();
        Scanner captura = new Scanner(System.in);

        int numGerado = random.nextInt(10);

        System.out.println("Escolha um numero (0-10)");
        int escolha = captura.nextInt();
        boolean certaEscolha = escolha == numGerado;
        String certaResposta = certaEscolha == true ? "Certa resposta" : "Resposta errada o numéro correto era:" + numGerado;

        System.out.println(certaResposta);
    }
}

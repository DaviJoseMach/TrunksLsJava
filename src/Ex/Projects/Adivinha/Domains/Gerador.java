package Ex.Projects.Adivinha.Domains;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Gerador {
    public void numberGer (){
        Random random = new Random();
        Scanner captura = new Scanner(System.in);

        int numGerado = random.nextInt(10);

        boolean certaEscolha = false;
        while(certaEscolha == false){
            System.out.println("Escolha um numero (0-10)");
            int escolha = captura.nextInt();
            certaEscolha = escolha == numGerado;
            String maiorOuMenor = escolha > numGerado ? "maior que o numero certo" : "menor que o numero certo";
            String certaResposta = certaEscolha == true ? "Certa resposta" : "Resposta errada seu numero é" + maiorOuMenor;
            System.out.println(certaResposta);
        }


    }
}

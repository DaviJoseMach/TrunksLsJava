package JavaDojo.st.core.Associacao.test;

import java.util.Scanner;

public class ReadKeyTest {
    public static void main(String[] args) {
        Scanner inputKey = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = inputKey.nextLine();
        System.out.println("Digite sua idade");
        int idade = inputKey.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char sexo = inputKey.next().charAt(0);
        System.out.println("----- Login realizado ----- \n Seja bem vindo: " + nome);

    }
}

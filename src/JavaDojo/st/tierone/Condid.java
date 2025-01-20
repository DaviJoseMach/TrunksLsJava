package JavaDojo.st.tierone;

public class Condid {
    public static void main (String [] args){
       int idade = 28;
       boolean autorizadoFesta = idade >= 18;

       if(autorizadoFesta){
           System.out.println("Você está autorizado a entrar na festa \n Bem vindo a festa 👋");
       }
        else{
           System.out.println("Você não está autorizado a entrar na festa");
       }
    }
}

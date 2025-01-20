package JavaDojo.st.tierone;

public class Futebol {
    public static void main (String [] args){
        int idade = 16;
        if(idade >= 15 && idade <= 18){
            System.out.println("Categoria juvenil");
        }else if(idade <15){
            System.out.println("Categoria infantil");
        }else{
            System.out.println("Categoria adulto");
        }
    }
}

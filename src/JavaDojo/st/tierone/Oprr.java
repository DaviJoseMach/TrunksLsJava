package JavaDojo.st.tierone;

import java.sql.SQLOutput;

public class Oprr {
   public static void main (String[] arg){
       // maths + - / * ^
       int numero01 = 10;
       int numero02 = 5;
       System.out.println(numero01 - numero02);

       //%  (relacionais)
       int resto = 20 % 2;
       System.out.println(resto);

       // < >  <= >= == (comparação) != (diferente)

       boolean isDezMaiorQue3 = 10 > 3;
       System.out.println(isDezMaiorQue3);

       // lógicos
        // && (AND) || (or) ! (not)


       int number = 8;
       number += 2;
       number-=1;
       number %=2;
       boolean checkNumberEqual = number == 0;
       System.out.println("Number é par?" + checkNumberEqual);
   }
}

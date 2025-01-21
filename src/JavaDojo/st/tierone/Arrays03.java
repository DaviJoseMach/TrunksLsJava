package JavaDojo.st.tierone;

public class Arrays03 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        char[] keys = {'A', 'B', 'C'};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for(char i : keys){
            System.out.println(i);
        }
    }
}

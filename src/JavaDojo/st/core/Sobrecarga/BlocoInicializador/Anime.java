package JavaDojo.st.core.Sobrecarga.BlocoInicializador;

public class Anime {
    private String nome;
    private int[] eps = {1,2,3,4,5,6,7};

    public Anime() {
        for(int i : eps){
            System.out.print(i + ", ");
        }
    }
}

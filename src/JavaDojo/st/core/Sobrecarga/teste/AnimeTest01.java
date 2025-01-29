package JavaDojo.st.core.Sobrecarga.teste;

import JavaDojo.st.core.Sobrecarga.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime();
        anime01.init("Boruto", 167, "Ruim");
        anime01.emprimir();
    }
}

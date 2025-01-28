package JavaDojo.st.core.Sobrecarga.teste;

import JavaDojo.st.core.Sobrecarga.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime();
        anime01.setNome("Naruto");
        anime01.setTipo("HistorinhaBosta");
        anime01.setEpCount(368);

        System.out.println(anime01.getEpCount());
    }
}

package JavaDojo.st.core.test;

import JavaDojo.st.core.metodos.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        player.setNome("Davi");
        player2.setNome("João");
        player3.setNome("Grace");

        player.setNick("Zyzz");
        player2.setNick("Black444");
        player3.setNick("Lazaro");

        player.setConsole("Xbox Series S");
        player2.setConsole("PS5");
        player3.setConsole("Nintendo");

        player.setIdade(17);
        player2.setIdade(19);
        player2.setIdade(25);

        player.imprime();
    }
}

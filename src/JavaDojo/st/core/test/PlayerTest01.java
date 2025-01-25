package JavaDojo.st.core.test;

import JavaDojo.st.core.metodos.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player = new Player();
        Player player2 = new Player();
        player.setNome("Davi");
        player2.setNome("João");
        player.setIdade(17);
        player2.setIdade(19);

        System.out.println(player.getNome() + " " + player.getIdade());
        System.out.println(player2.getNome() + " " + player2.getIdade());
    }
}

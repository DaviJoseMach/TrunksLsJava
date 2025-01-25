package JavaDojo.st.core.test;

import JavaDojo.st.core.metodos.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player = new Player();
        player.setNome("Davi");
        player.setIdade(17);

        System.out.println(player.getNome());
        System.out.println(player.getIdade());
    }
}

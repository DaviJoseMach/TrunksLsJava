package JavaDojo.st.core.Sobrecarga.teste;

import JavaDojo.st.core.Sobrecarga.dominio.DiscordUser;

public class UserDiscordTest01 {
    public static void main(String[] args) {
        DiscordUser user = new DiscordUser();

        user.initClassDiscordUser("Zenzera", "MorningSone", 2, 18);
        user.welcome();
    }
}

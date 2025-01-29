package JavaDojo.st.core.Sobrecarga.dominio;

public class DiscordUser {
    private String nick;
    private String nome;
    private int discordId;
    private int serversIn;
    private String verifyIdDev;

    public void initClassDiscordUser (String nick, String nome, int discordId, int serversIn){
            this.nick = nick;
            this.nome = nome;
            this.discordId = discordId;
            boolean checkIdDev = discordId <= 10;
            String verifyIdDev = checkIdDev == true ? "... acesso de desenvolvedor" : "Bem vindo" + nick;
            this.serversIn = serversIn;
    }
    public void welcome(){
        System.out.println(nick);
        System.out.println(nome + " <" + discordId + "> " );
        System.out.println (this.verifyIdDev);
    }

}

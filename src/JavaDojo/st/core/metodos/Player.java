package JavaDojo.st.core.metodos;

public class Player {
    private String nome;
    private String console;
    private int idade;
    public String nick;

    public void setNome(String nome){
        this.nome = nome;
    }   public void setIdade(int idade){
        this.idade = idade;
    } public void setConsole(String console){
            this.console = console;
    } public void setNick(String nick){
        this.nick = nick;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    } public String getConsole(){
        return this.console;
    }public String getNick(){
        return this.nick;
    }

    public void imprime(){
        System.out.println(
                this.nome
        );System.out.println(
                this.idade
        );System.out.println(
                this.console
        );System.out.println(
                this.nick
        );
    }
}

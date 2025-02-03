package JavaDojo.st.core.Associacao.dominio;

public class Manager {
    private String nome;
    private int idade;
    private Time time;

    public Manager(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setTime(Time time){
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public void exibirManager(){
        System.out.println(time.getNome());
        System.out.print(this.nome + " " + this.idade + " Anos");
    }
}

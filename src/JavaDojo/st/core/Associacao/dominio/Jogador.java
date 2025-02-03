package JavaDojo.st.core.Associacao.dominio;

public class Jogador {
    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void imprimir() {
        System.out.println(this.nome);
    }
}

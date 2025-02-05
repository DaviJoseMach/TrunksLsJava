package JavaDojo.st.core.kenum.domain;

public class Client {
    private String nome;
    private String tipo;


    public Client(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

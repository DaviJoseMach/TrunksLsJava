package JavaDojo.st.core.kenum.domain;

public class Client {
    private String nome;
    private TipoClient tipoClient;

    public Client(String nome, TipoClient tipoClient) {
        this.nome = nome;
        this.tipoClient = tipoClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nome='" + nome + '\'' +
                ", tipoClient=" + tipoClient +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoClient getTipoClient() {
        return tipoClient;
    }

    public void setTipoClient(TipoClient tipoClient) {
        this.tipoClient = tipoClient;
    }
}

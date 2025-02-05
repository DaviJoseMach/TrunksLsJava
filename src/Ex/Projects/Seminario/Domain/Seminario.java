package Ex.Projects.Seminario.Domain;


public class Seminario {
    private String titulo;
    private Apresentador[] apresentadores;
    private Local local;

    public Local getLocal() {
        return local;
    }

    public Seminario(String titulo, Apresentador[] apresentadores, Local local) {
        this.titulo = titulo;
        this.apresentadores = apresentadores;
        this.local = local;
    }



    public Apresentador[] getApresentadores() {
        return apresentadores;
    }

    public void setApresentadores(Apresentador[] apresentadores) {
        this.apresentadores = apresentadores;
    }

    public Seminario(String nome) {
        this.titulo = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

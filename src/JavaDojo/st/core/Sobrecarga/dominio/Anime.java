package JavaDojo.st.core.Sobrecarga.dominio;

public class Anime {
    private String nome;
    private int epCount;
    private String tipo;


    public void init(String nome, int epCount, String tipo){
        this.nome = nome;
        this.epCount = epCount;
        this.tipo = tipo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }public void setEpCount(int eps){
        this.epCount = eps;
    }public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getNome(){
        return this.nome;
    } public int getEpCount(){
        return this.epCount;
    } public String getTipo(){
        return this.tipo;
    }

    public void emprimir(){
        System.out.println(this.nome);
        System.out.println(this.epCount);
        System.out.println(this.tipo);
    }
}

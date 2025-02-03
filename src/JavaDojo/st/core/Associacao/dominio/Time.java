package JavaDojo.st.core.Associacao.dominio;

public class Time {
    private String nome;
    private int jogadores;
    private Manager[] membrosJogadores;



    public Time(String nome, int jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprimi(){
        if(membrosJogadores != null){
            for (Manager membrosJogadore : membrosJogadores) {
                System.out.println(membrosJogadore.getNome());
            }

        }
    }

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getJogadores() {
        return jogadores;
    }

    public void setJogadores(int jogadores) {
        this.jogadores = jogadores;
    }

    public Manager[] getMembrosJogadores() {
        return membrosJogadores;
    }

    public void setMembrosJogadores(Manager[] membrosJogadores) {
        this.membrosJogadores = membrosJogadores;
    }
}

package JavaDojo.st.core.ModificadorStatic.domain;

public class CarroDomain {
    private String nome;
    private double velocidadeMaxima;
    private double velocidadeLimite = 250;

    public CarroDomain(String nome, double velocidadeMaxima) {
        this.nome = nome;

        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }

    public void imprimirCarro(){
        System.out.println(this.nome);System.out.println(this.velocidadeMaxima);System.out.println(this.velocidadeLimite);
    }


}

package JavaDojo.st.core.metodos;

public class Player {
    private String nome;
    private String console;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }   public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void imprime(){
        System.out.println(
                this.nome
        );   System.out.println(
                this.console
        );   System.out.println(
                this.idade
        );
    }


}

package Ex.Projects.Members.domain;

public class Member {
    public String nome;
    public int idade;
    public double salario;

    public void imprimeMember(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
    }
}

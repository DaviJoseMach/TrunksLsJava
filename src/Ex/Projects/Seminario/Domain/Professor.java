package Ex.Projects.Seminario.Domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;
    private Apresentador[] apresentador;

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void emprimir() {
        System.out.println("--- Seminarios ---");
        System.out.println("Professor " + this.nome);
        if(this.seminarios == null) return;
        System.out.println("## Seminarios ##");
        for(Seminario seminario : this.seminarios){
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if(seminario.getApresentadores() == null) continue;
            for(Apresentador apresentadores : seminario.getApresentadores()){
                System.out.println(apresentadores.getNome() + apresentadores.getIdade());
            }


        }
    }
}

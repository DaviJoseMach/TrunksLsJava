package JavaDojo.st.core.test;

import JavaDojo.st.core.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Pedro";
        pessoa.idade = 15;
        pessoa.sexo = 'M';
        System.out.println(pessoa.nome);
    }
}

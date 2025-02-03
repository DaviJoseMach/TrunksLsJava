package JavaDojo.st.core.Associacao.test;

import JavaDojo.st.core.Associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Neymar");
        Jogador jogador02 = new Jogador("Messi");
        Jogador jogador03 = new Jogador("CR7");

        Jogador[] jogadores = {jogador01, jogador02, jogador03};

        for(Jogador jogador : jogadores){jogador.imprimir();}

    };
}




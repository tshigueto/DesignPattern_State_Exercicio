package exercicioState.cliente;

import exercicioState.modelo.Jogador;

public class Gerenciador {

    public static void main(String[] args) {
        Jogador jogador = new Jogador("Shigueto");
        jogador.acionarAbaixando();
        jogador.acionarCorrendo();
        jogador.acionarEsperando();
        jogador.acionarPulando();
        jogador.acionarPendente();
    }
}



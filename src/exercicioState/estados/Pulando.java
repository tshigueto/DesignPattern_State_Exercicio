package exercicioState.estados;

import exercicioState.modelo.Jogador;

public class Pulando implements Estados {

    private String estadoAtual = "Pulando";
    private Jogador jogador;

    public Pulando(Jogador jogador) {
        this.jogador = jogador;
    }

    @Override
    public void esperando() {
        jogador.setEstado(new Esperando(jogador));
    }

    @Override
    public void correndo() {
        jogador.setEstado(new Correndo(jogador));
    }

    @Override
    public void abaixando() {
        jogador.setEstado(new Abaixando(jogador));
    }

    @Override
    public void pendente() {
        System.out.println("Não concluiu missão!");
    }

    @Override
    public String toString() {
        return "Estado: " + estadoAtual;
    }
}

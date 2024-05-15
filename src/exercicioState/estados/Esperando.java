package exercicioState.estados;

import exercicioState.modelo.Jogador;

public class Esperando implements Estados {

    private String estadoAtual = "Esperando";
    private Jogador jogador;

    public Esperando(Jogador jogador) {
        this.jogador = jogador;
    }

    @Override
    public void pulando() {
        jogador.setEstado(new Pulando(jogador));
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

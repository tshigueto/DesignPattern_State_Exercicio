package exercicioState.estados;

import exercicioState.modelo.Jogador;

public class Abaixando implements Estados {
    
    private String estadoAtual = "Abaixando";
    private Jogador jogador;

    public Abaixando(Jogador jogador) {
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
    public void pulando() {
        jogador.setEstado(new Pulando(jogador));
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

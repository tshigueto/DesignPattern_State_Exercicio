package exercicioState.estados;

import exercicioState.modelo.Jogador;

public class Pendente implements Estados {
    private String estadoAtual = "Pendente";
    private Jogador jogador;

    public Pendente(Jogador jogador) {
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

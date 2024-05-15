package exercicioState.modelo;

import exercicioState.estados.Estados;
import exercicioState.estados.Pendente;

public class Jogador {

    private String nome;
    private Estados estado;

    public Jogador(String nome) {
        estado = new Pendente(this);
        this.nome = nome;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
        System.out.println(getEstado());
    }

    public void acionarAbaixando() {
        estado.abaixando();
    }

    public void acionarPendente() {
        estado.pendente();
    }

    public void acionarCorrendo() {
        estado.correndo();
    }

    public void acionarEsperando() {
        estado.esperando();
    }

    public void acionarPulando() {
        estado.pulando();
    }
}
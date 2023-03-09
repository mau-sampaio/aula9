package aula09;

import java.util.ArrayList;

public class Carro {

    private Integer velocidadeMaxima;
    private String marca;
    private Motor motor;
    private ArrayList<Roda> rodas;

    public Carro(String marcar) {
        this.marca = marcar;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getMarcar() {
        return marca;
    }

    public void setMarcar(String marcar) {
        this.marca = marcar;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public ArrayList<Roda> getRodas() {
        return rodas;
    }

    public void setRodas(ArrayList<Roda> rodas) {
        this.rodas = rodas;
    }

    public void trocarRodas(Roda rodaTrocar){


    }
}

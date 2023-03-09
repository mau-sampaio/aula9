package aula09;

public class Roda {
    private Double tamanho;
    private String fabricante;

    public Roda(Double tamanho, String fabricante) {
        this.tamanho = tamanho;
        this.fabricante = fabricante;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}

package aula09;

public class Motor {
    private String fabricante;
    private String potencia;

    public Motor(String fabricante, String potencia) {
        this.fabricante = fabricante;
        this.potencia = potencia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
}

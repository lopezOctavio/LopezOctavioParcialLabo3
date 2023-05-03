package models;

public class Notebooks extends Producto{
    private Integer memoria;

    public Notebooks() {
    }

    public Notebooks(Integer stock, String nombre, Double precio, Integer memoria) {
        super(stock, nombre, precio);
        this.memoria = memoria;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebooks{" +
                "memoria=" + memoria +
                "} " + super.toString();
    }
}

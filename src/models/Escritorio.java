package models;

public class Escritorio extends Muebles{
    private Integer alto;
    private Integer ancho;

    public Escritorio() {
    }

    public Escritorio(Integer stock, String nombre, Double precio, Integer alto, Integer ancho) {
        super(stock, nombre, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Escritorio{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                "} " + super.toString();
    }
}

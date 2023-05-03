package models;

public class Impresora extends Producto{
    private Integer impMinuto;

    public Impresora() {
    }

    public Impresora(Integer stock, String nombre, Double precio, Integer impMinuto) {
        super(stock, nombre, precio);
        this.impMinuto = impMinuto;
    }

    public Integer getImpMinuto() {
        return impMinuto;
    }

    public void setImpMinuto(Integer impMinuto) {
        this.impMinuto = impMinuto;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "impMinuto=" + impMinuto +
                "} " + super.toString();
    }
}

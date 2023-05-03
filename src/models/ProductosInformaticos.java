package models;

public class ProductosInformaticos extends Producto{
    private String fabricante;

    public ProductosInformaticos() {
    }

    public ProductosInformaticos(Integer stock, String nombre, Double precio, String fabricante) {
        super(stock, nombre, precio);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "ProductosInformaticos{" +
                "fabricante='" + fabricante + '\'' +
                "} " + super.toString();
    }
}

package models;

public class Silla extends Muebles{
    private Boolean traeRuedas;

    public Silla() {
    }

    public Silla(Integer stock, String nombre, Double precio, Boolean traeRuedas) {
        super(stock, nombre, precio);
        this.traeRuedas = traeRuedas;
    }

    public Boolean getTraeRuedas() {
        return traeRuedas;
    }

    public void setTraeRuedas(Boolean traeRuedas) {
        this.traeRuedas = traeRuedas;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "traeRuedas=" + traeRuedas +
                "} " + super.toString();
    }
}

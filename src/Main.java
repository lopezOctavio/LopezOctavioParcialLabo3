import contenedora.Oficina;
import models.Escritorio;
import models.Impresora;
import models.Notebooks;
import models.Silla;

public class Main {
    public static void main(String[] args) {

        //CREO LOS OBJETOS CON SUS ATRIBUTOS PARA PROBAR

        Silla silla1 = new Silla(100, "Griega", 500.0, false);
        Escritorio escritorio1 = new Escritorio(200, "Generico", 5000.0, 1,2);
        Impresora impresora1 = new Impresora(1, "HP2323", 1500.0, 200);
        Notebooks note1 = new Notebooks(4, "Victus", 200000.0, 32);


        //CREO LA OFICINA QUE VA A CONTENER LOS PRODUCTOS
        Oficina oficina1 = new Oficina();


        //AGREGO LOS ELEMENTOS AL ARRAY
        oficina1.addProducto(silla1);
        oficina1.addProducto(escritorio1);
        oficina1.addProducto(impresora1);
        oficina1.addProducto(note1);

        //MUESTRO LOS PRODUCTOS DEL ARRAY
        System.out.println(oficina1.listarProductos());

        //APLICO LOS DESCUENTOS
        Double desc1 = silla1.descuento(10.0);
        Double desc2 = escritorio1.descuento(20.0);

        //LOS SETEO PARA QUE SE MODIFIQUEN
        silla1.setPrecio(desc1);
        escritorio1.setPrecio(desc2);

        //MUESTRO TODOS LOS PRODUCTOS NUEVAMENTE CON DESCUENTO EN SILLAS Y ESCRITORIOS
        System.out.println(oficina1.listarProductos());

        //ACTUALIZO LOS PRECIOS DE TODOS LOS PRODUCTOS
        System.out.println(oficina1.actualizarPrecios(5,10,15,20));

        //VUELVO A MOSTRAR PERO ESTA VEZ CON LOS AUMENTOS
        System.out.println(oficina1.listarProductos());

    }
}
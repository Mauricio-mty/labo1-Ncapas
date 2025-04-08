package Services;

import Classes.Venta;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Classes.libro;

public class ventaService {
    private List<Venta> ventas = new ArrayList<>();
    private libroService ls; 

   
    public ventaService(libroService ls) {
        this.ls = ls;
    }

    public void newVenta(Scanner s){
        System.out.print("Ingrese ID del producto: ");
        int idProducto = s.nextInt();
        s.nextLine(); // Limpiar buffer

        if(!ls.existeLibro(idProducto)) {
            System.out.println("Error: El libro con ID " + idProducto + " no existe");
            return;
        }

        System.out.print("Ingrese la cantidad: ");
        int cantidad = s.nextInt();
        s.nextLine(); // Limpiar buffer

        System.out.print("Ingrese el total: ");
        double total = s.nextDouble();
        s.nextLine(); // Limpiar buffer

        String fecha = LocalDate.now().toString();

        Venta nuevo = new Venta(cantidad, fecha, idProducto, idNumber(), total);
        ls.actualizarVentasLibro(idProducto, cantidad); 
        ventas.add(nuevo);

        System.out.println("Venta registrada con éxito.");
    }

    public List<Venta> getAllSales() {
        return ventas;
    }

    //Generador idVenta 
    String idNumber(){
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter formateadorHora = DateTimeFormatter.ofPattern("HHmmss");
        String horaFormateada = horaActual.format(formateadorHora);
        return fechaActual.getYear() + "-" + horaFormateada;
    }
}

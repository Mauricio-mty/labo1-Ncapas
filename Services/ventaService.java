package Services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.Venta;

public class ventaService {
    private List<Venta> ventas = new ArrayList<>();

    public void newVenta(Scanner s){
        System.out.print("Ingrese nombre producto");
        String producto = s.nextLine();

        System.out.print("Ingrese la cantidad");
        int cantidad = s.nextInt();

        /*Debe ir la funcion que verifique producto si existe se obtiene el id del producto*/
        /*Debe ir la funcion  que calcule el total seria con precio de libro * cantidad*/
        String fecha = LocalDate.now().toString();

        Venta nuevo = new Venta(cantidad,fecha,4,idNumber(), 5.99);
        ventas.add(nuevo);

    }

    String idNumber(){
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();

        DateTimeFormatter formateadorHora = DateTimeFormatter.ofPattern("HHmmss");
        String horaFormateada = horaActual.format(formateadorHora);


        String resultado = fechaActual.getYear() + "-" + horaFormateada;
        System.out.println("Nuevo id:" + resultado);
        return resultado;
    }
}

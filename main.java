import Services.ventaService;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean O=true;
      Scanner s = new Scanner(System.in);
      ventaService venta = new ventaService();

       do {
           System.out.println("""
                              Gestion liberia
                              Tepresento las siguientes opciones
                              1-Nueva Venta
                              2-Listar ventas
                              3-Detalle de venta
                              4-Salir""");
           int entero = s.nextInt();
            switch (entero){
                case 1:  venta.newVenta(s);
                    break;
                case 2:
                case 3:
                case 4: O=false; break;
                default:System.out.println("Opcion no valida");
            }
       }while (O);

           s.close();
        //int entero = s.nextInt();

    }
}
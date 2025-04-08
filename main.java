import Services.ventaService;
import Services.libroService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean O = true;
        Scanner s = new Scanner(System.in);
        ventaService venta = new ventaService();
        libroService libro = new libroService();

        do {
            System.out.println("""
                              Gestion libreria
                              Te presento las siguientes opciones
                              1- Nueva Venta
                              2- Listar ventas
                              3- Nuevo libro
                              4- Libro más vendido
                              5- Libros con más de N ventas
                              6- Salir""");
            int opcion = s.nextInt();
            s.nextLine(); // Limpiar buffer
            
            switch (opcion) {
                case 1: 
                    venta.newVenta(s);
                    break;
                case 2: 
                    System.out.println(venta.getAllSales());
                    break;
                case 3:
                    libro.newLibro(s);
                    break;
                case 4:
                    libro.mostrarLibroMasVendido();
                    break;
                case 5:
                    System.out.print("Ingrese cantidad mínima de ventas (N): ");
                    int n = s.nextInt();
                    s.nextLine();
                    libro.mostrarLibrosConMasDeNVentas(n);
                    break;
                case 6: 
                    O = false; 
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (O);

        s.close();
    }
}

import Services.ventaService;
import Services.libroService;
import Services.categoriaService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean O = true;
        Scanner s = new Scanner(System.in);
        libroService libro = new libroService();
        ventaService venta = new ventaService(libro);
        categoriaService categorias = new categoriaService();

        do {
            System.out.println("""
                              Gestion libreria
                              Te presento las siguientes opciones
                              1- Nueva Venta
                              2- Listar ventas
                              3- Nuevo libro
                              4- Libro más vendido
                              5- Libros con más de N ventas
                              6- Buscar libros por tipo
                              7- Salir""");
            int opcion = s.nextInt();
            s.nextLine();
        
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
                    System.out.print("Ingrese el tipo de libro a buscar: ");
                    String tipo = s.nextLine();
                    libro.buscarLibrosPorTipo(tipo);
                    break;
                case 7:
                    O = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        
        } while (O);

        s.close();
    }
}

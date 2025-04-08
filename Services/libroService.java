package Services;

import Classes.libro;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class libroService {
    private List<libro> libros = new ArrayList<>();

    public void newLibro(Scanner s) {
        System.out.print("Ingrese autor del libro: ");
        String autor = s.nextLine();

        System.out.print("Ingrese precio del libro: ");
        float precio = s.nextFloat();
        s.nextLine(); // Limpiar buffer

        System.out.print("Ingrese tipo de libro: ");
        String tipoLibro = s.nextLine();

        System.out.print("Ingrese ventas totales: ");
        int ventasTotales = s.nextInt();
        s.nextLine(); // Limpiar buffer

        libro nuevo = new libro(autor, Integer.parseInt(idNumber()), precio, tipoLibro, ventasTotales);
        libros.add(nuevo);
    }

    public List<libro> getAllBooks() {
        return libros;
    }

    public boolean existeLibro(int idLibro) {
        for (libro l : libros) {
            if (l.getId_libro() == idLibro) {
                return true;
            }
        }
        return false;
    }

    public void actualizarVentasLibro(int idLibro, int cantidad) {
        for (libro l : libros) {
            if (l.getId_libro() == idLibro) {
                l.setVentas_totales(l.getVentas_totales() + cantidad);
                break;
            }
        }
    }

    // Generador idLibro (mismo que en ventaService)
    String idNumber() {
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter formateadorHora = DateTimeFormatter.ofPattern("HHmmss");
        String horaFormateada = horaActual.format(formateadorHora);
        String resultado = fechaActual.getYear() + "-" + horaFormateada;
        System.out.println("Nuevo id:" + resultado);
        return resultado;
    }

    public libro getLibroMasVendido() {
        if (libros.isEmpty()) {
            return null;
        }
        
        libro masVendido = libros.get(0);
        for (libro l : libros) {
            if (l.getVentas_totales() > masVendido.getVentas_totales()) {
                masVendido = l;
            }
        }
        return masVendido;
    }

    public List<libro> getLibrosConMasDeNVentas(int n) {
        List<libro> resultado = new ArrayList<>();
        for (libro l : libros) {
            if (l.getVentas_totales() > n) {
                resultado.add(l);
            }
        }
        return resultado;
    }

    public void mostrarLibroMasVendido() {
        libro masVendido = getLibroMasVendido();
        if (masVendido != null) {
            System.out.println("Libro más vendido: " + masVendido.getAutor() + 
                             " con " + masVendido.getVentas_totales() + " ventas");
        } else {
            System.out.println("No hay libros registrados");
        }
    }

    public void mostrarLibrosConMasDeNVentas(int n) {
        List<libro> librosFiltrados = getLibrosConMasDeNVentas(n);
        if (librosFiltrados.isEmpty()) {
            System.out.println("No hay libros con más de " + n + " ventas");
        } else {
            System.out.println("Libros con más de " + n + " ventas:");
            for (libro l : librosFiltrados) {
                System.out.println("- " + l.getAutor() + ": " + l.getVentas_totales() + " ventas");
            }
        }
    }
}

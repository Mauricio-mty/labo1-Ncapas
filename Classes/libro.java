package Classes;

public class libro {
    private int id_libro;
    private String autor;
    private float precio;
    private int ventas_totales;
    private String tipo_libro;

    public libro(String autor, int id_libro, float precio, String tipo_libro, int ventas_totales) {
        this.autor = autor;
        this.id_libro = id_libro;
        this.precio = precio;
        this.tipo_libro = tipo_libro;
        this.ventas_totales = ventas_totales;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getVentas_totales() {
        return ventas_totales;
    }

    public void setVentas_totales(int ventas_totales) {
        this.ventas_totales = ventas_totales;
    }

    public String getTipo_libro() {
        return tipo_libro;
    }

    public void setTipo_libro(String tipo_libro) {
        this.tipo_libro = tipo_libro;
    }
}

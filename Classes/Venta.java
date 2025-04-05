package Classes;

public class venta {
    String idVenta;
    int idLibro;
    int cantidad;
    String fecha;
    Float total;
    boolean estado;

    public venta(int cantidad, boolean estado, String fecha, int idLibro, String idVenta, Float total) {
        this.cantidad = cantidad;
        this.estado = estado;
        this.fecha = fecha;
        this.idLibro = idLibro;
        this.idVenta = idVenta;
        this.total = total;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public Float getTotal() {
        return total;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
}

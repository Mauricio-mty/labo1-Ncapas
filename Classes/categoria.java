package Classes;

public class categoria {
    private String tipo;
    private String descripcion;

    public categoria(String descripcion, String tipo) {
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}

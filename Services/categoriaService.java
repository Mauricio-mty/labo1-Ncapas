package Services;

import Classes.categoria;
import java.util.ArrayList;
import java.util.List;

public class categoriaService {
    private List<categoria> categorias = new ArrayList<>();

    public void agregarCategoria(categoria c) {
        categorias.add(c);
    }

    public List<categoria> getCategorias() {
        return categorias;
    }

    public categoria buscarCategoriaPorTipo(String tipo) {
        for (categoria c : categorias) {
            if (c.getTipo().equalsIgnoreCase(tipo)) {
                return c;
            }
        }
        return null;
    }
}

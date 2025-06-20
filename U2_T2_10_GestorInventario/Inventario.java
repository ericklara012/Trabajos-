package U2_T2_10_GestorInventario;

public class Inventario {
   private Producto[] productos;

    public Inventario(Producto[] productos) {
        this.productos = productos;
    }


    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public boolean agregarProducto(Producto p) {
        for (int e = 0; e < productos.length; e++) {
            if (productos[e] == null) {
                productos[e] = p;
            }
        }
        return false;
    }

    public boolean eliminarProducto(String codido) {
        for (int e = 0; e < productos.length; e++) {
            if (productos[e] != null) {
                productos[e] = null;
                return true;
            }
        }
        return false;
    }
   public Producto buscar (String codigo){
for (int e=0; e < productos.length; e++) {
    if (productos[e] != null && productos[e].getCodigo().equals(codigo)) {
                return productos[e];
            }
        }
        return null;
    }

    public int totalItems() {
        int total = 0;
        for (int e = 0; e < productos.length; e++) {
            if (productos[e] != null) {
                total += productos[e].getCantidad();
            }
        }
        return total;
    }
}







package U2_T2_10_GestorInventario;

public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario(new Producto[3]);
        Producto p1 = new Producto("1", "Celular", 1);
        Producto p2 = new Producto("2", "Playera", 1);
        Producto p3 = new Producto("3", "Tenis", 1);
        Producto p4 = new Producto("4", "Dulce", 1);
        Producto p5 = new Producto("5","Gorra",1);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);

        System.out.println("Total de productos en inventario: " + inventario.totalItems());


        System.out.println(inventario.buscar("1"));

        System.out.println(inventario.buscar("7"));

        inventario.eliminarProducto("2");

        System.out.println("Total de productos en inventario: " + inventario.totalItems());

        inventario.agregarProducto(p5);

        System.out.println("Total de productos en inventario: " + inventario.totalItems());

        }
    }

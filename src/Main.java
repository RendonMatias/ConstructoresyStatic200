

public class Main {
    public static void main(String[] args) {

        // Contador inicial
        System.out.println("Total: " + Producto.getTotalCreados());

        // Crear primer producto
        Producto producto1 = new Producto("Mouse", 20, "Tecnologia");

        System.out.println("Total: " + Producto.getTotalCreados());

        // Crear otros productos
        Producto producto2 = new Producto("Teclado", 35, "Tecnologia");
        Producto producto3 = new Producto("Monitor", 150, "Electronica");

        System.out.println("Total: " + Producto.getTotalCreados());

        // Mostrar primer producto
        System.out.println("PRODUCTO 1");
        System.out.println("ID: " + producto1.getId());
        System.out.println("Nombre: " + producto1.getNombre());
        System.out.println("Precio: " + producto1.getPrecio());
        System.out.println("Categoria: " + producto1.getCategoria());

        // Mostrar segundo producto
        System.out.println("PRODUCTO 2");
        System.out.println("ID: " + producto2.getId());
        System.out.println("Nombre: " + producto2.getNombre());
        System.out.println("Precio: " + producto2.getPrecio());
        System.out.println("Categoria: " + producto2.getCategoria());

        // Mostrar tercer producto
        System.out.println("PRODUCTO 3");
        System.out.println("ID: " + producto3.getId());
        System.out.println("Nombre: " + producto3.getNombre());
        System.out.println("Precio: " + producto3.getPrecio());
        System.out.println("Categoria: " + producto3.getCategoria());
    }
}

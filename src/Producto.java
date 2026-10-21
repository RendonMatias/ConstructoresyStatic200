
public class Producto {

    private String nombre;
    private double precio;
    private String categoria;
    private int id;

    // Contador compartido
    private static int contador = 0;

    // Constructor
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;

        contador++;
        this.id = contador;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getId() {
        return id;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Metodo static
    public static int getTotalCreados() {
        return contador;
    }
}


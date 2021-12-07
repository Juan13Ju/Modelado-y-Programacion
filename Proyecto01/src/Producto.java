/**
 * Clase que representa un producto de la tienda
 */
public class Producto {
    
    /**
     * Nombre del producto
     */
    private String nombre;
    
    /**
     * Codigo de barras
     */
    private String codigobarras;
    
    /**
     * Departamento al que pertenece el producto
     */
    private String departamento;
    
   /**
    * Precio del producto
    */
    private double precio;

    /**
    * Metodo que da el nombre del producto
    */
    public String getNombre() {
        return nombre;
    }

    /**
    * Metodo que da el codigo de barras del producto
    */
    public String getCodigobarras() {
        return codigobarras;
    }

    /**
    * Metodo que da el departamento al que pertenece el producto
    */
    public String getDepartamento() {
        return departamento;
    }

    /**
    * Metodo que da el precio del producto
    */
    public double getPrecio() {
        return precio;
    }

    public Producto(String nombre, String codigobarras, String departamento, double precio) {
        this.nombre = nombre;
        this.codigobarras = codigobarras;
        this.departamento = departamento;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", codigo de barras: " + codigobarras + ", departamento: " + departamento + ", precio: $" + precio + "\n";
    }
    
    
    
}

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
     * Departamento
     */
    private String departamento;
    
   /**
    * Precio
    */
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public String getCodigobarras() {
        return codigobarras;
    }

    public String getDepartamento() {
        return departamento;
    }

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

/**
 * Clase baguette que representa la base de nuestros Baguette
 */
public abstract class Baguette{

    /**
     * La descripcion de la baguette/producto
     */
    String description;

    /**
     * Regresa la descripcion del producto
     * @return La descripicion del producto
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * Regresa el costo del producto
     * @return El costo del producto
     */
    public abstract double costo();
}
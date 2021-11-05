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

    /**
     * Metodo para imprimir le ticket de la orden
     * @return Un string con la descripcion del producto y su costo
     */
    public void printTicket(){
        System.out.println(this.getDescription() + "\n" + this.costo());
    }
}
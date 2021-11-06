/**
 * Clase abstracta que para representar una pizza, es abstracta para evitar crear instancias
 * de la clase sin que sean una pizza en especifico y no escribir los metodos getters en cada subclase
 */
public abstract class Pizza{

    public String queso;
    public String carne;
    public String masa;
    public double costo;

    /**
     * @return El tipo de queso de la pizza
     */
    public String getQueso(){
        return this.queso;
    }

    /**
     * @return EL tipo de carne de la pizza
     */
    public String getCarne(){
        return this.carne;
    }

    /**
     * @return El tipo de masa de la pizza
     */
    public String getMasa(){
        return this.masa;
    }

    /**
     * @return El costo de la pizza
     */
    public double getCosto(){
        return this.costo;
    }
}

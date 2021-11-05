/**
 * Clase que representa al pepperoni como ingrediente de una baguette
 */
class Pepperoni extends BaguetteDecorator{

    Baguette bg;

    public Pepperoni(Baguette bg){

        this.bg = bg;
    }

/**
 * Metodo que da la descripcion del ingrediente
 */
    @Override
    public String getDescription(){

        return bg.getDescription() + ", pepperoni";
    }
    
/**
 * Metodo que da el precio del ingrediente
 */
    @Override
    public double costo(){

        return bg.costo() + 12.2;
    }
}

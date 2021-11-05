/**
 * Clase que representa al pollo como ingrediente de una baguette
 */
class Pollo extends BaguetteDecorator{
    
    Baguette bg;

    public Pollo(Baguette bg){

        this.bg = bg;
    }

/**
 * Metodo que da la descripcion del ingrediente
 */
    @Override
    public String getDescription(){

        return bg.getDescription() + " , pollo";
    }
    
/**
 * Metodo que da el precio del ingrediente
 */
    @Override
    public double costo(){
        
        return bg.costo() + 10.5;
    }
}

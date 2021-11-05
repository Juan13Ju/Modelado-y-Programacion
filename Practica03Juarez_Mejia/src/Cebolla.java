/**
 * Clase que representa a la cebolla como ingrediente de una baguette
 */
class Cebolla extends BaguetteDecorator{
    
    Baguette bg;

    public Cebolla(Baguette bg){

        this.bg = bg;
    }

/**
 * Metodo que da la descripcion del ingrediente
 */
    @Override
    public String getDescription(){

        return bg.getDescription() + " , cebolla";
    }
    
/**
 * Metodo que da el precio del ingrediente
 */
    @Override
    public double costo(){
        
        return bg.costo() + 1.02;
    }
}

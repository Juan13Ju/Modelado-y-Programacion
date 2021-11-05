/**
 * Clase que representa a la catsup como ingrediente de una baguette
 */
class Catsup extends BaguetteDecorator{
    
    Baguette bg;

    public Catsup(Baguette bg){

        this.bg = bg;
    }

/**
 * Metodo que da la descripcion del ingrediente
 */
    @Override
    public String getDescription(){

        return bg.getDescription() + " , catsup";
    }
    
/**
 * Metodo que da el precio del ingrediente
 */
    @Override
    public double costo(){
        
        return bg.costo() + 2.04;
    }
}

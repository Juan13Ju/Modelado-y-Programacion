/**
 * Clase que representa al jitomate como ingrediente de una baguette
 */
class Jitomate extends BaguetteDecorator{
    
    Baguette bg;

    public Jitomate(Baguette bg){

        this.bg = bg;
    }

/**
 * Metodo que da la descripcion del ingrediente
 */
    @Override
    public String getDescription(){

        return bg.getDescription() + " , jitomate";
    }
    
/**
 * Metodo que da el precio del ingrediente
 */
    @Override
    public double costo(){
        
        return bg.costo() + 1.5;
    }
}

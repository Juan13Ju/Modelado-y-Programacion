
/**
 * Clase que representa a la mostaza como ingrediente de una baguette
 */
class Mostaza extends BaguetteDecorator{
    
    Baguette bg;

    public Mostaza(Baguette bg){

        this.bg = bg;
    }

/**
 * Metodo que da la descripcion del ingrediente
 */
    @Override
    public String getDescription(){

        return bg.getDescription() + " , mostaza";
    }
    
/**
 * Metodo que da el precio del ingrediente
 */
    @Override
    public double costo(){
        
        return bg.costo() + 2.04;
    }
}

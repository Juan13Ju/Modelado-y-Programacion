/**
 * Clase que representa a la mayonesa como ingrediente de una baguette
 */
class Mayonesa extends BaguetteDecorator{
    
    Baguette bg;

    public Mayonesa(Baguette bg){

        this.bg = bg;
    }

/**
 * Metodo que da la descripcion del ingrediente
 */
    @Override
    public String getDescription(){

        return bg.getDescription() + " , mayonesa";
    }
    
/**
 * Metodo que da el precio del ingrediente
 */
    @Override
    public double costo(){
        
        return bg.costo() + 2.04;
    }
}

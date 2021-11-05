/**
 * Clase que representa al pollo como ingrediente de una baguette
 */
class Pollo extends BaguetteDecorator{
    
    Baguette bg;

    public Pollo(Baguette bg){

        this.bg = bg;
    }

    @Override
    public String getDescription(){

        return bg.getDescription() + " ,pollo";
    }

    @Override
    public double costo(){
        
        return bg.costo() + 10.5;
    }
}
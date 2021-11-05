/**
 * Clase que representa a la lechuga como ingrediente de una baguette
 */
class Lechuga extends BaguetteDecorator{

    Baguette bg;

    public Lechuga(Baguette bg){

        this.bg = bg;
    }
  
 /**
 * Metodo que da la descripcion del ingrediente
 */
    @Override
    public String getDescription(){

        return bg.getDescription() + ", lechuga";
    }

  /**
 * Metodo que da el precio del ingrediente
 */
    @Override
    public double costo(){

        return bg.costo() + 0.93;
    }
}

/**
 * Clase que representa al jamon como ingrediente de una baguette
 */
class Jamon extends BaguetteDecorator{

    Baguette bg;

    public Jamon(){

        this.bg = bg;
    }

/**
 * Metodo que da la descripcion del ingrediente
 */
    @Override
    public String getDescription(){

        return bg.getDescription() + ", jamon";
    }

/**
 * Metodo que da el precio del ingrediente
 */
    @Override
    public double costo(){

        return bg.costo() + 7.6;
    }
}

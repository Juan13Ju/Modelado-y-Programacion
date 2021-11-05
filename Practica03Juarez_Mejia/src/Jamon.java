class Jamon extends BaguetteDecorator{

    Baguette bg;

    public Jamon(){

        this.bg = bg;
    }

    @Override
    public String getDescription(){

        return bg.getDescription() + ", jamon";
    }

    @Override
    public double costo(){

        return bg.costo() + 7.6;
    }
}
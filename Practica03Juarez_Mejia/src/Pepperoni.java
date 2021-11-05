class Pepperoni extends BaguetteDecorator{

    Baguette bg;

    public Pepperoni(Baguette bg){

        this.bg = bg;
    }

    @Override
    public String getDescription(){

        return bg.getDescription() + ", pepperoni";
    }

    @Override
    public double costo(){

        return bg.costo() + 12.2;
    }
}
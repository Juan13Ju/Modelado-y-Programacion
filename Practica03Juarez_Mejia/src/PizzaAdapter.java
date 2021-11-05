class PizzaAdapter extends Baguette{

    Pizza pizza;

    public PizzaAdapter(Pizza pizza){

        this.pizza = pizza;
    }

    @Override
    public String getDescription(){
        String queso = pizza.getQueso();
        String carne = pizza.getCarne();
        String masa = pizza.getMasa();
        return "Lista de ingredientes: \n " + masa + " ,queso " + queso + " y " + carne;
    }

    @Override
    public double costo(){
        return pizza.getCosto();
    }
}
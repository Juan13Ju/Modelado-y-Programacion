
/**
 * Clase adapter para recrear el comportamiento del ticket de baguette
 * utilizando los metodos ya existentes en la clase pizza
 */
class PizzaAdapter extends Baguette{

    Pizza pizza;

    public PizzaAdapter(Pizza pizza){

        this.pizza = pizza;
    }

    /**
     * @return La descripicion de la pizza
     */
    @Override
    public String getDescription(){
        String queso = pizza.getQueso();
        String carne = pizza.getCarne();
        String masa = pizza.getMasa();
        return "Lista de ingredientes: \n " + masa + " ,queso " + queso + " y " + carne;
    }

    /**
     * @return El costo de la pizza
     */
    @Override
    public double costo(){
        return pizza.getCosto();
    }
}

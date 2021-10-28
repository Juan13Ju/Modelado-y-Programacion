/**
 * Sub clase que define las caracteristicas de las hamburguesas de MacBurguesa que son veganas/vegetarianas
 */
class VeganBurguer extends Burguer{

    /**
     * Constructor para la hamburguesa con carne de soya como alternativa para veganos y vegetarianos
     */
    public VeganBurguer(Macburguesa ham){
        super(ham);
    }

    @Override
    public void prepararCarne(){
        
        System.out.println("Preparando la lechuga para la carne vegana...");
    }

    @Override
    public void ponerCarne(){
        System.out.println("Poniendo la carne vegana en la hamburguesa");
    }




}

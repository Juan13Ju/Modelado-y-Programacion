/**
 * Sub clase que define las caracteristicas de las hamburguesas de MacBurguesa que no son vegetarianas
 */
class NormalBurguer extends Burguer{
    
    /**
     * Constructor para la hamburguesa con carne o normal
     */
    public NormalBurguer(Macburguesa ham){
        super(ham);
    }

    @Override
    public void prepararCarne(){
        
        System.out.println("Preparando la carne de res...");
    }

    @Override
    public void ponerCarne(){
        System.out.println("Poniendo la carne de res en la hamburguesa...");
    }




}

class NormalBurguer extends Burguer{

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
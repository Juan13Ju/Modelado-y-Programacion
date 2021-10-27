class VeganBurguer extends Burguer{

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
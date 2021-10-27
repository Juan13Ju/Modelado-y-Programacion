public abstract class Burguer{

    protected Macburguesa hamburguesa;

    // Metodo template
    public Burguer(Macburguesa ham){

        this.hamburguesa = ham;
        ponerPan();
        ponerMayonesa();
        ponerMostaza();
        prepararCarne();
        ponerCarne();

        // Metodo hook de la clase 
        if(ham.getQueso()){
            ponerQueso();
        }

        ponerVegetales();
        ponerCatsup();
        ponerPan();

        System.out.println("Tu hamburguesa ha sido cocinada con exito!");
    }

    public void ponerPan(){
        System.out.println("Sacando pan de la bolsa y poniendolo...");
    }

    public void ponerMayonesa(){
        System.out.println("Embarrando la mayonesa...");
    }

    public void ponerMostaza(){
        System.out.println("Embarrandole mostaza...");
    }

    public abstract void prepararCarne();

    public abstract void ponerCarne();

    public void ponerQueso(){
        System.out.println("Derritiendo queso y colocandolo...");
    }

    public void ponerVegetales(){
        System.out.println("Poniendo vegetales...");
    }

    public void ponerCatsup(){
        System.out.println("Embarrando catusp...");
    }
}
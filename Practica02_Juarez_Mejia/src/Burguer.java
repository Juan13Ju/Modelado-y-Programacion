/**
 * Clase abstracta que define el proceso de preparacion de las hamburguesas de MacBurguesa
 */
public abstract class Burguer{

    protected Macburguesa hamburguesa;

    // El metodo construrctor sera el metodo template de la clase
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

    //Metodo que le dice al cliente en que parte del proceso se encuentra su pedido
    public void ponerPan(){
        System.out.println("Sacando pan de la bolsa y poniendolo...");
    }

    //Metodo que le dice al cliente en que parte del proceso se encuentra su pedido
    public void ponerMayonesa(){
        System.out.println("Embarrando la mayonesa...");
    }

    //Metodo que le dice al cliente en que parte del proceso se encuentra su pedido
    public void ponerMostaza(){
        System.out.println("Embarrandole mostaza...");
    }

    // Metodo template
    public abstract void prepararCarne();
    
    // Metodo template
    public abstract void ponerCarne();

    //Metodo que le dice al cliente en que parte del proceso se encuentra su pedido
    public void ponerQueso(){
        System.out.println("Derritiendo queso y colocandolo...");
    }

    //Metodo que le dice al cliente en que parte del proceso se encuentra su pedido
    public void ponerVegetales(){
        System.out.println("Poniendo vegetales...");
    }

    //Metodo que le dice al cliente en que parte del proceso se encuentra su pedido
    public void ponerCatsup(){
        System.out.println("Embarrando catusp...");
    }
}

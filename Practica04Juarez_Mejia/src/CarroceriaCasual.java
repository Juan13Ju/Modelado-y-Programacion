/**
 * Clase que representa a carroceriaCasual como un componente de carro y un tipo de carroceria
 */
public class CarroceriaCasual extends ComponenteCarro implements Carroceria{

    String tipo = " ";

    public CarroceriaCasual(){

        // Los atributos ataque, defensa, velocidad y costo de la carroceriaCasual
        super(10, 20, 30, 40);
    }
    
/**
 * Metodo que crea una carroceria del tipo casual
 */
    @Override
    public void crearCarroceria(){

        tipo = "Carroceria casual";
    }
    
/**
 * Metodo que da el tipo de carroceria
 */
    @Override
    public void getTipo(){

        System.out.println(tipo);
    }
}

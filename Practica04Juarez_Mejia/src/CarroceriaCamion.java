/**
 * Clase que representa a carroceriaCamion como un componente de carro y un tipo de carroceria
 */
public class CarroceriaCamion extends ComponenteCarro implements Carroceria{

    String tipo = " ";

    public CarroceriaCamion(){
        // Los atributos ataque, defensa, velocidad y costo de la carroceriaCamion
        super(30, 45, 38, 80);
    }
    
/**
 * Metodo que crea una carroceria del tipo camion
 */
    @Override
    public void crearCarroceria(){

        tipo = "Carroceria camion";
    }
    
/**
 * Metodo que da el tipo de carroceria
 */
    @Override
    public void getTipo(){

        System.out.println(tipo);
    }
}

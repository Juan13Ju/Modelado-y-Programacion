/**
 * Clase que representa a carroceriaDeportiva como un componente de carro y un tipo de carroceria
 */
public class CarroceriaDeportiva extends ComponenteCarro implements Carroceria{

    String tipo = " ";

    public CarroceriaDeportiva(){

        // Los atributos ataque, defensa, velocidad y costo de la carroceriaDeportiva
        super(15, 15, 45, 66);
    }
    
/**
 * Metodo que crea una carroceria del tipo camion
 */
    @Override
    public void crearCarroceria(){

        tipo = "Carroceria deportiva";
    }
    
/**
 * Metodo que da el tipo de carroceria
 */
    @Override
    public void getTipo(){

        System.out.println(tipo);
    }
}

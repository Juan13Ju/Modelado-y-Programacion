/**
 * Clase que representa a BlindajeSimple como un componente de carro y un tipo de blindaje
 */
public class BlindajeSimple extends ComponenteCarro implements Blindaje{

    String tipo = " ";

    public BlindajeSimple(){
        // Los atributos ataque, defensa, velocidad y costo del blindaje simple
        super(0, 40, 20, 50);
    }
    
/**
 * Metodo que crea un blindaje del tipo simple
 */
    @Override
    public void crearBlindaje(){

        tipo = "Blindaje simple";
    }
    
/**
 * Metodo que da el tipo de blindaje
 */
    @Override
    public void getTipo(){

        System.out.println(tipo);
    }
}

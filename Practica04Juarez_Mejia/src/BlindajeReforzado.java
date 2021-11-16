/**
 * Clase que representa a BlindajeReforzado como un componente de carro y un tipo de blindaje
 */
public class BlindajeReforzado extends ComponenteCarro implements Blindaje{

    String tipo = " ";

    public BlindajeReforzado(){
        // Los atributos ataque, defensa, velocidad y costo del blindaje reforzado
        super(34, 43, 27, 70);
    }
    
/**
 * Metodo que crea un blindaje del tipo reforzado
 */
    @Override
    public void crearBlindaje(){

        tipo = "Blindaje reforzado";
    }
    
/**
 * Metodo que da el tipo de blindaje
 */
    @Override
    public void getTipo(){

        System.out.println(tipo);
    }
}

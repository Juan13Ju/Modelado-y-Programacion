/**
 * Clase que representa a BlindajeTanque como un componente de carro y un tipo de blindaje
 */
public class BlindajeTanque extends ComponenteCarro implements Blindaje{

    String tipo = " ";

    public BlindajeTanque(){

        super(46, 84, 14, 89);
    }

 /**
 * Metodo que crea un blindaje del tipo tanque
 */
    @Override
    public void crearBlindaje(){

        tipo = "Blindaje tanque";
    }
    
/**
 * Metodo que da el tipo de blindaje
 */
    @Override
    public void getTipo(){

        System.out.println(tipo);
    }
}

/**
 * Clase que representa a LlantaSimple como un componente de carro y un tipo de llanta
 */
public class LlantaSimple extends ComponenteCarro implements Llanta{

    String tipo = " ";

    public LlantaSimple(){
        // Los atributos de ataque, defensa, velocidad y costo de la llanta
        super(20, 20, 50, 30);
    }
    
/**
 * Metodo que crea una llanta del tipo simple
 */
    @Override
    public void crearLlanta(){
        tipo = "Llanta simple";
    }

/**
 * Metodo que da el tipo de llanta
 */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }


}

/**
 * Clase que representa a LlantaDeportiva como un componente de carro y un tipo de llanta
 */
public class LlantaDeportiva extends ComponenteCarro implements Llanta{

    String tipo = " ";

    public LlantaDeportiva(){
        // Los atributos de ataque, defensa, velocidad y costo de la llanta
        super(35, 15, 90, 60);
    }

 /**
 * Metodo que crea una llanta del tipo deportiva
 */
    @Override
    public void crearLlanta(){
        tipo = "Llanta deportiva";
    }
    
/**
 * Metodo que da el tipo de llanta
 */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }


}

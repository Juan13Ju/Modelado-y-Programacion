/**
 * Clase que representa a LlantaOruga como un componente de carro y un tipo de llanta
 */
public class LlantaOruga extends ComponenteCarro implements Llanta{

    String tipo = " ";

    public LlantaOruga(){
        //Los atributos de ataque, defensa, velocidad y costo de la llantaOruga
        super(70, 90, 36, 100);
    }

 /**
 * Metodo que crea una llanta del tipo oruga de tanque
 */
    @Override
    public void crearLlanta(){
        tipo = "Llanta oruga de tanque";
    }
    
/**
 * Metodo que da el tipo de llanta
 */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }


}

/**
 * Clase que representa a LlantaTodoterreno como un componente de carro y un tipo de llanta
 */
public class LlantaTodoterreno extends ComponenteCarro implements Llanta{

    String tipo = " ";

    public LlantaTodoterreno(){
        //Los atributos de ataque, defensa, velocidad y costo de la llantaTodoterreno
        super(40, 37, 70, 80);
    }
    
 /**
 * Metodo que crea una llanta del tipo todoterreno
 */
    @Override
    public void crearLlanta(){
        tipo = "Llanta Todoterreno";
    }

/**
 * Metodo que da el tipo de llanta
 */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }


}

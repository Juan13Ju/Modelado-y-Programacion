
public class LlantaOruga extends ComponenteCarro implements Llanta{

    String tipo = " ";

    public LlantaOruga(){
        // Aqui guardamos los atributos de ataque, defensa, velocidad y costo de la llanta
        super(70, 90, 36, 100);
    }

    /**
     * Indicamos el tipo de llanta que es para despues poder imprimirlo
     */
    @Override
    public void crearLlanta(){
        tipo = "Llanta oruga de tanque";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }


}

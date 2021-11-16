public class LlantaSimple extends ComponenteCarro implements Llanta{

    String tipo = " ";

    public LlantaSimple(){
        // Aqui guardamos los atributos de ataque, defensa, velocidad y costo de la llanta
        super(20, 20, 50, 30);
    }

    /**
     * Indicamos el tipo de llanta que es para despues poder imprimirlo
     */
    @Override
    public void crearLlanta(){
        tipo = "Llanta simple";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }


}
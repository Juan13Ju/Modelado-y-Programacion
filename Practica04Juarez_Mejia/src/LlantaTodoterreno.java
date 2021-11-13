
class LlantaTodoterreno extends ComponenteCarro implements Llanta{

    String tipo = " ";

    public LlantaTodoterreno(){
        // Aqui guardamos los atributos de ataque, defensa, velocidad y costo de la llanta
        super(40, 37, 70, 80);
    }

    /**
     * Indicamos el tipo de llanta que es para despues poder imprimirlo
     */
    @Override
    public void crearLlanta(){
        tipo = "Llanta Todoterreno";
    }

    @Override
    public void getTipo(){
        System.out.println(tipo);
    }


}

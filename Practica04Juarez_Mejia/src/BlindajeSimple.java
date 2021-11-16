public class BlindajeSimple extends ComponenteCarro implements Blindaje{

    String tipo = " ";

    public BlindajeSimple(){

        super(0, 40, 20, 50);
    }

    @Override
    public void crearBlindaje(){

        tipo = "Blindaje simple";
    }

    @Override
    public void getTipo(){

        System.out.println(tipo);
    }
}
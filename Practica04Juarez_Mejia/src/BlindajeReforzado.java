class BlindajeReforzado extends ComponenteCarro implements Blindaje{

    String tipo = " ";

    public BlindajeReforzado(){

        super(34, 43, 27, 70);
    }

    @Override
    public void crearBlindaje(){

        tipo = "Blindaje reforzado";
    }

    @Override
    public void getBlindaje(){

        System.out.println(tipo);
    }
}

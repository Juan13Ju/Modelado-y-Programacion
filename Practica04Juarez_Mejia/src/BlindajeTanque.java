class BlindajeTanque extends ComponenteCarro implements Blindaje{

    String tipo = " ";

    public BlindajeTanque(){

        super(46, 84, 14, 89);
    }

    @Override
    public void crearBlindaje(){

        tipo = "Blindaje tanque";
    }

    @Override
    public void getBlindaje(){

        System.out.println(tipo);
    }
}

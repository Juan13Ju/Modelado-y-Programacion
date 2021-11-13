class ArmaMetralleta extends ComponenteCarro implements Arma{

    String tipo = " ";

    public ArmaMetralleta(){
        super(100, 90, 100, 100);
    }

    @Override
    public void crearArma(){
        tipo = "Metralleta";
    }

    @Override
    public void getArma(){
        System.out.println(tipo);
    }
}

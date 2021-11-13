class ArmaCañones extends ComponenteCarro implements Arma{

    String tipo = " ";

    public ArmaCañones(){
        super(80, 12, 60, 59);
    }

    @Override
    public void crearArma(){
        tipo = "Cañones";
    }

    @Override
    public void getArma(){
        System.out.println(tipo);
    }
}

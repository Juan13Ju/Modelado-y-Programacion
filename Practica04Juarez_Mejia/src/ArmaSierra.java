class ArmaSierra extends ComponenteCarro implements Arma{

    String tipo = " ";

    public ArmaSierra(){
        super(30, 0, 70, 12);
    }

    @Override
    public void crearArma(){
        tipo = "Sierra";
    }

    @Override
    public void getArma(){
        System.out.println(tipo);
    }
}

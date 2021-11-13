class ArmaArpones extends ComponenteCarro implements Arma{

    String tipo = " ";

    public ArmaArpones(){
        super(45, 0, 20, 40);
    }

    @Override
    public void crearArma(){
        tipo = "Arpones";
    }

    @Override
    public void getArma(){
        System.out.println(tipo);
    }
}
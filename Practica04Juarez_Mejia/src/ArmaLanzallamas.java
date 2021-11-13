class ArmaLanzallamas extends ComponenteCarro implements Arma{

    String tipo = " ";

    public ArmaLanzallamas(){
        super(60, 78, 90, 85);
    }

    @Override
    public void crearArma(){
        tipo = "Lanzallamas";
    }

    @Override
    public void getArma(){
        System.out.println(tipo);
    }
}

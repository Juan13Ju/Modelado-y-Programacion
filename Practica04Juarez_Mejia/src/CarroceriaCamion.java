class CarroceriaCamion extends ComponenteCarro implements Carroceria{

    String tipo = " ";

    public CarroceriaCamion(){

        // Los atributos ataque, defensa, velocidad y costo de la carroceria
        super(30, 45, 38, 80);
    }

    @Override
    public void crearCarroceria(){

        tipo = "Carroceria camion";
    }

    @Override
    public void getCarroceria(){

        System.out.println(tipo);
    }
}

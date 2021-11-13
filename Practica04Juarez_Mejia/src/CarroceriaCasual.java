class CarroceriaCasual extends ComponenteCarro implements Carroceria{

    String tipo = " ";

    public CarroceriaCasual(){

        // Los atributos ataque, defensa, velocidad y costo de la carroceria
        super(10, 20, 30, 40);
    }

    @Override
    public void crearCarroceria(){

        tipo = "Carroceria casual";
    }

    @Override
    public void getCarroceria(){

        System.out.println(tipo);
    }
}
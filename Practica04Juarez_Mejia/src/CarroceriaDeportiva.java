class CarroceriaDeportiva extends ComponenteCarro implements Carroceria{

    String tipo = " ";

    public CarroceriaDeportiva(){

        // Los atributos ataque, defensa, velocidad y costo de la carroceria
        super(15, 15, 45, 66);
    }

    @Override
    public void crearCarroceria(){

        tipo = "Carroceria deportiva";
    }

    @Override
    public void getCarroceria(){

        System.out.println(tipo);
    }
}

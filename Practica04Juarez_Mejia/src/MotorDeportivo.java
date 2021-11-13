class MotorDeportivo extends ComponenteCarro implements Motor{

    String tipo = " ";

    public MotorDeportivo(){
        // Los atributos del motor, ataque, defensa, velocidad y costo
        super(25, 25, 80, 60);
    }

    @Override
    public void crearMotor(){

        tipo = "Motor deportivo";
    }

    @Override
    public void getMotor(){

        System.out.println(tipo);
    }


}
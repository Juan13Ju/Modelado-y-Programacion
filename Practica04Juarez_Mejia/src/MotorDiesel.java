class MotorDiesel extends ComponenteCarro implements Motor{

    String tipo = " ";

    public MotorDiesel(){
        // Los atributos del motor, ataque, defensa, velocidad y costo
        super(33, 30, 50, 30);
    }

    @Override
    public void crearMotor(){

        tipo = "Motor diesel";
    }

    @Override
    public void getMotor(){

        System.out.println(tipo);
    }


}

public class MotorTurbo extends ComponenteCarro implements Motor{

    String tipo = " ";

    public MotorTurbo(){
        // Los atributos del motor, ataque, defensa, velocidad y costo
        super(46, 34, 68, 45);
    }

    @Override
    public void crearMotor(){

        tipo = "Motor turbo";
    }

    @Override
    public void getTipo(){

        System.out.println(tipo);
    }


}

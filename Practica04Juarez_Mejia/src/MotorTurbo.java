/**
 * Clase que representa a MotorTurbo como un componente de carro y un tipo de motor
 */
public class MotorTurbo extends ComponenteCarro implements Motor{

    String tipo = " ";

    public MotorTurbo(){
        // Los atributos de ataque, defensa, velocidad y costo del MotorTurbo
        super(46, 34, 68, 45);
    }
    
/**
 * Metodo que crea un motor del tipo turbo
 */
    @Override
    public void crearMotor(){

        tipo = "Motor turbo";
    }
    
/**
 * Metodo que da el tipo de motor
 */
    @Override
    public void getTipo(){

        System.out.println(tipo);
    }


}

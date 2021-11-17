/**
 * Clase que representa a MotorDiesel como un componente de carro y un tipo de motor
 */
public class MotorDiesel extends ComponenteCarro implements Motor{

    String tipo = " ";

    public MotorDiesel(){
        // Los atributos de ataque, defensa, velocidad y costo del motorDiesel
        super(33, 30, 50, 30);
    }
    
/**
 * Metodo que crea un motor del tipo diesel
 */
    @Override
    public void crearMotor(){

        tipo = "Motor diesel";
    }
    
/**
 * Metodo que da el tipo de motor
 */
    @Override
    public void getTipo(){

        System.out.println(tipo);
    }


}

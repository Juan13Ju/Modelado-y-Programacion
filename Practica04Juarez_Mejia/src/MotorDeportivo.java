/**
 * Clase que representa a MotorDeportivo como un componente de carro y un tipo de arma
 */
public class MotorDeportivo extends ComponenteCarro implements Motor{

    String tipo = " ";

    public MotorDeportivo(){
        // Los atributos de ataque, defensa, velocidad y costo del motorDeportivo
        super(25, 25, 80, 60);
    }
    
/**
 * Metodo que crea un motor del tipo deportivo 
 */
    @Override
    public void crearMotor(){

        tipo = "Motor deportivo";
    }
    
/**
 * Metodo que da el tipo de motor
 */
    @Override
    public void getTipo(){

        System.out.println(tipo);
    }


}

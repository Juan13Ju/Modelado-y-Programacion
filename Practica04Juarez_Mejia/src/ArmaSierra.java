/**
 * Clase que representa a armaSierra como un componente de carro y un tipo de arma
 */
public class ArmaSierra extends ComponenteCarro implements Arma{

    String tipo = " ";

    public ArmaSierra(){
        super(30, 0, 70, 12);
    }

/**
 * Metodo que crea un arma del tipo sierra
 */
    @Override
    public void crearArma(){
        tipo = "Sierra";
    }

/**
 * Metodo que da el tipo de arma
 */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}

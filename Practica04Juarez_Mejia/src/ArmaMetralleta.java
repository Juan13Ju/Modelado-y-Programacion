/**
 * Clase que representa a armaMetralleta como un componente de carro y un tipo de arma
 */
public class ArmaMetralleta extends ComponenteCarro implements Arma{

    String tipo = " ";

    public ArmaMetralleta(){
        super(100, 90, 100, 100);
    }

/**
 * Metodo que crea un arma del tipo metralleta
 */
    @Override
    public void crearArma(){
        tipo = "Metralleta";
    }

/**
 * Metodo que da el tipo de arma
 */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}

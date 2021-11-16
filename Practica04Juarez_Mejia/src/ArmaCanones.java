/**
 * Clase que representa a armaCanones como un componente de carro y un tipo de arma
 */
public class ArmaCanones extends ComponenteCarro implements Arma{

    String tipo = " ";

    public ArmaCanones(){
        // Los atributos ataque, defensa, velocidad y costo de los cañones
        super(80, 12, 60, 59);
    }

/**
 * Metodo que crea un arma del tipo cañon
 */
    @Override
    public void crearArma(){
        tipo = "Cañones";
    }

/**
 * Metodo que da el tipo de arma
 */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}

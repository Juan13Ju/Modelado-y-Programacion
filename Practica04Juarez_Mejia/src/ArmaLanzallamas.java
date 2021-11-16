/**
 * Clase que representa a armaLanzallamas como un componente de carro y un tipo de arma
 */
public class ArmaLanzallamas extends ComponenteCarro implements Arma{

    String tipo = " ";

    public ArmaLanzallamas(){
        // Los atributos ataque, defensa, velocidad y costo del lanzallamas
        super(60, 78, 90, 85);
    }

 /**
 * Metodo que crea un arma del tipo lanzallamas
 */
    @Override
    public void crearArma(){
        tipo = "Lanzallamas";
    }

/**
 * Metodo que da el tipo de arma
 */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}

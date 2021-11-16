/**
 * Clase que representa a armaArpones como un componente de carro y un tipo de arma
 */
public class ArmaArpones extends ComponenteCarro implements Arma{

    String tipo = " ";

    public ArmaArpones(){
        // Los atributos ataque, defensa, velocidad y costo de un arpon
        super(45, 0, 20, 40);
    }
    
/**
 * Metodo que crea un arma del tipo arpones
 */
    @Override
    public void crearArma(){
        tipo = "Arpones";
    }
    
/**
 * Metodo que da el tipo de arma
 */
    @Override
    public void getTipo(){
        System.out.println(tipo);
    }
}

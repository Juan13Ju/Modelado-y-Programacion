/**
 * Clase abtsracta que representa el componente de un carro para evitar
 * repetir en cada clase (Llanta, Blindaje, etc) los atributos en comun de los componentes
 */

public abstract class ComponenteCarro{

    private int ataque;
    private int defensa;
    private int velocidad;
    private int costo;

    public ComponenteCarro(int ataque, int defensa, int velocidad, int costo){
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.costo = costo;
    }
    
/**
 * Metodo que da el valor de ataque
 */
    public int getAtaque(){
        return this.ataque;
    }
    
/**
 * Metodo que da el valor de defensa
 */
    public int getDefensa(){
        return this.defensa;
    }
    
/**
 * Metodo que da el valor de velocidad
 */
    public int getVelocidad(){
        return this.velocidad;
    }
    
/**
 * Metodo que da el valor de costo
 */
    public int getCosto(){
        return this.costo;
    }
}

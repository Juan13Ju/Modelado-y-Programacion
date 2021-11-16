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

    // Metodos getters
    public int getAtaque(){
        return this.ataque;
    }

    public int getDefensa(){
        return this.defensa;
    }

    public int getVelocidad(){
        return this.velocidad;
    }

    public int getCosto(){
        return this.costo;
    }
}
/**
 * Clase que representa un auto estilo MadMax
 */

class AutoMadMax{

    Llanta llantas;
    Motor motor;
    Carroceria carroceria;
    Blindaje blindaje;
    Arma arma;
    int ataque;
    int defensa;
    int velocidad;
    int costo;

    public AutoMadMax(Llanta llantas, Motor motor, Carroceria carroceria, Blindaje blindaje, Arma arma){

        this.llantas = llantas;
        this.motor = motor;
        this.carroceria = carroceria;
        this.blindaje = blindaje;
        this.arma = arma;

        // this.ataque = getAtaque();
        // this.defensa = getDefensa();
        // this.velocidad = getVelocidad();
        // this.costo = getCosto();
    }

    // public void muestraAuto(){
    //     System.out.println("Imprimiendo caracteristicas del auto");
    //     System.out.println("Llantas: " + llantas.getTipo());
    //     System.out.println("Motor: " + motor.getTipo());
    //     System.out.println("Carroceria: " + carroceria.getTipo());
    //     System.out.println("Blindaje: " + blindaje.getTipo());
    //     System.out.println("Arma: " + arma.getTipo());
    //     TODO : Imprimir las estadisticas, ataque, velocidad,...
    // }
} 
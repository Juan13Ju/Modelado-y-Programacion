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

        this.ataque = getAtaque();
        this.defensa = getDefensa();
        this.velocidad = getVelocidad();
        this.costo = getCosto();
    }

    /**
     * Regresa el ataque total del auto, que es la suma del ataque de sus componentes
     * @return Entero representando el ataque del auto
     */
    public int getAtaque(){
        return ((ComponenteCarro)llantas).getAtaque() + ((ComponenteCarro)motor).getAtaque() 
        + ((ComponenteCarro)carroceria).getAtaque() + ((ComponenteCarro)blindaje).getAtaque() + ((ComponenteCarro)arma).getAtaque();
    }

    /**
     * Regresa la defensa total del auto
     * @return Entero representando la defensa del auto
     */
    public int getDefensa(){
        return ((ComponenteCarro)llantas).getDefensa() + ((ComponenteCarro)motor).getDefensa() 
        + ((ComponenteCarro)carroceria).getDefensa() + ((ComponenteCarro)blindaje).getDefensa() + ((ComponenteCarro)arma).getDefensa();
    }

    /**
     * Regresa la velocidad total del auto
     * @return Entero representando la valocidad del auto
     */
    public int getVelocidad(){
        return ((ComponenteCarro)llantas).getVelocidad() + ((ComponenteCarro)motor).getVelocidad() 
        + ((ComponenteCarro)carroceria).getVelocidad() + ((ComponenteCarro)blindaje).getVelocidad() + ((ComponenteCarro)arma).getVelocidad();
    }

    /**
     * Regresa el costo total del auto
     * @return Entero representando el costo del auto
     */
    public int getCosto(){
        return ((ComponenteCarro)llantas).getCosto() + ((ComponenteCarro)motor).getCosto() 
        + ((ComponenteCarro)carroceria).getCosto() + ((ComponenteCarro)blindaje).getCosto() + ((ComponenteCarro)arma).getCosto();
    }

    /**
     * Metodo para imprimir las caracteristicas del auto
     */
    public void muestraAuto(){
        System.out.println("Llantas: ");
        llantas.getTipo();
        System.out.println("Motor: ");
        motor.getTipo();
        System.out.println("Carroceria: ");
        carroceria.getTipo();
        System.out.println("Blindaje: ");
        blindaje.getTipo();
        System.out.println("Arma: ");
        arma.getTipo();
        System.out.println("Ataque: ");
        System.out.println(getAtaque());
        System.out.println("Defensa: ");
        System.out.println(getDefensa());
        System.out.println("Velocidad: ");
        System.out.println(getVelocidad());
        System.out.println("Costo: ");
        System.out.println(getCosto());
    }
} 
import java.util.LinkedList;

class Cliente implements MyObserver{

    /**
    * Nombre del cliente
    */
    private String nombre;


    private LinkedList<Servicio> servicios;

    /**
    * La cantidad de dinero del cliente
    */
    private int dinero;

    /**
     * La forma de pago del servicio usando el patron strategy
     */
    private PayStrategy payment;

    /**
    * Metodo contrusctor de un cliente
    * @param nombre El nombre del cliente
    * @param dinero La cantidad inicial de dinero del cliente
    */
    public Cliente(String nombre, int dinero){

        this.nombre = nombre;
        this.dinero = dinero;
        this.servicios = new LinkedList<Servicio>();
    }

    /**
     * Metodo para cambiar la estrategia de pago de acuerdo al servicio que se esta pagando
     * @param ser El servicio a pagar
     */
    public void setStrategy(Servicio ser){

        switch(ser.nombre){

            case "Memeflix":
            this.payment = new PayMemeflix();
            break;
            case "Momazon prime video":
            this.payment = new PayMomazon();
            break;
            case "Twitsh":
            this.payment = new PayTwitsh();
            break;
            case "Thisney+":
            this.payment = new PayThisney();
            break;
            case "Hvomax":
            this.payment = new PayHvo();
            break;
        }
    }

    /**
     * Metodo getter del atributo dinero
     * @return La cantidad de dinero del cliente
     */
    public int getDinero(){

        return this.dinero;
    }

    /**
     * Metodo setter del atributo dinero
     * @param nueva La nueva cantidad de dinero del cliente
     */
    public void setDinero(int nueva){

        this.dinero = nueva;
    }

    /**
     * Metodo getter del parametro nombre
     * @return
     */
    public String getNombre(){

        return this.nombre;
    }
    /**
     * Metodo para suscribir al cliente a un servicio con un plan 
     * @param s El servicio al que se va a suscribir
     * @param plan El plan de pago para el servicio
     */
    // TODO: Recibir el mes inicial cuando se realice la simulacion
    public void suscribirServicio(Servicio s, String plan){

        s.registerObserver(this, /* Aqui*/1, plan);
    }

    /**
     * Metodo para remover a un cliente de un Servicio
     * @param s El servicio del cual remover al cliente
     */
    public void quitarSuscripcion(Servicio s){

        s.removeObserver(this);
    }

    public void changeSubscription(Servicio ser, String sub){

        ser.infoClientes.put(this, ser.infoClientes.get(this).newSubscription(sub));
    }

    /**
     * Metodo para realizar el pago de un servicio y obtener las recomendaciones del servicio
     * @param recomendacion Un string representando una recomendacion al cliente
     * @param ser El servicio para el cual estamos actualizando al cliente
     * @param mesActual Un entero representando el mes en el que esta la simulacion, se utiliza para saber
     * si un usuario ya paso su prueba de 3 meses
     * @throws NotEnoughMoneyException Si el cliente no cuenta con dinero suficiente para pagar
     */
    @Override
    public void update(String recomendacion, Servicio ser, int mesActual) throws NotEnoughMoneyException{

        setStrategy(ser);

        if(payment.canPay(this, ser, mesActual)){
            payment.cobrar(this, ser, mesActual);

            System.out.println(
            this.nombre + ", " + ser.nombre + " te recomienda " + recomendacion + "\n" +
            "llevas " + ser.infoClientes.get(this).mesesSuscritos + " meses usando " + ser.nombre + "\n"
        );


        ser.infoClientes.put(this, ser.infoClientes.get(this).newMonth());
        } else{

            System.out.println(this.nombre + " no tienes saldo suficiente para pagar, seras dado de baja");
            throw new NotEnoughMoneyException();
        }

    }
}

import java.util.LinkedList;
import java.util.HashMap;
import java.util.Random;


// ?Si todos los metodos estan definidos, lo dejamos como abstract class?, o que sea una clase normal?

class Servicio implements Subject{

    /**
     * El nombre del servicio
     */
    String nombre;

    /**
     * HashMap donde guardamos los diferentes planes del servicio
     */
    HashMap<String, Integer> planes;

    /**
     * HashMap donde guardamos la info (plan, mes en el que se suscribe) de un cliente 
     */
    HashMap<MyObserver, InfoCliente> infoClientes;

    /**
    * Lista de clientes sucritos al servicio
     */
    LinkedList<MyObserver> listaClientes;

    /**
    Arreglo de peliculas/series del servicio para mandar las recomendaciones
     */
    String[] recomendaciones;

    /**
    * Constructor de un Servicio
    * Al inicializar el servicio, la lista de clientes es una lista vacia
    * @param recomendaciones Un arreglo con el catalogo del servicio para enviar las recomendaciones
    * @param planes Un hashmap que contiene como llaves el nombre del plan y como valor el costo del plan
     */
    public Servicio(String[] recomendaciones, String nombre, HashMap<String, Integer> planes){

        this.listaClientes = new LinkedList<>();
        this.recomendaciones = recomendaciones;
        this.nombre = nombre;
        this.planes = planes;
        this.infoClientes = new HashMap<>();
    } 

    /**
     * Metodo para registar un cliente a la lista de observadores de un servicio
     * @param obs El cliente a agregar
     * @param mesInicial El mes en el que se suscribe el cliente (Relevante en algunos casos)
     * @param plan El plan que contratara el cliente
     */
     @Override
    public void registerObserver(MyObserver obs, int mesInicial, String plan){

        this.listaClientes.add(obs);
        InfoCliente info = new InfoCliente(plan, mesInicial);
        if(this.infoClientes.containsKey(obs)){
            System.out.println(((Cliente)obs).getNombre() + " , bienvenido de vuelta a " + this.nombre + "!");
        }else{
            this.infoClientes.put(obs, info);
            System.out.println(((Cliente)obs).getNombre() + " , agradecemos que seas un nuevo cliente de " + this.nombre + "!");
        }
    }

    /**
     * Metodo para remover la suscripcion de un cliente
     * @param obs El cliente a remover
     */
    @Override
    public void removeObserver(MyObserver obs){

        int i = listaClientes.indexOf(obs);

        if(i >= 0){
            listaClientes.remove(i);
            System.out.println(((Cliente)obs).getNombre() + ", lamentamos que dejes el servicio " + this.nombre);
        }
    }

    /**
     * Metodo para informar a los clientes que ha pasado un mes
     * @param mesActual El mes actual en la simulacion (Relevante cuando el servicio cambia su cobro dependiendo de los meses suscritos)
     */
    @Override
    public void notifyObservers(int mesActual){

        // Esta lista esta porque si modificamos la lista mientras la iteramos manda un error
        LinkedList<MyObserver> noPagaron = new LinkedList<>();

        for(MyObserver o : this.listaClientes){

            try{
                o.update(this.getRecomendacion(), this, mesActual);
            }catch(NotEnoughMoneyException e){

                System.out.println("El pago no se realizo \n");
                noPagaron.add(o);
            }
        }
        // Al final, removemos a todos los clientes que no pudieron pagar
        for(MyObserver o : noPagaron){

            System.out.println(((Cliente)o).getNombre() + " seras dado de baja por falta de pago");
            ((Cliente)o).quitarSuscripcion(this);
        }
    }

    /**
     * Devuelve una seleccion aleatoria para mandarla como recomendacion al usuario
     * @return Un string representando una recomendacion para el usuario
     */
    public String getRecomendacion(){

        int rnd = new Random().nextInt(this.recomendaciones.length);
        return this.recomendaciones[rnd];
    }
}
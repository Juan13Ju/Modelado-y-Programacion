/**
 * Clase que define al robot encargado de Macburgers
 */
class Robot{

    // Atributo para saber si el robot recibio la orden del cliente para comenzar a cocinar
    public Macburguesa orden;
    
    // Atributo para saber el estado del robot 
    private EstadoRobot estadoActual;

    // Atributo para saber el menu del dia
    private Menu menuDelDia;
    
    // Atributo para saber el menu general
    private Menu menuGeneral;
    
    // Atributo para saber el menu de lujo
    private Menu menuDeLujo;

    // Atributo para saber si el robot esta en estado suspendido
    private EstadoRobot estadoSuspendido;
    
    // Atributo para saber si el robot esta en estado caminando
    private EstadoRobot estadoCaminando;
    
    // Atributo para saber si el robot esta en estado atendiendo
    private EstadoRobot estadoAtendiendo;
    
    // Atributo para saber si el robot esta en estado cocinando
    private EstadoRobot estadoCocinando;

    /**
     * Constructor para el robot
     */
    public Robot(){

        estadoSuspendido = new EstadoSuspendido(this);
        estadoCaminando = new EstadoCaminando(this);
        estadoAtendiendo = new EstadoAtendiendo(this);
        estadoCocinando = new EstadoCocinando(this);

        estadoActual = estadoSuspendido;
        orden = null;

        this.menuGeneral = new MenuGeneral();
        this.menuDelDia = new MenuDelDia();
        this.menuDeLujo = new MenuDeLujo();
    }

    /**
    * Regresa el estado del robot y nos dice si se encuentra en estado suspendido
    */
    public EstadoRobot getEstadoSuspendido(){

        return this.estadoSuspendido;
    }

    /**
    * Regresa el estado del robot y nos dice si se encuentra en estado caminando
    */
    public EstadoRobot getEstadoCaminando(){

        return this.estadoCaminando;
    }

    /**
    * Regresa el estado del robot y nos dice si se encuentra en estado atendiendo
    */
    public EstadoRobot getEstadoAtendiendo(){

        return this.estadoAtendiendo;
    }

    /**
    * Regresa el estado del robot y nos dice si se encuentra en estado cocinando
    */
    public EstadoRobot getEstadoCocinando(){

        return this.estadoCocinando;
    }

    /**
    * Modifica el estado del robot
    */
    public void setState(EstadoRobot nuevoEstado){

        this.estadoActual = nuevoEstado;
    }

    /**
     * Metodo para pasar el estado del robot a activar
     */
    public void activar(){

        estadoActual.activar();
    }

    /**
     * Metodo para pasar el estado del robot a caminar
     */
    public void caminar(){

        estadoActual.caminar();
    }

    /**
     * Metodo para pasar el estado del robot a atender
     */
    public void atender(){

        estadoActual.atender();
    }

    /**
     * Metodo para pasar el estado del robot a cocinar
     */
    public void cocinar(){

        estadoActual.cocinar();
    }

    /**
     * Metodo para pasar el estado del robot a cocinar una hamburguesa de acuerdo a su categoria vegetariana o no
     *@param ham
     */
    public void cocinar(Macburguesa ham){

        Burguer mac;

        if(ham.getVegetariana()){
            mac = new VeganBurguer(ham);
        }else{
            mac = new NormalBurguer(ham);
        }
    }

    /**
     * Metodo para pasar el estado del robot a suspendido
     */
    public void suspender(){

        estadoActual.suspender();
    }

    /**
     * Metodo para imprimir el menu del restaurante
     */
    public void printMenu(){

        MyIterator generalIterator = menuGeneral.createIterator();
        MyIterator delDiaIterator = menuDelDia.createIterator();
        MyIterator deLujoIterator = menuDeLujo.createIterator();

        System.out.println("----Menu general----");
        printMenu(generalIterator);
        System.out.println("----Menu del Dia----");
        printMenu(delDiaIterator);
        System.out.println("----Menu de Lujo----");
        printMenu(deLujoIterator);
    }

    /**
     * Metodo para imprimir los productos de un menu especifico usando su iterador
     * @param iterator El iterador que vamos a utilizar
     */
    public void printMenu(MyIterator iterator){

        while(iterator.hasNext()){

            Macburguesa mac = (Macburguesa)iterator.next();
            String id = mac.getId();
            String nombre = mac.getNombre();
            String descripcion = mac.getDescripcion();
            System.out.println(id + " " + nombre + "\n" + descripcion);
        }
    }


    /**
     * Metodo para buscar los productos de un menu especifico usando su id
     * @param id 
     */
    public void findBurguer(String id) throws InvalidIdException{

        MyIterator generalIterator = menuGeneral.createIterator();
        MyIterator delDiaIterator = menuDelDia.createIterator();
        MyIterator deLujoIterator = menuDeLujo.createIterator();

        while(generalIterator.hasNext()){
            Macburguesa ham = (Macburguesa)generalIterator.next();
            if(id.equals(ham.getId())){
                this.orden = ham;
                return;
            }
        }

        while(delDiaIterator.hasNext()){
            Macburguesa ham = (Macburguesa)delDiaIterator.next();
            
            if(id.equals(ham.getId())){
                this.orden = ham;
                return;
            }
        }

        while(deLujoIterator.hasNext()){
            Macburguesa ham = (Macburguesa)deLujoIterator.next();
            if(id.equals(ham.getId())){
                this.orden = ham;
                return;
            }
        }

        throw new InvalidIdException();
    }



}

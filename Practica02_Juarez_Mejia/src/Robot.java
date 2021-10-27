class Robot{

    // Atributo para saber si el robot recibio la orden del cliente para comenzar a cocinar
    public boolean ordenRecibida;

    private EstadoRobot estadoActual;

    private Menu menuDelDia;
    private Menu menuGeneral;
    private Menu menuDeLujo;

    private EstadoRobot estadoSuspendido;
    private EstadoRobot estadoCaminando;
    private EstadoRobot estadoAtendiendo;
    private EstadoRobot estadoCocinando;

    public Robot(){

        estadoSuspendido = new EstadoSuspendido(this);
        estadoCaminando = new EstadoCaminando(this);
        estadoAtendiendo = new EstadoAtendiendo(this);
        estadoCocinando = new EstadoCocinando(this);

        estadoActual = estadoSuspendido;
        ordenRecibida = false;

        this.menuGeneral = new MenuGeneral();
        this.menuDelDia = new MenuDelDia();
        this.menuDeLujo = new MenuDeLujo();
    }

    public EstadoRobot getEstadoSuspendido(){

        return this.estadoSuspendido;
    }

    public EstadoRobot getEstadoCaminando(){

        return this.estadoCaminando;
    }

    public EstadoRobot getEstadoAtendiendo(){

        return this.estadoAtendiendo;
    }

    public EstadoRobot getEstadoCocinando(){

        return this.estadoCocinando;
    }

    public void setState(EstadoRobot nuevoEstado){

        this.estadoActual = nuevoEstado;
    }

    public void activar(){

        estadoActual.activar();
    }

    public void caminar(){

        estadoActual.caminar();
    }

    public void atender(){

        estadoActual.atender();
    }

    public void cocinar(){

        estadoActual.cocinar();
    }

    public void suspender(){

        estadoActual.suspender();
    }

    /**
     * Metodo para imprimir el menu del restaurant
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
            int id = mac.getId();
            String nombre = mac.getNombre();
            String descripcion = mac.getDescripcion();
            System.out.println(id + " " + nombre + "\n" + descripcion);
        }
    }



}
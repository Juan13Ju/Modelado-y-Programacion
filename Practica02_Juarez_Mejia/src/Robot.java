class Robot{

    // Atributo para saber si el robot recibio la orden del cliente para comenzar a cocinar
    public boolean ordenRecibida;

    private EstadoRobot estadoActual;

    private EstadoRobot estadoSuspendido;
    private EstadoRobot estadoCaminando;
    private EstadoRobot estadoAtendiendo;
    private EstadoRobot estadoCocinando;

    public Robot(){

        estadoSuspendido = new EstadoSuspendido();
        estadoCaminando = new EstadoCaminando();
        estadoAtendiendo = new EstadoAtendiendo();
        estadoCocinando = new EstadoCocinando();

        estadoActual = estadoSuspendido;
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



}
class Robot{

    // Atributo para saber si el robot recibio la orden del cliente para comenzar a cocinar
    public boolean ordenRecibida;

    private EstadoRobot estadoActual;

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



}
class EstadoAtendiendo implements EstadoRobot{

    Robot robot;

    public EstadoAtendiendo(Robot robot){

        this.robot = robot;
    }

    @Override
    public void activar(){

        System.out.println("El robot ya esta activado y lo esta atendiendo");
    }

    @Override
    public void caminar(){

        System.out.println("El robot no puede caminar mientras atiende a un cliente");
    }

    public void atender(){

        // TODO : Mi idea es que aqui usamos iterator para leerle el menu al cliente
        System.out.println("Comenzando a leer el menu");
        // * Esto de abajo es para probar el estaod de cocinar
        System.out.println("Orden recibida, comenzando a cocinar");
        // ?Me parece que esto de abajo es innecesario porque de igual manera solo vamos a llamar al estado?
        // ?EstadoCocinando si la orden recibida es valida, entonces creo que el atributo es innecesario? 
        robot.ordenRecibida = true;
        robot.setState(robot.getEstadoCocinando());
    }

    public void cocinar(){

        System.out.println("El robot no puede cocinar sin una orden recibida");
    }

    public void suspender(){

        System.out.println("El robot no se puede suspender mientras atiende a un cliente");
    }
}
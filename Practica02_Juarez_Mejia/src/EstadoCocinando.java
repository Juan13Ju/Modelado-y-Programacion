class EstadoCocinando implements EstadoRobot{

    Robot robot;

    public EstadoCocinando(Robot robot){

        this.robot = robot;
    }

    @Override
    public void activar(){

        System.out.println("El robot ya esta activo y cocinando");
    }

    @Override
    public void caminar(){

        System.out.println("El robot no puede caminar mientras cocina");
    }

    @Override
    public void atender(){

        System.out.println("La orden ya ha sido recibida, presione cocinar para empezar el proceso de cocina");
    }

    @Override
    public void cocinar(){

        // TODO: Aqui implementamos la parte de template
        System.out.println("Cocinando... \n platillo terminado, regresando a estado suspendido");
        robot.setState(robot.getEstadoCocinando());
    }

    @Override
    public void suspender(){

        System.out.println("El robot no se puede suspender mientras camina");
    }
}
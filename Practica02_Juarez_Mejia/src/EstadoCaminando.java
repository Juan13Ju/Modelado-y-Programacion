/**
 * Estado del robot mientras esta caminando hasta llegar al cliente o ser suspendido
 */

 class EstadoCaminando implements EstadoRobot{

    Robot robot;

    public EstadoCaminando(Robot robot){

        this.robot = robot;
    }

    @Override
    public void activar(){

        System.out.println("El robot ya esta activado y caminando hacia el cliente");
    }

    @Override
    public void caminar(){

        System.out.println("El robot ya esta caminando hacia el cliente, presionar atender");
    }

    /**
     * Cuando el robot llega a la mesa, comienza a atender al cliente, por lo que cambia su estado a 
     * atendiendo
     */
    @Override
    public void atender(){

        System.out.println("El robot ha llegado al cliente, por favor presiones atender de nuevo para mostrarle el menu");

        robot.setState(robot.getEstadoAtendiendo());
    }

    @Override
    public void cocinar(){

        System.out.println("Cocinar mientras el robot camina es peligroso! en cuanto el robot llegue lo atendera");
    }

    @Override
    public void suspender(){

        System.out.println("Suspendiendo el robot... \n 3... \n 2... \n 1... \n Robot suspendido");
        robot.setState(robot.getEstadoSuspendido());
    }
 }
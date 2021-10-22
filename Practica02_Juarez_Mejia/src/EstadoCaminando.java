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

        System.out.println("El robot ya esta caminando hacia el cliente");
    }

    @Override
    public void atender(){

        System.out.println("El robot ha llegado a la mesa del cliente, comenzando a atender");

        // TODO: Aqui es donde leemos el menu con iterator

        // Mi idea es leer el menu y una vez confirmando la orden, pasar al estado cocinando
        // En la clase robot esta el atributo ordenRecibida

        robot.setState(robot.getEstadoCocinando());
    }
 }
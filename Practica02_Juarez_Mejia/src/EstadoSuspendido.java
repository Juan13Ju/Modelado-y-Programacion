/**
 * Estado en el cual el robot se encuentra suspendido, por lo cual solo se puede activar
 */

class Estadosuspendido implements EstadoRobot{

    Robot robot;

    public EstadoSuspendido(Robot robot){

        this.robot = robot;
    }

    @Override
    public void activar(){

        System.out.println("El robot ha sido activado, comenzando a caminar hacia el cliente");
        robot.setState(robot.getEstadoCaminando());
    }

    @Override
    public void caminar(){

        System.out.println("El robot no puede caminar mientras esta suspendido, seleccione la opcion de activar");
    }

    @Override
    public void atender(){

        System.out.println("El robot no lo puede atender mientras esta suspendido, seleccione la opcion de activar");
    }

    @Override
    public void cocinar(){

        System.out.println("El robot no puede cocinar mientras esta suspendido, seleccione la opcion de activar");
    }

    public void suspender(){

        System.out.println("El robot ya se encuentra suspendido");
    }
}
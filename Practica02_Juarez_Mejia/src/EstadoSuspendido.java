/**
 * Estado en el cual el robot se encuentra suspendido, por lo cual solo se puede activar.
 * Para ayudar al usuario a familiarizarse con el modo de suspesion se ha agregado un modelo de un robot en ascii.
 * De esta forma el usuario podra observar los diferentes estados de suspension en los que el robot no puede hacer
 * ciertas acciones.
 */

class EstadoSuspendido implements EstadoRobot{

    Robot robot;

    public EstadoSuspendido(Robot robot){

        this.robot = robot;
    }

	/**
 	* El robot debe estar encendido todo el tiempo esperando a que un cliente lo active, pero si no está trabajando puede estar suspendido. 
 	*/
    @Override
    public void activar(){

        System.out.println("El robot ha sido activado, comenzando a caminar hacia el cliente");
	System.out.println("    |_|");
	System.out.println("   (_**)    ¡Voy corriendo!");
	System.out.println("  __) (_");
	System.out.println(" ( )...()");
	System.out.println(" || | |||");
	System.out.println(" || | |()__/");
	System.out.println(" /|(___)");
	System.out.println(" [-]   [-]");
        
        robot.setState(robot.getEstadoCaminando());
    }

	/**
 	* El robot se encuentra suspendido por lo que no puede cambiar de estado a caminar 
 	*/
    @Override
    public void caminar(){

        System.out.println("El robot no puede caminar mientras esta suspendido, seleccione la opcion de activar");
	System.out.println("    |_|");
	System.out.println("   (_**)   Z z z");
	System.out.println("  __) (_");
	System.out.println(" ( )...()");
	System.out.println(" || | |||");
	System.out.println(" || | |()__/");
	System.out.println(" /|(___)");
	System.out.println(" [-]   [-]");
    }

	/**
 	* El robot se encuentra suspendido por lo que no puede cambiar de estado a atender
 	*/
    @Override
    public void atender(){

        System.out.println("El robot no lo puede atender mientras esta suspendido, seleccione la opcion de activar");
	System.out.println("    |_|");
	System.out.println("   (_**)   Z z z");
	System.out.println("  __) (_");
	System.out.println(" ( )...()");
	System.out.println(" || | |||");
	System.out.println(" || | |()__/");
	System.out.println(" /|(___)");
	System.out.println(" [-]   [-]");

    }

	/**
 	* El robot se encuentra suspendido por lo que no puede cambiar de estado a cocinar
 	*/
    @Override
    public void cocinar(){

        System.out.println("El robot no puede cocinar mientras esta suspendido, seleccione la opcion de activar");
	    System.out.println("   .--,--.");
	    System.out.println("   `.  ,.'");
	    System.out.println("    |___|");
	    System.out.println("  |-:o o:-|  Z z z");
	    System.out.println("   _`~^~'_");
	    System.out.println(" |'   ^   `|");
    }

	/**
 	* El robot se encuentra suspendido por lo que no es necesario suspenderlo de nuevo
 	*/
    public void suspender(){

        System.out.println("El robot ya se encuentra suspendido");
	System.out.println("      |_|");
	System.out.println("     (* *)  Deje mimir agusto");
	System.out.println("    __) (__");
	System.out.println("   ( )...( )(_)");
	System.out.println("   || |_| ||//");
	System.out.println(">==() | | ()/");
	System.out.println("    _(___)_");
	System.out.println("   [-]   [-]");
    }
}

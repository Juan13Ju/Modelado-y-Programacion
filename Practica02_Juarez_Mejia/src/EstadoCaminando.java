/**
 * Estado del robot mientras esta caminando hasta llegar al cliente o ser suspendido
 * Para ayudar al usuario a familiarizarse con el modo de activaciones se ha agregado un modelo de un robot en ascii
 * el cual ilustra cada uno de los estados posibles del robot mientras camina.
 */
 */

 class EstadoCaminando implements EstadoRobot{

    Robot robot;

    public EstadoCaminando(Robot robot){

        this.robot = robot;
    }

    @Override
    public void activar(){

        System.out.println("El robot ya esta activado y caminando hacia el cliente");
	System.out.println("    |_|");
	System.out.println("   (_**)   *Se despierta*");
	System.out.println("  __) (_");
	System.out.println(" ( )...()");
	System.out.println(" || | |||");
	System.out.println(" || | |()__/");
	System.out.println(" /|(___)");
	System.out.println(" [-]   [-]");

    }

    @Override
    public void caminar(){

        System.out.println("El robot ya esta caminando hacia el cliente, presionar atender");
	System.out.println("    |_|");
	System.out.println("   (_**)    ¡Voy corriendo!");
	System.out.println("  __) (_");
	System.out.println(" ( )...()");
	System.out.println(" || | |||");
	System.out.println(" || | |()__/");
	System.out.println(" /|(___)");
	System.out.println(" [-]   [-]");
    }

    /**
     * Cuando el robot llega a la mesa, comienza a atender al cliente, por lo que cambia su estado a 
     * atendiendo
     */
    @Override
    public void atender(){

        System.out.println("El robot ha llegado al cliente, por favor presiones atender de nuevo para mostrarle el menu");
        System.out.println("      |_|");
	System.out.println("     (* *)        ¿Que desea ordenar?");
	System.out.println("    __) (__");
	System.out.println("   ( )...( )(_)");
	System.out.println("   || |_| ||//");
	System.out.println(">==() | | ()/");
	System.out.println("    _(___)_");
	System.out.println("   [-]   [-]");

        robot.setState(robot.getEstadoAtendiendo());
    }

    @Override
    public void cocinar(){

        System.out.println("Cocinar mientras el robot camina es peligroso! en cuanto el robot llegue lo atendera");
     	System.out.println("    |_|");
	System.out.println("   (_**)   O lo atiendo o cocino?");
	System.out.println("  __) (_   no se puede ambas joven");
	System.out.println(" ( )...()");
	System.out.println(" || | |||");
	System.out.println(" || | |()__/");
	System.out.println(" /|(___)");
	System.out.println(" [-]   [-]");

     
    }

    @Override
    public void suspender(){

        System.out.println("Suspendiendo el robot... \n 3... \n 2... \n 1... \n Robot suspendido");
     	System.out.println("      |_|");
	System.out.println("     (* *)   A mimir again");
	System.out.println("    __) (__");
	System.out.println("   ( )...( )(_)");
	System.out.println("   || |_| ||//");
	System.out.println(">==() | | ()/");
	System.out.println("    _(___)_");
	System.out.println("   [-]   [-]");
        robot.setState(robot.getEstadoSuspendido());
    }
 }

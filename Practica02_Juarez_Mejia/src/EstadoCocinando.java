/**
 * Estado del robot mientras esta cocinando la orden
 * Para ayudar al usuario a familiarizarse con el modo de activaciones se ha agregado un modelo de un robot en ascii
 * el cual ilustra cada uno de los estados posibles del robot mientras camina.
 */
class EstadoCocinando implements EstadoRobot{

    Robot robot;

    public EstadoCocinando(Robot robot){

        this.robot = robot;
    }

	/**
 	* Cuando el robot se encuentra cocinando no es necesario que el cliente lo cambie de estado a activar porque
	* se encuentra cocinando y no se suspendera
 	*/
    @Override
    public void activar(){

        System.out.println("El robot ya esta activo y cocinando");
        System.out.println("   .--,--.");
        System.out.println("   `.  ,.'");
        System.out.println("    |___|");
        System.out.println("  |-:o o:-|   Si no son enchiladas");
        System.out.println("   _`~^~'_          joven");
        System.out.println(" |'   ^   `|");
    }

	/**
 	* Cuando el robot se encuentra cocinando no puede cambiar de estado a caminar ya que seria peligroso para los clientes
 	*/
    @Override
    public void caminar(){
        System.out.println("El robot no puede caminar mientras cocina");
        System.out.println("   .--,--.");
        System.out.println("   `.  ,.'");
        System.out.println("    |___|");
        System.out.println("  |-:o o:-|  ¿Acaso quieres que te");
        System.out.println("   _`~^~'_    queme con el aceite?");
        System.out.println(" |'   ^   `|");
    }

	/**
     	* Cuando el robot llega a la mesa, comienza a atender al cliente, por lo que cambia su estado a 
     	* atender de lo contrario no podra cocinar sin tener el pedido primero
     	*/
    @Override
    public void atender(){

        System.out.println("La orden ya ha sido recibida, presione cocinar para empezar el proceso de cocina");
        System.out.println("      |_|");
	    System.out.println("     (* *)    En seguida le traemos ");
	    System.out.println("    __) (__       su Mcburger ");
	    System.out.println("   ( )...( )(_)");
	    System.out.println("   || |_| ||//");
	    System.out.println(">==() | | ()/");
	    System.out.println("    _(___)_");
	    System.out.println("   [-]   [-]");
    }

	/**
     	* Cuando el robot tiene la orden del cliente cambia su estado a cocinar 
     	*/
    @Override
    public void cocinar(){

        System.out.println("Comenzando a cocinar su hamburguesa");
        robot.cocinar(robot.orden);
        System.out.println("Regresando a estado suspendido");
        robot.setState(robot.getEstadoSuspendido());
    }

	/**
     	* Cuando el robot termino de cocinar la orden del cliente volvera a suspenderse
	* hasta recibir una nueva orden
     	*/
    @Override
    public void suspender(){

        System.out.println("El robot no se puede suspender mientras cocina");
    }
}

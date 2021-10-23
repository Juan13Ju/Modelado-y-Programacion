/**
 * Estado en el cual el robot se encuentra habilitado para atender, por lo cual solo se puede activar.
 * Para ayudar al usuario a familiarizarse con el modo de activaciones se ha agregado un modelo de un robot en ascii.
 */


class EstadoAtendiendo implements EstadoRobot{

    Robot robot;

    public EstadoAtendiendo(Robot robot){

        this.robot = robot;
    }

    @Override
    public void activar(){

        System.out.println("El robot ya esta activado y lo esta atendiendo");
        System.out.println("      \_/");
	    System.out.println("     (* *)     Bienvenido a ");
	    System.out.println("    __) (__       Mcburger ");
	    System.out.println("   ( )...( )(_)");
	    System.out.println("   || |_| ||//");
	    System.out.println(">==() | | ()/");
	    System.out.println("    _(___)_");
	    System.out.println("   [-]   [-]");
    }

    @Override
    public void caminar(){

        System.out.println("El robot no puede caminar mientras atiende a un cliente");
        System.out.println("  Ya le dije que   (___ )");
	    System.out.println(" no vendemos sopa   oo~)/");
	    System.out.println("    \_/             \-_/");
	    System.out.println("   (_**)          / \|/  \ ");
	    System.out.println("  __) (_         ( / .- \ )");
	    System.out.println(" ( )...()        \ \ .  /_/");
	    System.out.println(" || | |||         \/___(_/");
	    System.out.println(" || | |()__/       | |  |");
	    System.out.println(" /\(___)           |_|__|");
	    System.out.println(" [-]   [-]        (_(___]");
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

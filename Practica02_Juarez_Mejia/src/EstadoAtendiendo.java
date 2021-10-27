/**
 * Estado en el cual el robot se encuentra habilitado para atender, por lo cual solo se puede activar.
 * Para ayudar al usuario a familiarizarse con el modo de activaciones se ha agregado un modelo de un robot en ascii
 * el cual ilustra cada uno de los estados posibles del robot.
 */

import java.util.Scanner;

class EstadoAtendiendo implements EstadoRobot{

    Robot robot;

    public EstadoAtendiendo(Robot robot){

        this.robot = robot;
    }

    @Override
    public void activar(){

        System.out.println("El robot ya esta activado y lo esta atendiendo");
	System.out.println("      |_|");
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
	System.out.println("Ya le dije que     (___ )");
	System.out.println(" no vendemos sopa   oo~)/");
	System.out.println("    |_|             |o_|");
	System.out.println("   (_**)          / (|)  - ");
	System.out.println("  __) (_         ( / .- ) )");
	System.out.println(" ( )...()        | | .  /_/");
	System.out.println(" || | |||         (|___(_/");
	System.out.println(" || | |()__/       | |  |");
	System.out.println(" /|(___)           |_|__|");
	System.out.println(" [-]   [-]        (_(___]");
    }

    public void atender(){

        System.out.println("Comenzando a leer el menu");
	System.out.println("      |_|     ____");
	System.out.println("     (* *)   |menu|");
	System.out.println("    __) (__  |____|");
	System.out.println("   ( )...( )(_)");
	System.out.println("   || |_| ||//");
	System.out.println(">==() | | ()/");
	System.out.println("    _(___)_");
	System.out.println("   [-]   [-]");
        robot.printMenu();

        Scanner scanner = new Scanner(System.in);
        int id;
        while(true){
            try{
                System.out.println("Ingrese el id de la hamburguesa deseada");
                id = scanner.nextInt();
                robot.findBurguer(id);
                System.out.println("Hamburguesa valida, pasando a estado Cocinando");
                break;
            }catch(InvalidIdException e){
                System.out.println("El id que ingreso no es valido, intente de nuevo");
            }catch(Exception e){
                System.out.println("Asegurese de ingresar un numero, intente de nuevo");
            }
        }
        robot.setState(robot.getEstadoCocinando());

    }

    public void cocinar(){

        System.out.println("El robot no puede cocinar sin una orden recibida");
	System.out.println("   .--,--.");
        System.out.println("   `.  ,.'");
        System.out.println("    |___|");
        System.out.println("  |-:o o:-|   Si no soy adivino");
        System.out.println("   _`~^~'_          joven");
        System.out.println(" |'   ^   `|");
	
    }

    public void suspender(){

        System.out.println("El robot no se puede suspender mientras atiende a un cliente");
	System.out.println("¿Quiere agregar    (___ )");
	System.out.println(" papas a su orden?  oo~)/");
	System.out.println("    |_|             |o_|");
	System.out.println("   (_**)          / (|)  - ");
	System.out.println("  __) (_         ( / .- ) )");
	System.out.println(" ( )...()        | | .  /_/");
	System.out.println(" || | |||         (|___(_/");
	System.out.println(" || | |()__/       | |  |");
	System.out.println(" /|(___)           |_|__|");
	System.out.println(" [-]   [-]        (_(___]");
    }
}

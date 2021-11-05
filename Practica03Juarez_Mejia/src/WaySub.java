import java.util.Scanner;

import javax.xml.stream.events.EndElement;
/**
 * Clase que simula el funcionamiento del restaurant WaySub
 */
class WaySub{

    static void menuBaguette(Scanner sc){

        Baguette bag = null;
        boolean selectedBread = false;
        while(!selectedBread){
            System.out.println("Seleccione el tipo de pan que desea");
            System.out.println("\n 1- Pan de ajo \n 2- Pan blanco \n 3- Pan Integral");
            String op = sc.nextLine();
            switch(op){
                case "1":
                bag = new BaguetteAjo();
                selectedBread = true;
                break;
                case "2":
                bag = new BaguetteBlanco();
                selectedBread = true;
                break;
                case "3":
                bag = new BaguetteIntegral();
                selectedBread = true;
                break;
                default:
                System.out.println("Opcion no valida, intente de nuevo");
            }
        }
        
        boolean endedOrder = false;
        while(!endedOrder){
            System.out.println("Seleccione los ingredientes que desea agregar");
            System.out.println("\n 1- Pollo \n 2- Pepperoni \n 3- Jamon \n 4- Lechuga \n 5- Jitomate \n 6- Cebolla \n 7- Mostaza \n 8- Catsup \n 9- Mayonesa 10- Terminar");
            String op = sc.nextLine();
            switch(op){
                case "1":
                bag = new Pollo(bag);
                break;
                case "2":
                bag = new Pepperoni(bag);
                break;
                case "3":
                bag = new Jamon(bag);
                break;
                case "4":
                bag = new Lechuga(bag);
                break;
                case "5":
                bag = new Jitomate(bag);
                break;
                case "6":
                bag = new Cebolla(bag);
                break;
                case "7":
                bag = new Mostaza(bag);
                break;
                case "8":
                bag = new Catsup(bag);
                break;
                case "9":
                bag = new Mayonesa(bag);
                break;
                case "10":
                endedOrder = true;
                break;
                default:
                System.out.println("Opcion no valida");
            }
        }

        bag.printTicket();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String op = "1";

        while(!op.equals("0")){
            System.out.println("Bienvenido a WaySub! Tenemos baguettes y pizzas, selecciona la opcion que deseas");
            System.out.println("\n 1- Baguette \n 2- Pizza \n 0- Salir");
            op = sc.nextLine();
            switch(op){
                case "1":
                menuBaguette(sc);
                break;
                // TODO : Agregar el menuPizza
                case "0":
                System.out.println("Vuelva pronto!");
                break;
                default:
                System.out.println("Opcion no valida");
            }
        }

    }
}
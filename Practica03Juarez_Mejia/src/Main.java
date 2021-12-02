import java.util.Scanner;

/**
 * Clase que simula el funcionamiento del restaurant WaySub
 */
class Main{

    /**
     * Menu para imprimir el menu de baguette e imprimir el ticket de compra
     * @param sc Scanner para tomar el input del usuario
     */
    static void menuBaguette(Scanner sc){

        Baguette bag = null;
        boolean selectedBread = false;
        while(!selectedBread){
            System.out.println("Seleccione el tipo de pan que deseas para tu baguette");
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
            System.out.println("Seleccione los ingredientes que desea agregar a tu baguette");
            System.out.println("\n 1- Pollo \n 2- Pepperoni \n 3- Jamon \n 4- Lechuga \n 5- Jitomate \n 6- Cebolla \n 7- Mostaza \n 8- Catsup \n 9- Mayonesa \n 10- Terminar");
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
        System.out.println("---Imprimiendo ticket---");
        System.out.println("---Muchas gracias por su compra---");
        bag.printTicket();
    }

    /**
     * Menu para imprimir el menu de las pizzas e imprimir el ticket de compra
     * @param sc Scanner para poder tomar el input del usuario
     */
    static void menuPizza(Scanner sc){

        Pizza pizza = null;
        boolean endedOrder = false;
        while(!endedOrder){

            System.out.println("Elige una de nuestas 5 pizzas");
            System.out.println("\n 1- Pizza Sencilla \n 2- Pizza Deluxe \n 3- Pizza de Salchicha \n 4- Pizza de Jamon \n 5- Pizza de Pollo");
            String op = sc.nextLine();
            switch(op){
                case "1":
                pizza = new PizzaSencilla();
                endedOrder = true;
                break;
                case "2":
                pizza = new PizzaDeluxe();
                endedOrder = true;
                break;
                case "3":
                pizza = new PizzaSalchicha();
                endedOrder = true;
                break;
                case "4":
                pizza = new PizzaJamon();
                endedOrder = true;
                break;
                case "5":
                pizza = new PizzaPollo();
                endedOrder = true;
                break;
                default: 
                System.out.println("Orden no valida, intente de nuevo");
            }
        }

        PizzaAdapter adapter = new PizzaAdapter(pizza);
        System.out.println("---Imprimiendo ticket---");
        System.out.println("---Muchas gracias por su compra---");
        adapter.printTicket();
    }

/**
 * Clase que interactua con el usuario para saber que desea ordenar
 */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String op = "1";

        while(!op.equals("0")){
            System.out.println("Bienvenido a WaySub! ft. Pizzas de Don Cangrejo");
            System.out.println("Ahora con pizzas ademas de nuestros deliciosos baguettes");
            System.out.println("Selecciona la opcion que deseas comer hoy");
            System.out.println("\n 1- Baguette \n 2- Pizza \n 0- Salir");
            op = sc.nextLine();
            switch(op){
                case "1":
                menuBaguette(sc);
                break;
                case "2":
                menuPizza(sc);
                break;
                case "0":
                System.out.println("Vuelva pronto!");
                break;
                default:
                System.out.println("Opcion no valida");
            }
        }

    }
}

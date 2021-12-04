import java.util.Iterator;
import java.util.Scanner;


public class English implements Lenguaje{

    @Override
    
    public void mostrarCatalogo() {
        Scanner in = new Scanner(System.in);
        int opcion;
        Catalogo catalogo = new Catalogo();
        Iterator productos = catalogo.getIterador();
        System.out.println("**********WELCOME TO CHEEMSMART**********");
        System.out.println("How can I help you?\n");
        do {
            
        
        System.out.println("1.- Show Catalog\n"
                + "2.- Make a purchase\n"
                + "3.- Exit\n");
        while (true){
            try{
                String opcionUser = in.nextLine();
                opcion = Integer.parseInt(opcionUser);
                break;
            } catch (NumberFormatException ex){
                System.out.println("Enter a valid option\n "
                        + "How can I help you?\n"
                        + "1.- Show Catalog\n"
                        + "2.- Make a purchase\n"
                        + "3.- Exit\n");
            }
        }
        switch(opcion){
            case 1:
                while(productos.hasNext()){
                    System.out.println(productos.next().toString());
                }
            case 2:
                while(productos.hasNext()){
                    System.out.println(productos.next().toString());
                }
            case 3:
                break;
            default:
                System.out.println("Please choose the option you want to run");
                break;
                
        }
    } while (opcion != 3);
    }
    
}

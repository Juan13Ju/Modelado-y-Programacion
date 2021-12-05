import java.util.Iterator;
import java.util.Scanner;


public class Latino implements Lenguaje{

    @Override
    public void mostrarCatalogo() {
        Scanner in = new Scanner(System.in);
        int opcion;
        Catalogo catalogo = new Catalogo();
        Iterator productos = catalogo.getIterador();
        System.out.println("**********BIENVENIDO A CHEEMSMART**********");
        System.out.println("░░░░░░░░░▄░░░░░░░░░░░░░░▄░░░░");
	    System.out.println("░░░░░░░░▌▒█░░░░░░░░░░░▄▀▒▌░░░");
	    System.out.println("░░░░░░░░▌▒▒█░░░░░░░░▄▀▒▒▒▐░░░");
	    System.out.println("░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐░░░");
	    System.out.println("░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐░░░");
	    System.out.println("░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌░░░");
	    System.out.println("░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒▌░░");
	    System.out.println("░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐░░");
	    System.out.println("░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄▌░");
	    System.out.println("░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▌░");
	    System.out.println("▀▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒▐░");
	    System.out.println("▐▒▒▐▀▐▀▒░▄▄▒▄▒▒▒▒▒▒░▒░▒░▒▒▒▒▌");
	    System.out.println("▐▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒▒▒░▒░▒░▒▒▐░");
	    System.out.println("░▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒░▒░▒░▒░▒▒▒▌░");
	    System.out.println("░▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▄▒▒▐░░");
	    System.out.println("░░▀▄▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▄▒▒▒▒▌░░");
	    System.out.println("░░░░▀▄▒▒▒▒▒▒▒▒▒▒▄▄▄▀▒▒▒▒▄▀░░░");
	    System.out.println("░░░░░░▀▄▄▄▄▄▄▀▀▀▒▒▒▒▒▄▄▀░░░░░");
	    System.out.println("░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▀▀░░░░░░░░");
        System.out.println("¿Que deseas hacer?\n");
        do {
            
        
        System.out.println("1.- Ver el catalogo de productos\n"
                + "2.- Realizar una compra\n"
                + "3.- Salir\n");
        while (true){
            try{
                String opcionUser = in.nextLine();
                opcion = Integer.parseInt(opcionUser);
                break;
            } catch (NumberFormatException ex){
                System.out.println("Ingresa una opcion valida "
                        + "¿Que deseas hacer?\n"
                        + "1.- Ver el catalogo de productos\n"
                        + "2.- Realizar una compra\n"
                        + "3.- Salir\n");
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
                System.out.println("Por favor elige la opcion que deseas ejecutar");
                break;
                
        }
    } while (opcion != 3);
    }
    
}

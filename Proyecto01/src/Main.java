import java.util.LinkedList;
import java.util.Scanner;
class Main{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        // Creamos a los usuarios
        // * Podriamos crear un metodo crear usuarios para que no se vea tan feo el main xd
        LinkedList<Usuario> usuarios = new LinkedList<Usuario>();
        Usuario juan = new Usuario("juancho", "12345", "nombre", "telefono", "direccion", "cuenta", "pais");
        Usuario sergio = new Usuario("elSerch", "contraseña", "nombre", "telefono", "direccion", "cuenta", "pais");
        usuarios.add(juan);
        usuarios.add(sergio);
        
        System.out.println("**********Bienvenido a CheemsMart**********\n");
        System.out.println("Ingresa tu nombre de usuario");
        String usuario = sc.nextLine();
        System.out.println("Ingresa tu contraseña");
        String contrasena = sc.nextLine();
        System.out.println(LoginHandler.login(usuario, contrasena, usuarios));
        // Creo que la línea de arriba de arriba regresa un booleano, no estoy seguro, si es así, ponemos un if, si es true ponemos lo que voy a escribir a continuación:
        Scanner in = new Scanner(System.in);
        int opcion;
        Catalogo catalogo = new Catalogo();
        Iterator productos = catalogo.getIterador();
        System.out.println("**********BIENVENIDO A CHEEMSMART**********");
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

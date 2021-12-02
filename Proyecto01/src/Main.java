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

        System.out.println("Ingresa tu nombre de usuario");
        String usuario = sc.nextLine();
        System.out.println("Ingresa tu contraseña");
        String contrasena = sc.nextLine();
        System.out.println(LoginHandler.login(usuario, contrasena, usuarios));

    }
}
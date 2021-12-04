import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class CheemsMart {

    static Scanner sc = new Scanner(System.in);
    private Lenguaje lenguaje;
    /**
     * Método para elegir el lenguaje que ocupará cheemsmart
     * @param newlenguaje 
     */
    private void chooselenguaje(Lenguaje newlenguaje){
        lenguaje = newlenguaje;
    }
    
    public  void showcatalog(){
        lenguaje.mostrarCatalogo();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CheemsMart cheemsmart = new CheemsMart();
        // Creamos a los usuarios
        // * Podriamos crear un metodo crear usuarios para que no se vea tan feo el main xd
        LinkedList<Usuario> usuarios = new LinkedList<Usuario>();
        Usuario juan = new Usuario("juancho", "12345", "nombre", "telefono", "direccion", "cuenta", "Mexico");
        Usuario sergio = new Usuario("elSerch", "contraseña", "nombre", "telefono", "direccion", "cuenta", "Spain");
        Usuario armando = new Usuario("armand","0606","Armando","5618731350","calle 30","bbva","USA");
        usuarios.add(juan);
        usuarios.add(sergio);
        usuarios.add(armando);
        
        System.out.println("**********CheemsMart**********\n");
        System.out.println("Ingresa tu nombre de usuario/Enter your Username");
        String usuario = sc.nextLine();
        System.out.println("Ingresa tu contraseña/Enter yourPassword");
        String contrasena = sc.nextLine();
        System.out.println(LoginHandler.login(usuario, contrasena, usuarios));
        if (LoginHandler.login(usuario, contrasena, usuarios) == true){
            String Nationality = LoginHandler.getNationality(usuario, contrasena, usuarios);
            switch (Nationality){
                case "Mexico":
                    cheemsmart.chooselenguaje(new Latino());
                    cheemsmart.showcatalog();
                case "Spain":
                    cheemsmart.chooselenguaje(new Spain());
                    cheemsmart.showcatalog();
                case "USA":
                    cheemsmart.chooselenguaje(new English());
                    cheemsmart.showcatalog();
            }
        }
}
}

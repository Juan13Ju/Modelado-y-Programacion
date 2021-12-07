import java.util.LinkedList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

class TiendaCheems {

    // HashMap donde guardamos el nombre del pais con su respectivo gestor de
    // promociones
    HashMap<String, Promocion> gestoresPromocion;
    // Lista de los usuarios registrados
    LinkedList<Usuario> usuarios;

    // Scanner para el input del usuario
    Scanner sc;

    /**
     * Constructor de la tienda en el cual creamos a los ususarios y las promociones
     */
    public TiendaCheems() {

        this.gestoresPromocion = new HashMap<String, Promocion>();
        gestoresPromocion.put("Mexico", new Promocion("Abarrotes"));
        gestoresPromocion.put("USA", new Promocion("Electronica"));
        gestoresPromocion.put("Spain", new Promocion("Electrodomesticos"));
        sc = new Scanner(System.in);
        usuarios = new LinkedList<Usuario>();
        // * Aqui se encuentran los usuarios registrados
        // * El penultimo numero es la cuenta bancaria y el segundo parametro es la contraseña
        Usuario juan = new Usuario("juancho", "12345", "Juan", "5537283456", "calle mexico", "1234", "Mexico");
        Usuario moni = new Usuario("LaMoni", "secreto", "Moni", "5534564378", "calle azul", "3456", "Mexico");
        Usuario sergio = new Usuario("elSerch", "contraseña", "Sergio", "5532136789", "calle 23", "2788", "Spain");
        Usuario arturo = new Usuario("Arturito", "10deCalificacion", "Arturo", "5545136789", "calle 123", "1545", "Spain");
        Usuario armando = new Usuario("armand", "0606", "Armando", "5618731350", "calle 30", "1122", "USA");
        Usuario rosa = new Usuario("RosaCool", "antipatrones", "Rosa", "5618731340", "calle 303", "1152", "USA");
        usuarios.add(juan);
        usuarios.add(sergio);
        usuarios.add(armando);
        usuarios.add(moni);
        usuarios.add(arturo);
        usuarios.add(rosa);
        asignarPais(usuarios);
        asignarPaisesConPromocion();
    }

    /**
     * Metodo para asignar a cada usuario el gestor de promociones correspondiente
     * 
     * @param usuarios La lista de usuarios de la tienda
     */
    public void asignarPais(LinkedList<Usuario> usuarios) {
        String pais;
        Promocion promo;

        for (Usuario user : usuarios) {
            pais = user.getPais();
            switch (pais) {
                case "Mexico":
                    promo = this.gestoresPromocion.get("Mexico");
                    promo.registerObserver((MyObserver) user);
                    break;
                case "USA":
                    promo = this.gestoresPromocion.get("USA");
                    promo.registerObserver((MyObserver) user);
                    break;
                case "Spain":
                    promo = this.gestoresPromocion.get("Spain");
                    promo.registerObserver((MyObserver) user);
                    break;
            }
        }
    }

    /**
     * Metodo para generar aleatoriamente que paises contaran con promocion y cuales
     * no
     */
    public void asignarPaisesConPromocion() {
        Random random = new Random();
        int ranNumber;
        for (Promocion promo : gestoresPromocion.values()) {
            /**
             * Para cada promocion, generamos un numero aleatorio entre 0 y 1.
             * Si el valor es 1, notificamos a todos los usuarios de esa promocion
             * que tienen un descuento.
             */
            ranNumber = random.nextDouble() > 0.5 ? 1 : 0;
            if (ranNumber == 1) {
                promo.notifyObservers();
            }
        }
    }

    /**
     * Metodo para simular un cliente utilizando la tienda
     */
    public void startTienda() {
        InterfazTienda interfaz = null;
        Promocion promo;
        while (true) {

            // Primero hacemos el login del usuario
            System.out.println("Ingresa tu usuario: ");
            String nombreUsuario = sc.nextLine();
            System.out.println("Ingresa tu contraseña: ");
            String contrasena = sc.nextLine();
            Usuario user = LoginHandler.login(nombreUsuario, contrasena, usuarios);

            if (user == null) {
                System.out.println("Credenciales incorrectas, intente de nuevo");
                continue;
            }

            String pais = user.getPais();
            promo = gestoresPromocion.get(pais);
            switch (pais) {
                case "Mexico":
                    interfaz = new InterfazProxy(new InterfazLatino());
                    break;
                case "USA":
                    interfaz = new InterfazProxy(new InterfazUSA());
                    break;
                case "Spain":
                    interfaz = new InterfazProxy(new InterfazSpain());
                    break;
                default:
                    System.out.println("Interfaz no disponible");
            }

            interfaz.mostrarInterfaz(sc, promo, user);

        }
    }

    public static void main(String[] args) {

        TiendaCheems tienda = new TiendaCheems();
        tienda.startTienda();
    }
}
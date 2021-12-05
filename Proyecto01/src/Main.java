import java.util.LinkedList;
import java.util.HashMap;
import java.util.Random;

class Main{

    // HashMap donde guardamos el nombre del pais con su respectivo gestor de promociones
    HashMap<String, Promocion> gestoresPromocion;

    // Constructos de la tienda en la cual creamos cada gestor de promocion de los paises disponibles
    public Main(){

        this.gestoresPromocion = new HashMap<String, Promocion>();
        gestoresPromocion.put("Mexico", new Promocion("Abarrotes"));
        gestoresPromocion.put("USA", new Promocion("Electronica"));
        gestoresPromocion.put("Spain", new Promocion("Electrodomesticos"));
    }
    /**
     * Metodo para asignar a cada usuario el gestor de promociones correspondiente
     * @param usuarios La lista de usuarios de la tienda
     */
    public void asignarPais(LinkedList<Usuario> usuarios){
        String pais;
        Promocion promo;

        for(Usuario user : usuarios){
            pais = user.getPais();
            switch(pais){
                case "Mexico":
                promo = this.gestoresPromocion.get("Mexico");
                promo.registerObserver((MyObserver)user);
                break;
                case "USA":
                promo = this.gestoresPromocion.get("USA");
                promo.registerObserver((MyObserver)user);
                break;
                case "Spain":
                promo = this.gestoresPromocion.get("Spain");
                promo.registerObserver((MyObserver)user);
                break;
            }
        }
    }

    /**
     * Metodo para generar aleatoriamente que paises contaran con promocion y cuales no
     */
    public void asignarPaisesConPromocion(){
        Random random = new Random();
        int ranNumber;
        for(Promocion promo : gestoresPromocion.values()){
            /**
             * Para cada promocion, generamos un numero aleatorio entre 0 y 1.
             * Si el valor es 1, notificamos a todos los usuarios de esa promocion
             * que tienen un descuento.
             */
            ranNumber = random.nextDouble() > 0.5 ? 1 : 0;
            if(ranNumber == 1){
                System.out.println("Tenemos promocion de: " + promo.getDepartamento());
                promo.notifyObservers();
            }
        }
    }

    public static void main(String[] args) {

        Main main = new Main();
        
        LinkedList<Usuario> usuarios = new LinkedList<Usuario>();
        Usuario juan = new Usuario("juancho", "12345", "nombre", "telefono", "direccion", "cuenta", "Mexico");
        Usuario sergio = new Usuario("elSerch", "contraseña", "nombre", "telefono", "direccion", "cuenta", "Spain");
        Usuario armando = new Usuario("armand","0606","Armando","5618731350","calle 30","bbva","USA");
        usuarios.add(juan);
        usuarios.add(sergio);
        usuarios.add(armando);

        main.asignarPais(usuarios);

        main.asignarPaisesConPromocion();

        Catalogo catalogo = new Catalogo();

        // ! Este es un metodo de prueba para comprobar que se apliquen correctamente las promos
        LinkedList<Producto> carrito = catalogo.getLista();
        Promocion promo;

        for(Usuario user : usuarios){
            promo = main.gestoresPromocion.get(user.getPais());
            System.out.println("Carrito de :" + user.getUsuario());
            promo.generarTicket(carrito, user.tienePromocion());
            System.out.println("------------------------------");
            System.out.println("------------------------------");

        }

        // ! Aqui termina el metodo de prueba
    }
}
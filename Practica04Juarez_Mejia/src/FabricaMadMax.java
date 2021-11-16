import java.util.Scanner;

class FabricaMadMax {

    static AbstractFactory fabricaLlantas = FabricaAutos.getFactory("llantas");
    static AbstractFactory fabricaMotor = FabricaAutos.getFactory("motor");
    static AbstractFactory fabricaCarroceria = FabricaAutos.getFactory("carroceria");
    static AbstractFactory fabricaBlindaje = FabricaAutos.getFactory("blindaje");
    static AbstractFactory fabricaArma = FabricaAutos.getFactory("arma");

    /**
     * Metodo para construir un auto predeterminado
     * 
     * @param tipoAuto El tipo de auto predeterminado a elegir
     * @return El auto con las caracteristicas prederminadas
     */
    public static AutoMadMax construirAutoPredeterminado(String tipoAuto) {

        // Sin los = null el compilador llora
        AutoMadMax auto = null;
        Llanta llantas = null;
        Motor motor = null;
        Carroceria carroceria = null;
        Blindaje blindaje = null;
        Arma arma = null;

        switch (tipoAuto) {
        case "ninja":
            llantas = (Llanta) fabricaLlantas.getComponente("deportiva");
            motor = (Motor) fabricaMotor.getComponente("deportivo");
            carroceria = (Carroceria) fabricaCarroceria.getComponente("deportiva");
            blindaje = (Blindaje) fabricaBlindaje.getComponente("simple");
            arma = (Arma) fabricaArma.getComponente("sierra");
            break;
                
        case "buzo":
            llantas = (Llanta) fabricaLlantas.getComponente("todoterreno");
            motor = (Motor) fabricaMotor.getComponente("turbo");
            carroceria = (Carroceria) fabricaCarroceria.getComponente("camion");
            blindaje = (Blindaje) fabricaBlindaje.getComponente("tanque");
            arma = (Arma) fabricaArma.getComponente("arpones");
            break;
        
        case "soldado":
            llantas = (Llanta) fabricaLlantas.getComponente("oruga");
            motor = (Motor) fabricaMotor.getComponente("diesel");
            carroceria = (Carroceria) fabricaCarroceria.getComponente("camion");
            blindaje = (Blindaje) fabricaBlindaje.getComponente("tanque");
            arma = (Arma) fabricaArma.getComponente("metralleta");
            break;
                
        case "corredor":
            llantas = (Llanta) fabricaLlantas.getComponente("deportiva");
            motor = (Motor) fabricaMotor.getComponente("deportivo");
            carroceria = (Carroceria) fabricaCarroceria.getComponente("deportiva");
            blindaje = (Blindaje) fabricaBlindaje.getComponente("simple");
            arma = (Arma) fabricaArma.getComponente("lanzallamas");
            break;
                
        case "pirata":
            llantas = (Llanta) fabricaLlantas.getComponente("simple");
            motor = (Motor) fabricaMotor.getComponente("diesel");
            carroceria = (Carroceria) fabricaCarroceria.getComponente("casual");
            blindaje = (Blindaje) fabricaBlindaje.getComponente("reforzado");
            arma = (Arma) fabricaArma.getComponente("canones");
            break;

            
        default:
            System.out.println("Auto no valido");
        }

        llantas.crearLlanta();
        motor.crearMotor();
        carroceria.crearCarroceria();
        blindaje.crearBlindaje();
        arma.crearArma();

        auto = new AutoMadMax(llantas, motor, carroceria, blindaje, arma);

        return auto;
    }

    /**
     * Metodo que le permite al usuario crear un auto con componentes personalizados
     * 
     * @param sc            El scanner usado para usarlo en el menu que el metodo
     *                      crea
     * @param dineroInicial La cantidad de dinero actual del usuario
     * @return Un auto con componentes elegidos por el usuario
     */
    public static AutoMadMax construirAutoPersonalizado(Scanner sc, int dineroInicial) {

        AutoMadMax auto = null;
        Llanta llantas = null;
        Motor motor = null;
        Carroceria carroceria = null;
        Blindaje blindaje = null;
        Arma arma = null;

        String opcion;
        int costoActual = 0;

        boolean finished = false;

        while (!finished) {
            System.out.println("Elige los componentes de tu auto, ingresa el numero deseado");
            System.out.println(
                    "1- Llantas \n 2- Motor \n3- Carroceria \n4- Blindaje \n5- Arma \n6- Terminar \n7- Reiniciar");
            opcion = sc.nextLine();
            switch (opcion) {
            case "1":
                // Esto es para que si el usuario ya habia seleccionado un componente del mismo
                // tipo antes
                // el costo del componente se "devuelva" y despues se resta el costo del
                // componente nuevo
                if (llantas != null) {
                    costoActual -= ((ComponenteCarro) llantas).getCosto();
                }
                llantas = construirLlanta(sc);
                llantas.crearLlanta();
                costoActual += ((ComponenteCarro)llantas).getCosto();
                break;
            case "2":
                if (motor != null) {
                    costoActual -= ((ComponenteCarro) motor).getCosto();
                }
                motor = construirMotor(sc);
                motor.crearMotor();
                costoActual += ((ComponenteCarro)motor).getCosto();
                break;
            case "3":
                if (carroceria != null) {
                    costoActual -= ((ComponenteCarro) carroceria).getCosto();
                }
                carroceria = construirCarroceria(sc);
                carroceria.crearCarroceria();
                costoActual += ((ComponenteCarro)carroceria).getCosto();
                break;
            case "4":
                if (blindaje != null) {
                    costoActual -= ((ComponenteCarro) blindaje).getCosto();
                }
                blindaje = construirBlindaje(sc);
                blindaje.crearBlindaje();
                costoActual += ((ComponenteCarro)blindaje).getCosto();
                break;
            case "5":
                if (arma != null) {
                    costoActual -= ((ComponenteCarro) arma).getCosto();
                }
                arma = construirArma(sc);
                arma.crearArma();
                costoActual += ((ComponenteCarro)arma).getCosto();
                break;
            case "6":
                if (llantas != null && motor != null && carroceria != null && blindaje != null && arma != null) {
                    if (dineroInicial - costoActual < 0) {
                        System.out.println("Dinero no suficiento para el carro deseado, intente despues");
                    } else {
                        System.out.println("Carro creado exitosamente!");
                        auto = new AutoMadMax(llantas, motor, carroceria, blindaje, arma);
                    }
                }
                System.out.println("Saliendo del menu de auto personalizado, auto no terminado...");
                finished = true;
                return null;
            case "7":
                llantas = null;
                motor = null;
                carroceria = null;
                blindaje = null;
                arma = null;
                costoActual = 0;
                break;
            default:
                System.out.println("Opcion no valida");

            }

            System.out.println("El costo actual del auto es: " + costoActual);
        }
        return auto;
    }

    /**
     * Metodo que le permite al usuario elegir llantas personalizadas
     * 
     * @param sc El scanner para tomar el input del usuario
     * @return El objeto Llanta elegido por el usuario
     */
    public static Llanta construirLlanta(Scanner sc) {

        String opcion;

        while (true) {
            System.out.println("Selecciona el tipo de llanta que deseas:");
            System.out.println("1- Simples \n2- Deportivas \n3- Llantas off-road \n4- Oruga de tanque");
            opcion = sc.nextLine();
            switch (opcion) {
            case "1":
                return (Llanta) fabricaLlantas.getComponente("simple");
            case "2":
                return (Llanta) fabricaLlantas.getComponente("deportivo");
            case "3":
                return (Llanta) fabricaLlantas.getComponente("todoterreno");
            case "4":
                return (Llanta) fabricaLlantas.getComponente("oruga");
            default:
                System.out.println("Opcion no valida");
            }
        }

    }

    /**
     * Metodo que le permite al usuario elegir un motor persinalizado
     * 
     * @param sc Scanner para tomar el input del usuario
     * @return El objeto motor elegido por el usuario
     */
    public static Motor construirMotor(Scanner sc) {

        String opcion;

        while (true) {
            System.out.println("Elige un motor de la lista: ");
            System.out.println("1- Deportivo \n2- Diesel \n3- Turbo");
            opcion = sc.nextLine();
            switch (opcion) {
            case "1":
                return (Motor) fabricaMotor.getComponente("deportivo");
            case "2":
                return (Motor) fabricaMotor.getComponente("diesel");
            case "3":
                return (Motor) fabricaMotor.getComponente("turbo");
            default:
                System.out.println("Opcion no valida");
            }
        }
    }

    /**
     * Metodo que le permite al usuario elegir una carroceria personalizada
     * 
     * @param sc Scanner para tomar el input del usuario
     * @return El objeto carroceria elegido por el usuario
     */
    public static Carroceria construirCarroceria(Scanner sc) {

        String opcion;

        while (true) {
            System.out.println("Elige una carroceria de la lista: ");
            System.out.println("1- Casual \n2- Camion \n3- Deportiva");
            opcion = sc.nextLine();
            switch (opcion) {
            case "1":
                return (Carroceria) fabricaCarroceria.getComponente("casual");
            case "2":
                return (Carroceria) fabricaCarroceria.getComponente("camion");
            case "3":
                return (Carroceria) fabricaCarroceria.getComponente("deportiva");
            default:
                System.out.println("Componente no existente");
            }
        }
    }

    /**
     * Metodo que le permite al usuario elegir un blindaje personalizado
     * 
     * @param sc Scanner para tomar el input del usuario
     * @return El objeto blindaje elegido por el usuario
     */
    public static Blindaje construirBlindaje(Scanner sc) {

        String opcion;

        while (true) {

            System.out.println("Elige el blindaje que desees: ");
            System.out.println("1- Simple \n2- Reforzado \n3- Tanque");
            opcion = sc.nextLine();

            switch (opcion) {
            case "1":
                return (Blindaje) fabricaBlindaje.getComponente("simple");
            case "2":
                return (Blindaje) fabricaBlindaje.getComponente("reforzado");
            case "3":
                return (Blindaje) fabricaBlindaje.getComponente("tanque");
            default:
                System.out.println("Opcion no valida");
            }
        }
    }

    /**
     * Metodo que le permite al usuario elegir un arma personalizada
     * 
     * @param sc Scanner para tomar el input del usuario
     * @return El objeto arma elegido por el usuario
     */
    public static Arma construirArma(Scanner sc) {

        String opcion;

        while (true) {

            System.out.println("Elige el arma que desees: ");
            System.out.println("1- Arpones \n2- Lanzallamas \n3- Cañones \n4- Sierra \n5- Metralleta");
            opcion = sc.nextLine();

            switch (opcion) {
            case "1":
                return (Arma) fabricaArma.getComponente("arpones");
            case "2":
                return (Arma) fabricaArma.getComponente("lanzallamas");
            case "3":
                return (Arma) fabricaArma.getComponente("cañones");
            case "4":
                return (Arma) fabricaArma.getComponente("sierra");
            case "5":
                return (Arma) fabricaArma.getComponente("metralleta");
            default:
                System.out.println("Opcion no valida");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dineroInicial = 1000;

        System.out.println("--Bienvenido a la fabrica de autos estilo Mad Max---");
        String opcion = "0";
        AutoMadMax auto = null;

        while (!opcion.equals("5")) {
            auto = null;
            System.out.println(
                    "Eliga una de las siguientes opciones: \n1- Auto ninja \n2- Auto tanque \n3- Auto balanceado \n4- Auto personalizado \n5- salir");
            opcion = sc.nextLine();
            switch (opcion) {
            case "1":
                // Diremos que el precio del auto ninja es de $300
                if (dineroInicial - 300 >= 0) {
                    // Llamamos al metodo autoPredeterminado con el parametro "ninja"
                    auto = construirAutoPredeterminado("ninja");
                    dineroInicial -= 300;
                } else {
                    System.out.println("No tienes dinero suficiente, intenta con otro auto");
                }
                break;
            case "2":
                // TODO : Agregar auto tanque al metodo AutoPredeterminado
                break;
            case "3":
                // TODO : agregar auto balanceado al metodo AutoPredeterminado
                break;
            case "4":
                auto = construirAutoPersonalizado(sc, dineroInicial);
                if(auto != null){
                    dineroInicial -= auto.getCosto();
                }
                break;
            case "5":
                System.out.println("Vuelva pronto!");
                break;
            default:
                System.out.println("Opcion no valida");
            }

            if (auto != null) {
                System.out.println("Imprimiendo la informacion de tu auto");
                auto.muestraAuto();
            }
            System.out.println("Tu dinero restante es: " + dineroInicial);
        }
        sc.close();
    }
}

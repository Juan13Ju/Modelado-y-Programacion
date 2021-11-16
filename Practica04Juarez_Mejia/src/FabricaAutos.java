/**
 * Clase que nos permite crear objetos de tipo Auto dependiendo del tipo de auto que se desee
 */
public class FabricaAutos{

    public static AbstractFactory getFactory(String opcion){

        opcion = opcion.toLowerCase();

        switch(opcion){

            case "llantas":
            return new FabricaLlantas();
            case "motor":
            return new FabricaMotor();
            case "carroceria":
            return new FabricaCarroceria();
            case "blindaje":
            return new FabricaBlindaje();
            case "arma":
            return new FabricaArma();
            default:
            System.out.println("Opcion invalida");
            return null;
        }
    }
}

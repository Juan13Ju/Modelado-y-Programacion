class FabricaAutos{

    public static AbstractFactory gerFactory(String opcion){

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
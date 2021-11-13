class FabricaBlindaje extends AbstractFactory{

    @Override
    public Object getComponente(String tipoComponente){

        return getBlindaje(tipoComponente);
    }

    public Blindaje getBlindaje(String tipoBlindaje){

        tipoBlindaje = tipoBlindaje.toLowerCase();

        switch(tipoBlindaje){
            case "simple":
            return new BlindajeSimple();
            default:
            System.out.println("Componente no valido");
            return null;
        }
    }
}
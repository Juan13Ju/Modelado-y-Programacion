class FabricaCarroceria extends AbstractFactory{

    @Override
    public Object getComponente(String tipoComponente){

        return getCarroceria(tipoComponente);
    }

    public Carroceria getCarroceria(String tipoCarroceria){

        tipoCarroceria = tipoCarroceria.toLowerCase();

        switch(tipoCarroceria){

            case "casual":
            return new CarroceriaCasual();
            default:
            System.out.println("Componente no existente");
            return null;
        }
    }
}
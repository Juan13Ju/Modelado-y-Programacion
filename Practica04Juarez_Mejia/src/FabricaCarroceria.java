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
            case "camion":
            return new CarroceriaCamion();
            case "deportiva"
            return new CarroceriaDeportiva();
            default:
            System.out.println("Componente no existente");
            return null;
        }
    }
}

/**
 * Clase que nos permite crear objetos de tipo Carroceria dependiendo del tipo de carroceria que se desee
 */
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
            case "deportiva":
            return new CarroceriaDeportiva();
            default:
            System.out.println("Componente no existente");
            return null;
        }
    }
}

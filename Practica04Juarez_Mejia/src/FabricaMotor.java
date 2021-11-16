/**
 * Clase que nos permite crear objetos de tipo Motor dependiendo del tipo de motor que se desee
 */
class FabricaMotor extends AbstractFactory{

    @Override
    public Object getComponente(String tipoComponente){

        return getMotor(tipoComponente);
    }

    public Motor getMotor(String tipoMotor){

        tipoMotor = tipoMotor.toLowerCase();

        switch(tipoMotor){
            case "deportivo":
            return new MotorDeportivo();
            case "diesel":
            return new MotorDiesel();
            case "turbo":
            return new MotorTurbo();
            default:
            return null;
        }
    }
}

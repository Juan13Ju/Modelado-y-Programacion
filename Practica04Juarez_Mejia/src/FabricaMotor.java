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
            default:
            return null;
        }
    }
}
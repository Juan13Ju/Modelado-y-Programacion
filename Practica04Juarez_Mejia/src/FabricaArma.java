/**
 * Clase que nos permite crear objetos de tipo Arma dependiendo del tipo de arma que se desee
 */
class FabricaArma extends AbstractFactory{

    @Override
    public Object getComponente(String tipoComponente){

        return getArma(tipoComponente);
    }

    public Arma getArma(String tipoArma){

        tipoArma = tipoArma.toLowerCase();

        switch(tipoArma){

            case "arpones":
            return new ArmaArpones();
            case "lanzallamas":
            return new ArmaLanzallamas();
            case "cañones":
            return new ArmaCanones();
            case "sierra":
            return new ArmaSierra();
            case "metralleta":
            return new ArmaMetralleta();
            default: 
            System.out.println("Componente no valido");
            return null;
        }
    }
}

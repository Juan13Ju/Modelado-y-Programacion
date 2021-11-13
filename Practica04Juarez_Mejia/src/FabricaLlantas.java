/**
 * Clase que nos permite crear objetos de tipo Llanta dependiendo del tipo de llanta que se desee
 */

class FabricaLlantas extends AbstractFactory{

    @Override
    public Object getComponente(String tipoComponente){

        return getLlanta(tipoComponente);
    }

    public Llanta getLlanta(String tipoLlanta){

        tipoLlanta = tipoLlanta.toLowerCase();

        switch(tipoLlanta){

            case "simple":
            return new LlantaSimple();
            default:
            System.out.println("Componente no existente");
            return null;
        }
    }
}
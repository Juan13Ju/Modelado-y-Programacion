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
            default: 
            System.out.println("Componente no valido");
            return null;
        }
    }
}
class PayThisney implements PayStrategy{

    public PayThisney(){

    }

    @Override
    public boolean canPay(Cliente cli, Servicio ser, int mesActual){

        InfoCliente informacion = ser.infoClientes.get(cli);
        int mesInicial = informacion.mesInicial;

        String planCliente = ser.infoClientes.get(cli).plan;

        int cantidad = ser.planes.get(planCliente);

        if(mesActual - mesInicial < 3){
            return cli.getDinero() - cantidad >= 0;
        }

        // Si ya paso el periodo de 3 meses, entonces la tarifa siempre es de $150
        return cli.getDinero() - 150 >= 0;
    }

    @Override
    public void cobrar(Cliente cli, Servicio ser, int mesActual){

        InfoCliente informacion = ser.infoClientes.get(cli);
        int mesInicial = informacion.mesInicial;

        String planCliente = ser.infoClientes.get(cli).plan;

        int cantidad = ser.planes.get(planCliente);
        
        if(mesActual - mesInicial < 3){
            System.out.println(cli.getNombre() + " paga $" + cantidad + " por la tarifa redudica de " + ser.nombre);
            cli.setDinero(cli.getDinero() - cantidad);
        }else{

            // Si ya paso el periodo de 3 meses, entonces desontamos 150 cada mes
            System.out.println(cli.getNombre() + " paga $" + cantidad + " por la tarifa normal de " + ser.nombre);
            cli.setDinero(cli.getDinero() - 150);
        }

        
    }
}
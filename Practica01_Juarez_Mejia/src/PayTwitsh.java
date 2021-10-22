class PayTwitsh implements PayStrategy{

    public PayTwitsh(){

    }

    @Override
    public boolean canPay(Cliente cli, Servicio ser, int mesActual){

        String planCliente = ser.infoClientes.get(cli).plan;

        int cantidad = ser.planes.get(planCliente);
        
        return cli.getDinero() - cantidad >= 0;
    }

    @Override
    public void cobrar(Cliente cli, Servicio ser, int mesActual){

        String planCliente = ser.infoClientes.get(cli).plan;

        int cantidad = ser.planes.get(planCliente);

        System.out.println(cli.getNombre() + " paga $" + cantidad + " por el plan " + planCliente);

        cli.setDinero( cli.getDinero() - cantidad );
    }
}
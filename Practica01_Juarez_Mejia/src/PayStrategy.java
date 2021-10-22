interface PayStrategy{

    /**
     * Determina si un cliente puede pagar la suscripcion
     * @param cli El cliente que va a pagar
     * @param ser El servicio que va a cobrar
     * @param mesActual El mes en el que se encuentra la simulacion
     * @return True si el cliente tiene el dinero suficiente
     */
    public boolean canPay(Cliente cli, Servicio ser, int mesActual);

    /**
     * Metodo para realizar el cobro de un Servicio a un Cliente
     * @param cli El cliente que realiza el pago
     * @param ser El servicio que cobra
     * @param mesActual El mes en el que se encuentra la simulacion
     */
    public void cobrar(Cliente cli, Servicio ser, int mesActual);
}
/**
 * Error que se lanza si un cliente no puede pagar un servicio
 */

class NotEnoughMoneyException extends Exception{

    public NotEnoughMoneyException(){

        super("Dinero insuficiente");
    }
}
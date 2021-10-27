/**
 * Excepcion que se lanza cuando el id buscado no es valido
 */

class InvalidIdException extends Exception{

    public InvalidIdException(){

        super("El id no fue encontrado");
    }
}
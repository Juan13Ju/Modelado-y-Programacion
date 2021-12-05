// Error que se lanza cuando un usuario ingresa su usuario o contraseña incorrectamente
class WrongCredentialsException extends Exception{

    public WrongCredentialsException(){
        super("Credenciales incorrectas");
    }
}
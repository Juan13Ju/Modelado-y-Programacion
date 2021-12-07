// Clase que se encarga de realizar el login del usuario

import java.util.LinkedList;
class LoginHandler{
    /**
     * Metodo para realizar el login de un usario
     * @param nombreUsuario El usuario que va a iniciar sesion
     * @param contrasena La contraseña ingresada por el usuario
     * @param usuarios Una lista ligada que contiene a los usaurios de la aplicacion
     * @return El usuario logeado
     * @throws WrongCredentialsException si no encontro al usuario o la contraseña es incorrecta
     */
    public static Usuario login(String nombreUsuario, String contrasena, LinkedList<Usuario>usuarios){

        // Recorremos la lista de usuarios hasta encontrar al usuario que va a hacer login
        for(Usuario user : usuarios){
            // Y regresamos si la contraseña que ingreso es igual a la contraseña guardada
            if(user.getUsuario().equals(nombreUsuario)){
                if(user.getContrasena().equals(contrasena)){
                    return user;
                }else{
                    return null;
                }
            }
        }

        return null;
    }
    
    
}  

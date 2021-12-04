// Clase que se encarga de realizar el login del usuario

import java.util.LinkedList;
class LoginHandler{

    /**
     * Metodo para realizar el login de un usario
     * @param nombreUsuario El usuario que va a iniciar sesion
     * @param contrasena La contraseña ingresada por el usuario
     * ? Seria mejor usar un HashMap que contenga como llave el nombre del usuario?
     * ? Para evitar recorrer la lista. Que vamos a tener como 5 usuarios entonces no importa mucho xd
     * @param usuarios Una lista ligada que contiene a los usaurios de la aplicacion
     * @return true si 
     */
    public static boolean login(String nombreUsuario, String contrasena, LinkedList<Usuario>usuarios){

        // Recorremos la lista de usuarios hasta encontrar al usuario que va a hacer login
        for(Usuario user : usuarios){
            // Y regresamos si la contraseña que ingreso es igual a la contraseña guardada
            if(user.getUsuario().equals(nombreUsuario)){
                return user.getContrasena().equals(contrasena);
            }
        }

        return false;
    }
    /**
     * Método para recuperar la nacionalidad de un usuario dado su nombre y contraseña
     * @param nombreUsuario
     * @param contrasena
     * @param usuarios
     * @return 
     */
    public static String getNationality(String nombreUsuario, String contrasena, LinkedList<Usuario>usuarios){
        for(Usuario user: usuarios){
            if((user.getUsuario().equals(nombreUsuario)) && (user.getContrasena().equals(contrasena))){
                return user.getPais();
            }
        }
        return null;
    }
    /**
     * Método para recuperar el usuario dado su nombre y contraseña
     * @param nombreUsuario
     * @param contrasena
     * @param usuarios
     * @return 
     */
    public static Usuario getUser(String nombreUsuario, String contrasena, LinkedList<Usuario>usuarios){
        for(Usuario user: usuarios){
            if((user.getUsuario().equals(nombreUsuario)) && (user.getContrasena().equals(contrasena))){
                return user;
            }
        }
        return null;
    }
}

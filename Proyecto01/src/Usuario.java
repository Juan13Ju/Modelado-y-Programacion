/**
 * Clase que representa un usuario de la tienda
 */
class Usuario implements MyObserver{

    private String usuario;
    private String contrasena;
    private String nombre;
    private String telefono;
    private String direccion;
    private String cuentaBancaria;
    private String pais;
    private boolean tienePromocion;

    /**
     * Clase contructora de un usuario
     * @param usuario El nombre de usuario del cliente
     * @param contrasena La contraseña de la cuenta del cliente
     * @param nombre El nombre del cliente
     * @param telefono El telefono del cliente
     * @param direccion La direccion del cliente
     * @param cuentaBancaria La cuenta bancaria asociada al cliente
     * @param pais El pais del cliente
     */
    public Usuario(
        String usuario,
        String contrasena,
        String nombre,
        String telefono,
        String direccion,
        String cuentaBancaria,
        String pais){

            this.usuario = usuario;
            this.contrasena = contrasena;
            this.nombre = nombre;
            this.telefono = telefono;
            this.direccion = direccion;
            this.cuentaBancaria = cuentaBancaria;
            this.pais = pais;
            this.tienePromocion = false;
    }

    // Si un usuario tiene la promocion, se le notifica
    @Override
    public void update(){
        this.tienePromocion = true;
    }
    
    /**
    * Metodo que da el usuario del cliente
    */
    public String getUsuario(){
        return this.usuario;
    }

    /**
    * Metodo que da la contraseña del usuario
    */
    public String getContrasena(){
        return this.contrasena;
    }

    /**
    * Metodo que da el nombre del usuario
    */
    public String getNombre(){
        return this.nombre;
    }

    /**
    * Metodo que da el telefono del usuario
    */
    public String getTelefono(){
        return this.telefono;
    }

    /**
    * Metodo que da la direccion del usuario
    */
    public String getDireccion(){
        return this.direccion;
    }

    /**
    * Metodo que da el numero de cuenta bancaria del usuario
    */
    public String getCuentaBanco(){
        return this.cuentaBancaria;
    }

    /**
    * Metodo que da el pais de origen del usuario
    */ 
    public String getPais(){
        return this.pais;
    }

    /**
    * Metodo que da la promocion disponible para el usuario
    */
    public boolean tienePromocion(){
        return this.tienePromocion;
    }
}

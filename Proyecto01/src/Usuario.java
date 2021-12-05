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
    
    public String getUsuario(){
        return this.usuario;
    }

    public String getContrasena(){
        return this.contrasena;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public String getCuentaBanco(){
        return this.cuentaBancaria;
    }

    public String getPais(){
        return this.pais;
    }

    public boolean tienePromocion(){
        return this.tienePromocion;
    }
}
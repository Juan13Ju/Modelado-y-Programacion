
class Personaje{

    /**
     * El nombre del personaje
     */
    private String nombre;
    /**
     * El arma del personaje
     */
    private String arma;
    /**
     * Una pequeña descripcion del personaje, la cual podra ser modificada cuando 
     * obtiene un sentido mejorado
     */
    private String descripcion;

    // TODO: Añadir los atributos Sentido y ObjetoDeProteccion

    /**
     * La afinidad del personaje con la deidad de la proteccion, afecta la probabilidad de
     * que dicha deidad le responda
     */
    private int afinidadDeidadProteccion;

    /**
     * La afinidad del personaje con la deidad de la sabiduria, afecta la probabilidad de
     * que dicha deidad le responda
     */
    private int afinidadDeidadSabiduria;

    /**
     * La afinidad del personaje con la deidad de la codicia, afecta la probabilidad de
     * que dicha deidad le responda
     */
    private int afinidadDeidadCodicia;

    /**
     * ? Los años de vida del personaje, se usan para interactuar con no me acuerdo que dios
     */
    private int añosDeVida;

    /**
     * ? Los recuerdos del personaje, se usan para interactuar con no me acuerdo que dios
     */
    private int recuerdos;

    /**
     * ? Las emociones del personaje, se usan para interactuar con no me acuerdo que dios
     */
    private int emociones;

    /**
     * Los puntos de vida del personaje
     */
    private int vida;

    /**
     * Los puntos de ataque del personaje
     */
    private int ataque;

    /**
     * Los puntos de defensa del personaje
     */
    private int defensa;

    public Personaje(
        String nombre,
        String arma,
        String descripcion,
        int afinidadDeidadProteccion,
        int afinidadDeidadSabiduria,
        int afinidadDeidadCodicia,
        int añosDeVida,
        int recuerdos,
        int emociones,
        int ataque,
        int defensa){

            this.nombre = nombre;
            this.arma = arma;
            this.descripcion = descripcion;
            this.afinidadDeidadProteccion = afinidadDeidadProteccion;
            this.afinidadDeidadSabiduria = afinidadDeidadSabiduria;
            this.afinidadDeidadCodicia = afinidadDeidadCodicia;
            this.añosDeVida = añosDeVida;
            this.recuerdos = recuerdos;
            this.emociones = emociones;
            // Cada personaje comienza con 100 de vida
            this.vida = 100;
            this.ataque = ataque;
            this.defensa = defensa;
            // TODO: Agregar atributos de Sentido y ObjetDeProteccion
    }

    // Metodos getters

    /**
     * @return El nombre del peronaje
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * @return El arma del personaje
     */
    public String getArma(){
        return this.arma;
    }

    /**
     * @return La descripcion del personaje
     */
    public String getDescripcion(){
        return this.descripcion;
    }

    /**
     * @return La afinidad del personaje con la deidad de la proteccion
     */
    public int getAfinidadDeidadProteccion(){
        return this.afinidadDeidadProteccion;
    }

    /**
     * @return La afinidad del personaje con la deidad de la sabiduria
     */
    public int getAfinidadDeidadSabiduria(){
        return this.afinidadDeidadSabiduria;
    }

    /**
     * @return La afinidad del personaje con la deidad de la codicia
     */
    public int getAfinidadDeidadCodicia(){
        return this.afinidadDeidadCodicia;
    }

    /**
     * @return Los años de vida de personaje
     */
    public int getAñosDeVida(){
        return this.añosDeVida;
    }

    /**
     * @return La cantidad de emociones del personaje
     */
    public int getEmociones(){
        return this.emociones;
    }

    /**
     * @return La cantidad de recuerdos del personaje
     */
    public int getRecuerdos(){
        return this.recuerdos;
    }

    /**
     * @return La vida actual del personaje
     */
    public int getVida(){
        return this.vida;
    }

    /**
     * @return El ataque del personaje
     * * Aqui se me ocurre que podriamos cambiarle el ataque dependiendo de los objetos de proteccion que tenga
     * * para no tener que manejarlo mas adelante en la pelea y solo hacer el getAtaque()
     */
    public int getAtaque(){
        return this.ataque;
    }

    /**
     * @return La defensa del personaje
     * * La misma anotacion que en getAtaque()
     */
    public int getDefensa(){
        return this.defensa;
    }

    // Metodos setters

    /**
     * Metodo para añadir la descripcion de los sentidos al personaje
     * @param nueva El string que se va a añadir a la descripcion
     */
    public void setDescripcion(String nueva){
        this.descripcion = this.getDescripcion() + "\n" + nueva;
    }

    /**
     * Metodo para cambiar los años de vida del personaje
     * @param años Los nuevos años de vida restantes
     */
    public void setAñosDeVida(int años){

        this.añosDeVida = años;
    }

    /**
     * Metodo para cambiar la cantidad de recuerdos del personaje
     * @param nuevo La nueva cantidad de recuerdos del personaje
     */
    public void setRecuerdos(int nuevo){
        this.recuerdos = nuevo;
    }

    /**
     * Metodo para cambiar las emociones del personaje
     * @param nuevo La nueva cantidad de emociones del personaje
     */
    public void setEmociones(int nuevo){
        this.emociones = nuevo;
    }
}

/**
 * Clase que representa el menu de lujo del restaurante
 */
class MenuDeLujo implements Menu{

    /**
     * El menu de hamburguesas contenido en un hashtable
     */
    Hashtable Macburguesa = new Macburguesa();

    /**
     * Constructor para el menu general
     * @param menu un hashtable representando el menu
     */
    public MenuGeneral(new Macburguesa){

        this.menu = menu;
    }

    /**
     * Regresa un iterador del Menu General
     * @return Objeto de tipo iterador para el Menu General
     */
    public Iterator createIterator(){

        return new MenuDeLujoIterator(menu);
    }
}

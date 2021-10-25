/**
 * Clase que representa el menu general del restaurante
 */
class MenuGeneral implements Menu{

    /**
     * El menu de hamburguesas contenido en un arreglo
     */
    Macburguesa[] menu;

    /**
     * Constructor para el menu general
     * @param menu Un arreglo representando el menu
     */
    public MenuGeneral(Macburguesa[] menu){

        this.menu = menu;
    }

    /**
     * Regresa un iterador del Menu General
     * @return Objeto de tipo iterador para el Menu General
     */
    public Iterator createIterator(){

        return new MenuGeneralIterator(menu);
    }
}
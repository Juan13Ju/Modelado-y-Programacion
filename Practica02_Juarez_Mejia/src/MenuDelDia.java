/**
 * Clase que representa el menu del dia del restaurante
 */
class MenuDelDia implements Menu{

    /**
     * El menu de hamburguesas contenido en una lista de arreglos
     */
    ArrayList<String> Macburguesa = new ArrayList<Macburguesa>(menu);

    /**
     * Constructor para el menu del dia
     * @param menu Una lista de arreglo representando el menu
     */
    public MenuDelDia(new ArrayList<Macburguesa>(menu)){

        this.menu = menu;

    }

    /**
     * Regresa un iterador del Menu General
     * @return Objeto de tipo iterador para el Menu General
     */
    public Iterator createIterator(){

        return new MenuDelDiaIterator(menu);
    }
}

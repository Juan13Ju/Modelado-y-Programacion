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
    public MenuGeneral(){

        Macburguesa pollo = new Macburguesa(1,"pollo", "Ham con pollo", 20, true, false);
        Macburguesa carne = new Macburguesa(2,"carne", "Ham con carne", 25, false, true);
        Macburguesa veg = new Macburguesa(3,"veg", "Ham veg", 10, true, false);
        this.menu = new Macburguesa[]{pollo, carne, veg};
    }

    /**
     * Regresa un iterador del Menu General
     * @return Objeto de tipo iterador para el Menu General
     */
    public MyIterator createIterator(){

        return new MenuGeneralIterator(menu);
    }
}
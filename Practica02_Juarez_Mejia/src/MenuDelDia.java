/**
 * Clase que representa el menu del dia del restaurante
 */

import java.util.ArrayList;

class MenuDelDia implements Menu{

    /**
     * El menu de hamburguesas contenido en un arraylist
     */
    ArrayList<Macburguesa> menu;

    /**
     * Constructor para el menu del dia
     * @param menu Un arraylist representando el menu del dia
     */
    public MenuDelDia(){

        Macburguesa libra = new Macburguesa("4","Macburger de libra", "Hamburguesa de 1/4 de libra de carne", 59.99, false, false);
        Macburguesa libraqueso = new Macburguesa("5","Macburger de libra con queso", "La misma hamburguesa de libra pero con queso", 61.09 , true, false);
        Macburguesa pollo = new Macburguesa("6","Macburger de pollo", "Hamburguesa de carne de pollo", 45.02, true, false);
        Macburguesa vegana = new Macburguesa("7","Macburger vegana", "Hamburguesa de carne a base de plantas", 10, false, true);
        Macburguesa tocino = new Macburguesa("8"," Mcburger con tocino", "Hamburguesa de carne de res con tocino frito", 62.01, true, false);
        ArrayList<Macburguesa> menu = new ArrayList<>();
        menu.add(libra);
        menu.add(libraqueso);
        menu.add(pollo);
        menu.add(vegana);
        menu.add(tocino);
        this.menu = menu;
    }

    /**
     * Regresa un iterador del Menu del dia
     * @return Objeto de tipo iterador para el Menu del dia
     */
    public MyIterator createIterator(){

        return new MenuDelDiaIterator(menu);
    }
}

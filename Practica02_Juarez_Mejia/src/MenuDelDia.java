/**
 * Clase que define las hamburguesas del menu del dia
 */

import java.util.ArrayList;

class MenuDelDia implements Menu{

    /**
     * ArrayList con las hamburguesas del dia
     */
    ArrayList<Macburguesa> menu;

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

    public MyIterator createIterator(){

        return new MenuDelDiaIterator(menu);
    }
}

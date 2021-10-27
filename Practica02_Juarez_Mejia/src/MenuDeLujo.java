import java.util.Hashtable;

class MenuDeLujo implements Menu{

    /**
     * HashTable donde se almacenan las hamburguesas del menu
     */
    Hashtable<Integer, Macburguesa> menu;

    public MenuDeLujo(){

        Macburguesa pollo = new Macburguesa(7,"pollo lujo", "Ham con pollo lujo", 20, true, false);
        Macburguesa carne = new Macburguesa(8,"carne lujo", "Ham con carne lujo", 25, false, true);
        Macburguesa veg = new Macburguesa(9,"veg lujo", "Ham veg lujo", 10, true, false);

        Hashtable<Integer, Macburguesa> menu = new Hashtable<>();
        menu.put(1, pollo);
        menu.put(2, carne);
        menu.put(3, veg);
        this.menu = menu;
    }

    @Override
    public MyIterator createIterator(){

        return new MenuDeLujoIterator(menu);
    }
}
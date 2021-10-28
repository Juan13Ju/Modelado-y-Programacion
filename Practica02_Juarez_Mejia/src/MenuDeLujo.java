/**
 * Clase que representa el menu de lujo del restaurante
 */
import java.util.Hashtable;

class MenuDeLujo implements Menu{

    /**
     * HashTable donde se almacenan las hamburguesas del menu de lujo
     */
    Hashtable<Integer, Macburguesa> menu;

    /**
     * Constructor para el menu de lujo
     * @param menu Un hashtable representando el menu de lujo
     */
    public MenuDeLujo(){

        Macburguesa bbq = new Macburguesa("9","Mcburger BBQ", "Hamburguesa de carne de res con salsa BBQ", 89.40, true, false);
        Macburguesa ranch = new Macburguesa("10","Mcburger ranch", "Hamburguesa de carne de res con salsa ranch", 89.90, true, true);
        Macburguesa acaramelada = new Macburguesa("11","Macburger acaramelada", "Hamburguesa de carne de res con cebolla y pan caramelizado", 90.02, true, false);

        Hashtable<Integer, Macburguesa> menu = new Hashtable<>();
        menu.put(1, bbq);
        menu.put(2, ranch);
        menu.put(3, acaramelada);
        this.menu = menu;
    }

    /**
     * Regresa un iterador del Menu de lujo
     * @return Objeto de tipo iterador para el Menu de lujo
     */
    @Override
    public MyIterator createIterator(){

        return new MenuDeLujoIterator(menu);
    }
}

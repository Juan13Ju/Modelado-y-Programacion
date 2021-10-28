/**
 * Iterador de la clase que define las hamburguesas del menu de lujo
 */

import java.util.Set;
import java.util.Hashtable;
import java.util.Iterator;

class MenuDeLujoIterator implements MyIterator{

    /**
     * Hashtable donde se guardan las hamburguesas
     */
    Hashtable<Integer, Macburguesa> menu;

    /**
     * ArrayList donde guardamos las llaves del hashtable
     */
    Set<Integer> llaves;

    /**
     * Iterador del Set
     */
    Iterator<Integer> setIterator;

    public MenuDeLujoIterator(Hashtable<Integer, Macburguesa> menu){
        
        this.menu = menu;
        this.llaves = menu.keySet();
        this.setIterator = llaves.iterator(); 
    }

    /**
     * Devuelve verdadero si la estructura de datos tiene un elemento siguiente
     */
    @Override
    public boolean hasNext(){

        return setIterator.hasNext();
    }

    /**
     * Devuelve el objeto siguiente
     */
    @Override
    public Object next(){

        return menu.get(setIterator.next());
    }
}

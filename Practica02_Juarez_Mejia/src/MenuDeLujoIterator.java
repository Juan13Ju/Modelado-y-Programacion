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

    @Override
    public boolean hasNext(){

        return setIterator.hasNext();
    }

    @Override
    public Object next(){

        return menu.get(setIterator.next());
    }
}
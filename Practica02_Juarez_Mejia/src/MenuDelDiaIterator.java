/**
 * Iterador de la clase que define las hamburguesas del menu del dia
 */
import java.lang.reflect.Array;
import java.util.ArrayList;

class MenuDelDiaIterator implements MyIterator{

    /**
     * ArrayList sobre la cual vamos a iterar
     */
    ArrayList<Macburguesa> menu;

    /**
     * Posicion en la que nos encontramos
     */
    int position;

    public MenuDelDiaIterator(ArrayList<Macburguesa> menu){

        this.menu = menu;
        this.position = 0;
    }

    /**
     * Devuelve verdadero si la estructura de datos tiene un elemento siguiente
     */
    @Override
    public boolean hasNext(){

        return position < menu.size();
    }

    /**
     * Devuelve el objeto siguiente
     */
    @Override
    public Object next(){

        return menu.get(position++);
    }
}

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

    @Override
    public boolean hasNext(){

        return position < menu.size();
    }

    @Override
    public Object next(){

        return menu.get(position++);
    }
}
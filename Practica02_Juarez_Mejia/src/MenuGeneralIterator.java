/**
 * Iterador de la clase que define las hamburguesas del menu general
 */
class MenuGeneralIterator implements MyIterator{

    /**
     * Las hamburguesas del menu general
     */
    Macburguesa[] menu;
    /**
     * La posicion en la cual se encuentra el iterador
     */
    int position;

    public MenuGeneralIterator(Macburguesa[] menu){

        this.menu = menu;
        this.position = 0;
    }

    /**
     * Devuelve verdadero si la estructura de datos tiene un elemento siguiente
     */
    @Override
    public boolean hasNext(){

        return position < menu.length;
    }

    /**
     * Devuelve el objeto siguiente
     */
    @Override
    public Macburguesa next(){

        return menu[position++];
    }
}

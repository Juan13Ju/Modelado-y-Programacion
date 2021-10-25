class MenuGeneralIterator implements Iterator{

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

    @Override
    public boolean hasNext(){

        return position < menu.length;
    }

    @Override
    public Macburguesa next(){

        return menu[position++];
    }
}
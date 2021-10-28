/**
 * Clase que representa el menu general del restaurante
 */
class MenuGeneral implements Menu{

    /**
     * El menu de hamburguesas contenido en un arreglo
     */
    Macburguesa[] menu;

    /**
     * Constructor para el menu general
     * @param menu Un arreglo representando el menu general
     */
    public MenuGeneral(){

        Macburguesa clasica = new Macburguesa("1","Macburger clásica", "Hamburguesa sencilla.", 39.00, false, false);
        Macburguesa big = new Macburguesa("2","Macburger big", "Hamburguesa de 2 carnes y 3 panes", 50.30, true, false);
        Macburguesa soya = new Macburguesa("3","Macburger de soya", "Hamburguesa de carne de soya", 40.05, true, true);
        this.menu = new Macburguesa[]{clasica, big, soya};
    }
    

    /**
     * Regresa un iterador del Menu General
     * @return Objeto de tipo iterador para el Menu General
     */
    public MyIterator createIterator(){

        return new MenuGeneralIterator(menu);
    }
}

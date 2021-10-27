import java.util.ArrayList;

class MenuDelDia implements Menu{

    /**
     * ArrayList con las hamburguesas del dia
     */
    ArrayList<Macburguesa> menu;

    public MenuDelDia(){

        Macburguesa pollo = new Macburguesa(4,"pollo del dia", "Ham con pollo del dia", 20, true, false);
        Macburguesa carne = new Macburguesa(5,"carne del dia", "Ham con carne del dia", 25, false, true);
        Macburguesa veg = new Macburguesa(6,"veg del dia", "Ham veg del dia", 10, true, false);
        ArrayList<Macburguesa> menu = new ArrayList<>();
        menu.add(pollo);
        menu.add(carne);
        menu.add(veg);
        this.menu = menu;
    }

    public MyIterator createIterator(){

        return new MenuDelDiaIterator(menu);
    }
}
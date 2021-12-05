import java.util.Iterator;
import java.util.LinkedList;

/**
 * Clase que representa un catalogo de la tienda CheemsMart
 */
public class Catalogo {
    
    private LinkedList<Producto> catalogo = new LinkedList<Producto>();
    
    
    public Catalogo(){
    // Los atributos o productos del area de electronica, electronidomesticos y abarrotes.
        Producto p1 = new Producto("Pantalla Smart TV 40 pulgadas Hisense","01","Electronica",5990);
        Producto p2 = new Producto("Pantalla Smart TV 50 pulgadas Samsung","02","Electronica",8990);
        Producto p3 = new Producto("Pantalla Smart TV 48 pulgadas TLC", "03","Electronica",6750);
        Producto p4 = new Producto("Pantalla Smart TV 55 pulgadas Philips","04", "Electronica", 9990);
        Producto p5 = new Producto("Pantalla Smart TV 65 pulgadas Sony", "05", "Electronica", 12990);
        Producto p6 = new Producto("Laptop Dell Inspiron I3505 AMD Ryzen 5","06", "Electronica",13999);
        Producto p7 = new Producto("Laptop Lenovo Ideapad AMD Ryzen 7", "07", "Electronica",17499);
        Producto p8 = new Producto("MacBook Air Apple MGN63LA 8GB", "08", "Electronica",23249);
        Producto p9 = new Producto("Laptop HP 255 G7 ATHLON 4GB","09","Electronica",9249);
        Producto p10 = new Producto("Camara 360 Mitzu","10","Electronica",1199);
        Producto p11 = new Producto("Freidora de Aire Taurus", "11","Electrodomesticos",1499);
        Producto p12 = new Producto("Batidora de Pedestal Oster","12","Electrodomesticos",4200);
        Producto p13 = new Producto("Aspiradora Koblenz","13","Electrodomesticos",1639);
        Producto p14 = new Producto("Cafetera Oster Prima Latte", "14","Electrodomesticos",6249);
        Producto p15 = new Producto("Procesador de alimentos Nutribullet", "15","Electrodomesticos",2029);
        Producto p16 = new Producto("Licuadora Oster Acero inoxidable", "16","Electrodomesticos",879);
        Producto p17 = new Producto("Wafflera Belga Hamilton Beach","17","Electrodomesticos",710);
        Producto p18 = new Producto("Horno Electrico Max Kalorik","18","Electrodomesticos",7999);
        Producto p19 = new Producto("Ventilador de Pedestal Taurus","19","Electrodomesticos",566);
        Producto p20 = new Producto("Extractor de jugos T-fal","20", "Electrodomesticos",1049);
        Producto p21 = new Producto("Pack de 12 Frijoles Bayos La Costeña","21","Abarrotes",381);
        Producto p22 = new Producto("Huevo Blanco San Juan 30 pzas", "22","Abarrotes",67);
        Producto p23 = new Producto("Galletas Principe","23","Abarrotes",36);
        Producto p24 = new Producto("Cereal Kellogs FrootLoops","24","Abarrotes",46);
        Producto p25 = new Producto("Mayonesa McCormick", "25","Abarrotes",63);
        Producto p26 = new Producto("Atun Dolores aleta amarilla 140g","26","Abarrotes",19);
        Producto p27 = new Producto("Cafe soluble Nescafe 400g","27","Abarrotes",156);
        Producto p28 = new Producto("Sopa Maruchan de Camaron con Habanero", "28","Abarrotes",12);
        Producto p29 = new Producto("Leche Alpura Deslactosada","29","Abarrotes",22);
        Producto p30 = new Producto("Aceite de cocina 123","30","Abarrotes",29);
        catalogo.add(p1);
        catalogo.add(p2);
        catalogo.add(p3);
        catalogo.add(p4);
        catalogo.add(p5);
        catalogo.add(p6);
        catalogo.add(p7);
        catalogo.add(p8);
        catalogo.add(p9);
        catalogo.add(p10);
        catalogo.add(p11);
        catalogo.add(p12);
        catalogo.add(p13);
        catalogo.add(p14);
        catalogo.add(p15);
        catalogo.add(p16);
        catalogo.add(p17);
        catalogo.add(p18);
        catalogo.add(p19);
        catalogo.add(p20);
        catalogo.add(p21);
        catalogo.add(p22);
        catalogo.add(p23);
        catalogo.add(p24);
        catalogo.add(p25);
        catalogo.add(p26);
        catalogo.add(p27);
        catalogo.add(p28);
        catalogo.add(p29);
        catalogo.add(p30);
    }

/**
 * Metodo que da el catalogo
 */
public Iterator getIterador(){
    return catalogo.iterator();
}  

/**
 * Metodo para obtener un producto del catalogo para poder agregarlo al carrito de compra
 * @param nombre El nombre del producto
 * @return El objeto producto si el producto se encuentra en el catalogo, null en caso contrario
 */
public Producto getProducto(String nombre){

    for(Producto prod : catalogo){
        if(prod.getNombre().equals(nombre)){
            return prod;
        }
    }
    return null;
}

// !Borrar este metodo
public LinkedList<Producto> getLista(){
    return this.catalogo;
}
    
    
}

import java.util.ArrayList;
import java.util.Iterator;

public class Catalogo {
    
    private ArrayList<Producto> catalogo = new ArrayList<Producto>();
    
    
    public Catalogo(){
    
        Producto p1 = new Producto("Pantalla Smart TV 40 pulgadas Hisense","060890135673","Electronica",5990);
        Producto p2 = new Producto("Pantalla Smart TV 50 pulgadas Samsung","010203040565","Electronica",8990);
        Producto p3 = new Producto("Pantalla Smart TV 48 pulgadas TLC", "684628492741","Electronica",6750);
        Producto p4 = new Producto("Pantalla Smart TV 55 pulgadas Philips","184029573018", "Electronica", 9990);
        Producto p5 = new Producto("Pantalla Smart TV 65 pulgadas Sony", "1495938284910", "Electronica", 12990);
        Producto p6 = new Producto("Laptop Dell Inspiron I3505 AMD Ryzen 5","10495028543", "Electronica",13999);
        Producto p7 = new Producto("Laptop Lenovo Ideapad AMD Ryzen 7", "958329583085", "Electronica",17499);
        Producto p8 = new Producto("MacBook Air Apple MGN63LA 8GB", "957365038274", "Electronica",23249);
        Producto p9 = new Producto("Laptop HP 255 G7 ATHLON 4GB","8573639472823","Electronica",9249);
        Producto p10 = new Producto("Camara 360 Mitzu","021394382938","Electronica",1199);
        Producto p11 = new Producto("Freidora de Aire Taurus", "563948729238","Electrodomesticos",1499);
        Producto p12 = new Producto("Batidora de Pedestal Oster","3853994857","Electrodomesticos",4200);
        Producto p13 = new Producto("Aspiradora Koblenz","7462598473212","Electrodomesticos",1639);
        Producto p14 = new Producto("Cafetera Oster Prima Latte", "3759934948523","Electrodomesticos",6249);
        Producto p15 = new Producto("Procesador de alimentos Nutribullet", "471949402384","Electrodomesticos",2029);
        Producto p16 = new Producto("Licuadora Oster Acero inoxidable", "9583432874743","Electrodomesticos",879);
        Producto p17 = new Producto("Wafflera Belga Hamilton Beach","57937873582","Electrodomesticos",710);
        Producto p18 = new Producto("Horno Electrico Max Kalorik","247839384394","Electrodomesticos",7999);
        Producto p19 = new Producto("Ventilador de Pedestal Taurus","48349283882","Electrodomesticos",566);
        Producto p20 = new Producto("Extractor de jugos T-fal","32523423985", "Electrodomesticos",1049);
        Producto p21 = new Producto("Pack de 12 Frijoles Bayos la costeña","5972893256","Abarrotes",381);
        Producto p22 = new Producto("Huevo Blanco San Juan 30 pzas", "481928384872","Abarrotes",67);
        Producto p23 = new Producto("Galletas Principe","747238293293","Abarrotes",36);
        Producto p24 = new Producto("Cereal Kellogs FrootLoops","448595930324","Abarrotes",46);
        Producto p25 = new Producto("Mayonesa McCormick", "93856385","Abarrotes",63);
        Producto p26 = new Producto("Atun Dolores aleta amarilla 140g","983884103430","Abarrotes",19);
        Producto p27 = new Producto("Cafe soluble nescafe 400g","43809232472","Abarrotes",156);
        Producto p28 = new Producto("Sopa Maruchan de Camaron con Habanero", "281289343298","Abarrotes",12);
        Producto p29 = new Producto("Leche Alpura Deslactosada","5734874387","Abarrotes",22);
        Producto p30 = new Producto("Aceite de cocica 123","48734149393","Abarrotes",29);
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

public Iterator getIterador(){
    return catalogo.iterator();
}    
    
    
}

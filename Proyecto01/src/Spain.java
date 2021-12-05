import java.util.Iterator;
import java.util.Scanner;


public class Spain implements Lenguaje{

    @Override
    public void mostrarCatalogo() {
        Scanner in = new Scanner(System.in);
        int opcion;
        Catalogo catalogo = new Catalogo();
        Iterator productos = catalogo.getIterador();
        System.out.println("**********BIENVENIDO A CHEEMSMART TIO**********");
        System.out.println("░░░░░░░░░▄░░░░░░░░░░░░░░▄░░░░");
	    System.out.println("░░░░░░░░▌▒█░░░░░░░░░░░▄▀▒▌░░░");
	    System.out.println("░░░░░░░░▌▒▒█░░░░░░░░▄▀▒▒▒▐░░░");
	    System.out.println("░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐░░░");
	    System.out.println("░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐░░░");
	    System.out.println("░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌░░░");
	    System.out.println("░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒▌░░");
	    System.out.println("░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐░░");
	    System.out.println("░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄▌░");
	    System.out.println("░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▌░");
	    System.out.println("▀▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒▐░");
	    System.out.println("▐▒▒▐▀▐▀▒░▄▄▒▄▒▒▒▒▒▒░▒░▒░▒▒▒▒▌");
	    System.out.println("▐▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒▒▒░▒░▒░▒▒▐░");
	    System.out.println("░▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒░▒░▒░▒░▒▒▒▌░");
	    System.out.println("░▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▄▒▒▐░░");
	    System.out.println("░░▀▄▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▄▒▒▒▒▌░░");
	    System.out.println("░░░░▀▄▒▒▒▒▒▒▒▒▒▒▄▄▄▀▒▒▒▒▄▀░░░");
	    System.out.println("░░░░░░▀▄▄▄▄▄▄▀▀▀▒▒▒▒▒▄▄▀░░░░░");
	    System.out.println("░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▀▀░░░░░░░░");
        System.out.println("¿Que deseais hacer?\n");
        do {
            
        
        System.out.println("1.- Mostrar el catalogo de productos\n"
                + "2.- Realizar una compra\n"
                + "3.- Salir\n");
        while (true){
            try{
                String opcionUser = in.nextLine();
                opcion = Integer.parseInt(opcionUser);
                break;
            } catch (NumberFormatException ex){
                System.out.println("Ingresa una opcion valida "
                        + "¿Que deseais hacer?\n"
                        + "1.- Ver el catalogo de productos\n"
                        + "2.- Realizar una compra\n"
                        + "3.- Salir\n");
            }
        }
        switch(opcion){
            case 1:
                while(productos.hasNext()){
                    System.out.println(productos.next().toString());
                }
            case 2:
                while(productos.hasNext()){
                    System.out.println(productos.next().toString());
                }
                    do{
                        System.out.println("Escribe el codigo de barras del producto que deseais comprar\n");
                        String productwanted = in.nextLine();
                        Producto p = catalogo.getProducto(productwanted);
                        option = productwanted;
                        while(true){
                        try{
                        System.out.println("¿Quereis añadir: " + p.getNombre() + " a tu carrito de compras?\n"
                                + "1.- Si tio\n"
                                + "2.- No ostias\n");
                        String want = in.nextLine();
                        desc = Integer.parseInt(want);
                        break;
                        } catch (NumberFormatException ex){
                            System.out.println("Ingresa una opcion valida\n"
                                    + "¿Quereis añadir: " + p.getNombre() + " a tu carrito de compras??\n"
                                            + "1.- Si tio\n"
                                            + "2.- No ostias\n");
                        }
                        }
                        if (desc == 1){
                            carrito.add(p);
                            while(true){
                                try{
                                    System.out.println("¿Quereis añadir mas productos a tu carrito de compras?\n"
                                            + "1.- Si tio\n"
                                            + "2.- No ostias\n");
                                    String want = in.nextLine();
                                    more = Integer.parseInt(want);
                                    break;
                                } catch (NumberFormatException ex){
                                    System.out.println("¿Quereis añadir mas productos a tu carrito de compras?\n"
                                            + "1.- Si tio\n"
                                            + "2.- No ostias\n");
                                }
                            }
                            if (more == 1){
                                option = "continue";
                            } else System.out.println("Falta codigo aqui");//aquí va el código cuando ya quiere realizar la compra
                            option = "cancel"; 
                                } 
                    } while (option == "cancel");
            case 3:
                break;
            default:
                System.out.println("Por favor elige la opcion que deseas ejecutar ostias");
                break;
                
        }
    }
    
}

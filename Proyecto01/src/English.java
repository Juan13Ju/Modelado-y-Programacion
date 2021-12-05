import java.util.Iterator;
import java.util.Scanner;


public class English implements Lenguaje{

    @Override
    
    public void mostrarCatalogo() {
        Scanner in = new Scanner(System.in);
        int opcion;
        Catalogo catalogo = new Catalogo();
        Iterator productos = catalogo.getIterador();
        System.out.println("**********WELCOME TO CHEEMSMART**********");
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
        System.out.println("How can I help you?\n");
        do {
            
        
        System.out.println("1.- Show Catalog\n"
                + "2.- Make a purchase\n"
                + "3.- Exit\n");
        while (true){
            try{
                String opcionUser = in.nextLine();
                opcion = Integer.parseInt(opcionUser);
                break;
            } catch (NumberFormatException ex){
                System.out.println("Enter a valid option\n "
                        + "How can I help you?\n"
                        + "1.- Show Catalog\n"
                        + "2.- Make a purchase\n"
                        + "3.- Exit\n");
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
                        System.out.println("Write the barcode of the product you want or write 'cancel' if you want to cancel the purchase\n");
                        String productwanted = in.nextLine();
                        Producto p = catalogo.getProducto(productwanted);
                        option = productwanted;
                        while(true){
                        try{
                        System.out.println("Do u want to add: " + p.getNombre() + " to your shopping cart?\n"
                                + "1.- Yes\n"
                                + "2.- No\n");
                        String want = in.nextLine();
                        desc = Integer.parseInt(want);
                        break;
                        } catch (NumberFormatException ex){
                            System.out.println("Enter a valid option\n"
                                    + "Do u want to add: " + p.getNombre() + " to your shopping cart?\n"
                                            + "1.- Yes\n"
                                            + "2.- No\n");
                        }
                        }
                        if (desc == 1){
                            carrito.add(p);
                            while(true){
                                try{
                                    System.out.println("Do u want to add more products to your shopping cart?\n"
                                            + "1.- Yes\n"
                                            + "2.- No\n");
                                    String want = in.nextLine();
                                    more = Integer.parseInt(want);
                                    break;
                                } catch (NumberFormatException ex){
                                    System.out.println("Do u want to add more products to your shopping cart?\n"
                                            + "1.- Yes\n"
                                            + "2.- No\n");
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
                System.out.println("Please choose the option you want to run");
                break;
                
        }
    }
    
}

import java.util.Scanner;
import java.util.LinkedList;

class InterfazProxy implements InterfazTienda{

    InterfazTienda interfaz;

    public InterfazProxy(InterfazTienda interfaz){

        this.interfaz = interfaz;
    }

    @Override
    public void mostrarInterfaz(Scanner sc, Promocion promo, Usuario user){
        String opcion;
        while(true){
            interfaz.mostrarInterfaz(sc, promo, user);
            opcion = sc.nextLine();
            switch(opcion){
                case "1":
                    mostrarCatalogo();
                    break;
                case "2":
                    LinkedList<Producto> carrito = realizarCompra(sc, promo, user);
                    compraSegura(sc, promo, user, carrito);
                    break;
                case "3":
                    salir();
                    return;
                default:
                    System.out.println(defaultMessage());
            }
        }
    }

    @Override
    public void mostrarCatalogo(){
        interfaz.mostrarCatalogo();
    }

    @Override
    public String defaultMessage(){
        return interfaz.defaultMessage();
    }

    @Override
    public void salir(){
        interfaz.salir();
    }

    @Override
    public LinkedList<Producto> realizarCompra(Scanner sc, Promocion promo, Usuario user){

        LinkedList<Producto> carrito = interfaz.realizarCompra(sc, promo, user);
        
        return carrito;
    }

    @Override
    public void compraSegura(Scanner sc, Promocion promo, Usuario user, LinkedList<Producto> carrito){
        interfaz.compraSegura(sc, promo, user, carrito);
    }
}
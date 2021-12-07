import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class InterfazUSA implements InterfazTienda {

    Catalogo catalogo;
    String switchDefaultMessage;

    public InterfazUSA() {
        this.catalogo = InterfazTienda.catalogo;
        this.switchDefaultMessage = "Invalid option, please try again";
    }

    @Override
    public void mostrarInterfaz(Scanner sc, Promocion promo, Usuario user) {
        
        if (user.tienePromocion()) {
            System.out.println("-----------");
            System.out.println("Today, users from " + user.getPais() + " hava a discount of "
                    + promo.getDescuento() + "% in " + promo.getDepartamento() + " products");
            System.out.println("-----------");
        }

        System.out.println("Choose an option: ");
        System.out.println("1 - Show catalog");
        System.out.println("2 - Buy");
        System.out.println("3 - Log out");


    }

    @Override
    public void mostrarCatalogo() {

        Iterator<Producto> iterator = catalogo.getIterador();
        Producto prod;
        System.out.println("---Printing store catalog---");
        // Imprimimos todos los productos del catalogo
        while (iterator.hasNext()) {
            prod = iterator.next();
            System.out.println(prod.toString());
        }
    }

    @Override
    public void salir(){
        System.out.println("Logging out...");
    }

    @Override
    public LinkedList<Producto> realizarCompra(Scanner sc, Promocion promo, Usuario user) {

        LinkedList<Producto> carrito = new LinkedList<>();
        String opcionProducto;
        String opcionCompra;
        boolean isFinished = false;
        while (!isFinished) {
            System.out.println("Choose an option: ");
            System.out.println("1 - Add product to cart");
            System.out.println("2 - Cancel");
            System.out.println("3 - Pay");
            opcionCompra = sc.nextLine();
            switch (opcionCompra) {
                case "1":
                    mostrarCatalogo();
                    System.out.println("Enter the barcode of the desired product: ");
                    opcionProducto = sc.nextLine();
                    Producto prod = catalogo.getProducto(opcionProducto);
                    if (prod == null) {
                        System.out.println("Product not found, try again");
                        break;
                    }
                    carrito.add(prod);
                    break;
                case "2":
                    carrito.clear();
                    isFinished = true;
                    break;
                case "3":
                    isFinished = true;                
                    break;
                default:
                    System.out.println("Invalid option, please try again");
            }
        }

        return carrito;

    }

    @Override
    public void compraSegura(Scanner sc, Promocion promo, Usuario user, LinkedList<Producto> carrito) {

        if(carrito.size() == 0){
            System.out.println("Cart is empty");
            return;
        }

        System.out.println("-----");
        System.out.println("Starting secure payment");
        System.out.println("-----");
        System.out.println(user.getNombre() + ", enter your bank account to confirm transaction: ");
        String cuenta = sc.nextLine();
        if(cuenta.equals(user.getCuentaBanco())){
            System.out.println("Succesful transaction, generating ticket...");
            promo.generarTicket(carrito, user.tienePromocion());
            System.out.println("Delivery date at " + user.getDireccion() + ": 12/12/2022");
        }else{
            System.out.println("Wrong bank account, rejected transaction");
        }
    }

    @Override
    public String defaultMessage(){
        return this.switchDefaultMessage;
    }
}
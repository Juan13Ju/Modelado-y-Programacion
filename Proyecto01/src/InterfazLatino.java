import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class InterfazLatino implements InterfazTienda {

    Catalogo catalogo;
    String switchDefaultMessage;

    public InterfazLatino() {
        this.catalogo = InterfazTienda.catalogo;
        this.switchDefaultMessage = "Opcion no valida, intente de nuevo";
    }

    @Override
    public void mostrarInterfaz(Scanner sc, Promocion promo, Usuario user) {
        
        if (user.tienePromocion()) {
            System.out.println("-----------");
            System.out.println("Hoy los usuarios de " + user.getPais() + " cuentan con promocion del "
                    + promo.getDescuento() + "% en productos de " + promo.getDepartamento());
            System.out.println("-----------");
        }

        System.out.println("Elige una opcion: ");
        System.out.println("1 - Mostrar catalogo");
        System.out.println("2 - Realizar una compra");
        System.out.println("3 - Salir de la sesion");


    }

    @Override
    public void mostrarCatalogo() {

        Iterator<Producto> iterator = catalogo.getIterador();
        Producto prod;
        System.out.println("---Imprimiendo todos los productos del catalogo---");
        // Imprimimos todos los productos del catalogo
        while (iterator.hasNext()) {
            prod = iterator.next();
            System.out.println(prod.toString());
        }
    }

    @Override
    public void salir(){
        System.out.println("Cerrando la sesion...");
    }

    @Override
    public LinkedList<Producto> realizarCompra(Scanner sc, Promocion promo, Usuario user) {

        LinkedList<Producto> carrito = new LinkedList<>();
        String opcionProducto;
        String opcionCompra;
        boolean isFinished = false;
        while (!isFinished) {
            System.out.println("Eliga una de las siguientes opciones: ");
            System.out.println("1 - Elegir un producto");
            System.out.println("2 - Cancelar compra");
            System.out.println("3 - Pagar");
            opcionCompra = sc.nextLine();
            switch (opcionCompra) {
                case "1":
                    mostrarCatalogo();
                    System.out.println("Seleccione el codigo de barras del producto que desea: ");
                    opcionProducto = sc.nextLine();
                    Producto prod = catalogo.getProducto(opcionProducto);
                    if (prod == null) {
                        System.out.println("Producto no encontrado, intente de nuevo");
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
                    System.out.println("Opcion no valida, intente de nuevo");
            }
        }

        return carrito;

    }

    @Override
    public void compraSegura(Scanner sc, Promocion promo, Usuario user, LinkedList<Producto> carrito) {

        if(carrito.size() == 0){
            System.out.println("El carrito esta vacio");
            return;
        }

        System.out.println("-----");
        System.out.println("Iniciando compra segura");
        System.out.println("-----");
        System.out.println("Ingresa tu cuenta bancaria registrada para terminar la compra: ");
        String cuenta = sc.nextLine();
        if(cuenta.equals(user.getCuentaBanco())){
            System.out.println("Transaccion exitosa, generando ticket");
            promo.generarTicket(carrito, user.tienePromocion());
            System.out.println("Fecha de entrega a " + user.getDireccion() + ": 12/12/2022");
        }else{
            System.out.println("Transaccion rechazada, compra no exitosa");
        }
    }

    @Override
    public String defaultMessage(){
        return this.switchDefaultMessage;
    }
}
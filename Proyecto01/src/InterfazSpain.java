import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


class InterfazSpain implements InterfazTienda {

    Catalogo catalogo;
    String switchDefaultMessage;

    public InterfazSpain() {
        this.catalogo = InterfazTienda.catalogo;
        this.switchDefaultMessage = "Ostia tio, opcion invalida, intentad de nuevo";
    }

    @Override
    public void mostrarInterfaz(Scanner sc, Promocion promo, Usuario user) {
        
        if (user.tienePromocion()) {
            System.out.println("--------------------------------------------");
            System.out.println("**PASAOS A LA FLIPANTE TIENDA DE CHEEMSMART**");
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
            System.out.println("Hoy los usuarios de " + user.getPais() + " cuentan con promocion del "
                    + promo.getDescuento() + "% en productos de " + promo.getDepartamento());
            System.out.println("--------------------------------------------");
        }

        System.out.println("Elige una opcion tio: ");
        System.out.println("1 - Observad el catalogo");
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
        System.out.println("Cerrando la sesion onda vital...");
    }

    @Override
    public LinkedList<Producto> realizarCompra(Scanner sc, Promocion promo, Usuario user) {

        LinkedList<Producto> carrito = new LinkedList<>();
        String opcionProducto;
        String opcionCompra;
        boolean isFinished = false;
        while (!isFinished) {
            System.out.println("Elegid una de las siguientes opciones: ");
            System.out.println("1 - Elegir un producto");
            System.out.println("2 - Salir sin terminar compra tio");
            System.out.println("3 - Terminar compra tio");
            opcionCompra = sc.nextLine();
            switch (opcionCompra) {
                case "1":
                    mostrarCatalogo();
                    System.out.println("Seleccionad el codigo de barras del producto que desea: ");
                    opcionProducto = sc.nextLine();
                    Producto prod = catalogo.getProducto(opcionProducto);
                    if (prod == null) {
                        System.out.println("Ostia, producto no encontrado, intenta de nuevo");
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
                    System.out.println("Ostia, opcion no valida, intente de nuevo");
            }
        }

        return carrito;

    }

    @Override
    public void compraSegura(Scanner sc, Promocion promo, Usuario user, LinkedList<Producto> carrito) {

        if(carrito.size() == 0){
            System.out.println("Pero tio, no has comprado nada");
            return;
        }
        System.out.println("-----");
        System.out.println("Nuestra compra segura si que flipa, inicando");
        System.out.println("-----");
        System.out.println(user.getNombre() + ", ingresa tu cuenta bancaria registrada para terminad la compra tio: ");
        String cuenta = sc.nextLine();
        if(cuenta.equals(user.getCuentaBanco())){
            System.out.println("Transaccion a todo gas, generando ticket");
            promo.generarTicket(carrito, user.tienePromocion());
            System.out.println("Fecha de entrega a todo gas a " + user.getDireccion() + ": 12/12/2022");
        }else{
            System.out.println("La transaccion flipo tio, compra no exitosa");
        }
    }

    @Override
    public String defaultMessage(){
        return this.switchDefaultMessage;
    }
}

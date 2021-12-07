import java.util.LinkedList;
import java.util.Scanner;
public interface InterfazTienda {

    /**
     * Muestra las opciones disponibles de la interfaz
     * @return true si el usuario a cerrado sesion
     */
    public void mostrarInterfaz(Scanner sc, Promocion promo, Usuario user);

    // Ya que todas las interfaces tienen el mismo catalogo, podemos definirlo en la interfaz
    Catalogo catalogo = new Catalogo();
    /**
     * Método para mostrar el catalogo en diversos idiomas
     */
    public void mostrarCatalogo();

    /**
     * Metodo para que el usuario pueda agregar productos al carrito y realizar su compra
     * @param sc El scanner que para tomar el input del usuario
     * @param promo La promocion del usuario
     * @param user El usuario que esta realizando la compra
     * @return Una lista que contiene los productos que compro el cliente, si la compra se
     * cancelo, regresa una lista vacia
     */
    public LinkedList<Producto> realizarCompra(Scanner sc, Promocion promo, Usuario user);

    /**
     * Sale de la sesion actual del usuario e imprime un mensaje
     */
    public void salir();

    /**
     * Metodo para comprobar que la cuenta bancaria del cliente sea segura e imprimir el ticket si
     * la transaccion es correcta
     * @param sc Scanner para obtener la cuenta del cliente
     * @param promo El gestor de promociones para imprimir el ticket
     * @param user El usuario que realiza la compra
     * @param carrito La lista con los productos que el cliente desea comprar
     */
    public void compraSegura(Scanner sc, Promocion promo, Usuario user, LinkedList<Producto> carrito);

    /**
     * @return Un string indicando que la opcion no es valida en el switch
     */
    public String defaultMessage();

}

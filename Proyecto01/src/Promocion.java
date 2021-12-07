// Clase donde se manejan las promociones de acuerdo al departamento dado
import java.util.LinkedList;
import java.util.Random;

class Promocion implements Subject{

    // La lista de clientes del pais correspondiente que se crea en la clase TiendaCheems
    private LinkedList<MyObserver> observers;
    // Un string que nos permite definir para que departamento damos las promociones
    private String departamentoPromocion;
    // Porcentaje de descuento que se va a aplicar, es elegido al azar
    private double descuento;

    public Promocion(String departamento){
        this.observers = new LinkedList<MyObserver>();
        this.departamentoPromocion = departamento;
        this.descuento = new Random().nextDouble();
    }

    @Override
    public void notifyObservers(){
        for(MyObserver o : observers){
            o.update();
        }
    }

    @Override
    public void registerObserver(MyObserver o){
        this.observers.add(o);
    }

    @Override
    public void removeObserver(MyObserver o){
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    /**
     * Metodo para generar el ticket de compra aplicando el descuento a los productos correspondientes
     * @param productos Lista ligada con los productos que el cliente quiere comprar
     * @param isPromoAvailable Un booleano que nos dice si el cliente cuenta con una promocion
     */
    public void generarTicket(LinkedList<Producto> productos, boolean isPromoAvailable){
        double suma = 0;
        System.out.println("-----------");
        System.out.println("Ticket");
        System.out.println("-----------");
        if(!isPromoAvailable){
            for(Producto prod : productos){
                System.out.println(prod.getNombre() + " $" + prod.getPrecio());
                suma += prod.getPrecio();
            }
            System.out.println("TOTAL: " + suma);
            return;
        }

        for(Producto prod : productos){
            System.out.println(prod.getNombre() + " $" + aplicarPromocion(prod));
            suma += getPrecioConPromo(prod);
        }
    }

    /**
     * Metodo que aplica la promocion correspondiente a un articulo
     * @param prod El producto al que se decidira si se le aplica promocion
     * @return El precio del producto despues de la promocion. (El precio original si no hay descuentos disponibles)
     */
    public String aplicarPromocion(Producto prod){
        if(prod.getDepartamento().equals(departamentoPromocion)){
            return prod.getPrecio() + " * " + (1-descuento) + " = " + (prod.getPrecio()*(1-descuento));
        }
        return prod.getPrecio() + "";
    }

    /**
     * Metodo para obtener el precio como un double despues de aplicar la promocion
     * @param prod El producto a obtener el precio
     * @return Un double con el precio del producto despues de aplicar la promocion
     */
    public double getPrecioConPromo(Producto prod){
        if(prod.getDepartamento().equals(departamentoPromocion)){
            return prod.getPrecio() * (1-descuento);
        }

        return prod.getPrecio();
    }

    public String getDepartamento(){
        return this.departamentoPromocion;
    }

    public double getDescuento(){
        return this.descuento * 100;
    }

}
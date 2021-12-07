// Clase donde se manejan las promociones al publico mexicano
import java.util.LinkedList;
import java.util.Random;

class Promocion implements Subject{

    // La lista de clientes mexicanos
    private LinkedList<MyObserver> observers;
    // Un string que nos permite definir para que departamento damos las promociones
    private String departamentoPromocion;
    // Porcentaje de descuento que se va a aplicar
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

    public double getPrecioConPromo(Producto prod){
        return prod.getPrecio() * (1-descuento);
    }

    public String getDepartamento(){
        return this.departamentoPromocion;
    }

    public double getDescuento(){
        return this.descuento * 100;
    }

}
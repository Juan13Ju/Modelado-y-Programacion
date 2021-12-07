public interface Subject{

    /**
     * Agregamos un observador a la lista de observadores del sujeto
     * @param o El observador a agregar
     */
    public void registerObserver(MyObserver o);
    /**
     * Removemos un observador de la lista de observadores del sujeto
     * @param o El observador a remover
     */
    public void removeObserver(MyObserver o);
    /**
     * Notificamos a todos los observadores para actualizarlos
     */
    public void notifyObservers();
}
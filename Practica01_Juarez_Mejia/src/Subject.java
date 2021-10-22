interface Subject{

    

    public void registerObserver(MyObserver obs, int mesInicial, String plan);

    public void removeObserver(MyObserver obs);

    public void notifyObservers(int mesAcutal);
}
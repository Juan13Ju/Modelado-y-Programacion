interface MyObserver{

    public void update(String recomendacion, Servicio ser, int mesActual) throws NotEnoughMoneyException;
}
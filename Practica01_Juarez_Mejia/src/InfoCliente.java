class InfoCliente{

    /**
     * El plan actual del cliente
     */
    String plan;
    /**
     * El mes en el que el cliente se suscribio (Relevante para los servicios que cambian despues de cierto tiempo)
     */
    int mesInicial;

    /**
     * Los meses que el cliente ha estado suscrito al servicio
     */
    int mesesSuscritos;

    
    /**
     * Un objeto con informacion importante del cliente
     * @param plan El plan que tiene actualmente el cliente
     * @param mesInicial El mes en el que comenzo el cliente
     */
    public InfoCliente(String plan, int mesInicial){

        this.plan = plan;
        this.mesInicial = mesInicial;
        this.mesesSuscritos = 1;
    }

    public InfoCliente newMonth(){

        this.mesesSuscritos++;
        return this;
    }

    public InfoCliente newSubscription(String sub){

        this.plan = sub;
        return this;
    }

}
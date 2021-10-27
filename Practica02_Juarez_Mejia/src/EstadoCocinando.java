class EstadoCocinando implements EstadoRobot{

    Robot robot;

    public EstadoCocinando(Robot robot){

        this.robot = robot;
    }

    @Override
    public void activar(){

        System.out.println("El robot ya esta activo y cocinando");
        System.out.println("   .--,--.");
        System.out.println("   `.  ,.'");
        System.out.println("    |___|");
        System.out.println("  |-:o o:-|   Si no son enchiladas");
        System.out.println("   _`~^~'_          joven");
        System.out.println(" |'   ^   `|");
    }

    @Override
    public void caminar(){
        System.out.println("El robot no puede caminar mientras cocina");
        System.out.println("   .--,--.");
        System.out.println("   `.  ,.'");
        System.out.println("    |___|");
        System.out.println("  |-:o o:-|  ¿Acaso quieres que te");
        System.out.println("   _`~^~'_    queme con el aceite?");
        System.out.println(" |'   ^   `|");
    }

    @Override
    public void atender(){

        System.out.println("La orden ya ha sido recibida, presione cocinar para empezar el proceso de cocina");
        System.out.println("      |_|");
	    System.out.println("     (* *)    En seguida le traemos ");
	    System.out.println("    __) (__       su Mcburger ");
	    System.out.println("   ( )...( )(_)");
	    System.out.println("   || |_| ||//");
	    System.out.println(">==() | | ()/");
	    System.out.println("    _(___)_");
	    System.out.println("   [-]   [-]");
    }

    @Override
    public void cocinar(){

        System.out.println("Comenzando a cocinar su hamburguesa");
        robot.cocinar(robot.orden);
        robot.setState(robot.getEstadoSuspendido());
    }

    @Override
    public void suspender(){

        System.out.println("El robot no se puede suspender mientras cocina");
    }
}

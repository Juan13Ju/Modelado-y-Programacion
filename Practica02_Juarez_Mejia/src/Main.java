import java.util.Scanner;

class Main{

    public static void main(String[] args){

        Robot robot = new Robot();

        String opcion = "1";

        Scanner sc = new Scanner(System.in);

        while(!opcion.equals("0")){

            System.out.println("----Menu de robot----");
            System.out.println(
                " 1- activar \n 2-caminar \n 3-atender \n 4-cocinar \n 5-suspender \n 0-salir" 
            );

            opcion = sc.nextLine();

            switch(opcion){

                case "1":
                robot.activar();
                break;
                case "2": 
                robot.caminar();
                break;
                case "3":
                robot.atender();
                break;
                case "4":
                robot.cocinar();
                break;
                case "5":
                robot.suspender();
                break;
                case "0":
                System.out.println("Vuelva pronto");
                break;
                default:
                System.out.println("Opcion no valida");
            }
        }

        sc.close();
    }
}
import java.util.HashMap;
import java.util.LinkedList;

class Main{


    public static void main(String[] args){

        LinkedList<Servicio> listaServicios = new LinkedList<Servicio>();

        Servicio memeflix;
        Servicio momazon;
        Servicio twitsh;
        Servicio thisney;
        Servicio hvomax;

        // Los planes de Memeflix
        HashMap<String, Integer> planMeme = new HashMap<>();
        planMeme.put("1", 100);
        planMeme.put("2", 150);
        planMeme.put("4", 180);

        // Los planes de Momazon
        HashMap<String, Integer> planMomazon = new HashMap<>();
        planMomazon.put("normal", 120);
        planMomazon.put("premium", 160);

        // Los planes de Twitsh
        HashMap<String, Integer> planTwitsh = new HashMap<>();
        planTwitsh.put("normal", 60);
        planTwitsh.put("premium", 90);

        HashMap<String, Integer> planThisney = new HashMap<>();
        planThisney.put("inicial", 130);

        // Planes de Hvo
        HashMap<String, Integer> planHvo = new HashMap<>();
        planHvo.put("unico", 130);

        memeflix = new Memeflix(new String[]{"halloween", "el juego de calamardo", "estranyer tics"}, planMeme);
        momazon = new Momazon(new String[] {"forrest gump", "the boys", "justicia league"}, planMomazon);
        twitsh = new Twitsh(new String[] {"Drossito", "Te lo resumo asi nomas", "la zona cero", "rubius"}, planTwitsh);
        thisney = new Thisney(new String[] {"Blanca nueves", "Abengers", "toy story", "los simp-sons", "amandavision", "walliberto"}, planThisney);
        hvomax = new Hvomax(new String[] {"Game of tronos", "el jajas", "rick & martin", "el scooby doo pa pa", "ELMO-llete y sus amigos", "los luni tones"}, planHvo);
            
            
        listaServicios.add(memeflix);
        listaServicios.add(momazon);
        listaServicios.add(twitsh);
        listaServicios.add(thisney);
        listaServicios.add(hvomax);

        Cliente alicia;
        Cliente bob;
        Cliente cesar;
        Cliente diego;
        Cliente erika;

        alicia = new Cliente("alicia", 12000);
        bob = new Cliente("bob", 700);
        cesar = new Cliente("cesar", 5000);
        diego = new Cliente("diego", 7000);
        erika = new Cliente("erika", 10000);

        for(int i = 1; i <= 12; i++){

            System.out.println("---- MES NUMERO " + i + " ---- \n");

            // Con este switch controlamos que pasa en los meses de acuerdo a la simulacion
            switch(i){
                 case 1:

                 // Alicia
                 alicia.suscribirServicio(memeflix, "4");
                 alicia.suscribirServicio(momazon, "premium");
                 alicia.suscribirServicio(twitsh, "premium");
                 alicia.suscribirServicio(thisney, "inicial");
                 alicia.suscribirServicio(hvomax, "unico");

                 // Bob
                 bob.suscribirServicio(memeflix, "4");
                 bob.suscribirServicio(momazon, "premium");
                 bob.suscribirServicio(twitsh, "premium");
                 bob.suscribirServicio(thisney, "inicial");
                 bob.suscribirServicio(hvomax, "unico");

                 // Cesar
                 cesar.suscribirServicio(thisney, "inicial");
                 cesar.suscribirServicio(hvomax, "unico");

                 // Diego
                 diego.suscribirServicio(memeflix, "2");
                 diego.suscribirServicio(momazon, "premium");

                 // Erika
                 erika.suscribirServicio(memeflix, "4");
                 erika.suscribirServicio(twitsh, "normal");
                 erika.suscribirServicio(hvomax, "unico");
                 break;

                 case 2:
                 // Diego
                 diego.suscribirServicio(twitsh, "normal");
                 break;

                 case 3:
                 // Diego
                 diego.suscribirServicio(thisney, "inicial");
                 diego.quitarSuscripcion(memeflix);
                 break;

                 case 4: 
                 // Diego
                 diego.suscribirServicio(memeflix, "4");
                 break;
                 case 5: 
                 // Erika
                 erika.quitarSuscripcion(memeflix);
                 erika.suscribirServicio(momazon, "premium");
                 erika.changeSubscription(twitsh, "premium");
                 break;
                 case 8:
                 erika.quitarSuscripcion(twitsh);
                 erika.quitarSuscripcion(hvomax);
                 erika.quitarSuscripcion(momazon);
                 break;
                 case 9:
                 erika.suscribirServicio(thisney, "inicial");

            }

            for(Servicio ser : listaServicios){
                System.out.println("++++++++++\n " +ser.nombre + " \n++++++++++\n");
                ser.notifyObservers(i);
            }
        }
    }
}

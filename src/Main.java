import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int opcion2;
        boolean panElegido =false;
        Baguette baguette = new PanBlanco();
        int numJamon = 0;
        int numPepperoni = 0;
        int numJitomate = 0;
        int numCatsup = 0;
        int numCebolla = 0;
        int numLechuga = 0;
        int numMayonesa = 0;
        int numMostaza = 0;
        int numPollo = 0;
        System.out.println("Bienvenido a WaySub, vamos a preparar tu Baguette, primero selecciona el pan (ingresa el numero correspondiente):");
        do {
            System.out.println(
                    "\n1.- Pan Blanco\n" +
                            "2.- Pan Integral\n" +
                            "3.- Pan con ajo\n"
            );
            while (true) {
                try {
                    String opcionUsuario = sc.nextLine();
                    opcion = Integer.parseInt(opcionUsuario);
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println(
                            "\nSelecciona una opcion valida:" +
                                    "\n1.- Pan Blanco\n" +
                                    "2.- Pan Integral\n" +
                                    "3.- Pan con ajo\n"
                    );
                }
            }
            switch (opcion) {
                case 1:
                    baguette = new PanBlanco();
                    panElegido = true;
                    break;
                case 2:
                    baguette = new PanIntegral();
                    panElegido = true;
                    break;
                case 3:
                    baguette = new PanAjo();
                    panElegido = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(!panElegido);

        System.out.println("Ahora agreguemos los ingredientes de tu Baguette, puedes poner cuantos tu quieras y hasta 3 de cada uno.");
        do {
            System.out.println(
                    "\n1.- Jamon\n" +
                    "2.- Pepperoni\n" +
                    "3.- Pollo\n" +
                    "4.- Catsup\n" +
                    "5.- Cebolla\n" +
                    "6.- Jitomate\n" +
                    "7.- Lechuga\n" +
                    "8.- Mayonesa\n" +
                    "9.- Mostaza\n" +
                    "0.- Terminar\n"

            );
            while (true) {
                try {
                    String opcionUsuario2 = sc.nextLine();
                    opcion2 = Integer.parseInt(opcionUsuario2);
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println(
                            "Selecciona una opcion valida:"+
                            "\n1.- Jamon\n" +
                            "2.- Pepperoni\n" +
                            "3.- Pollo\n" +
                            "4.- Catsup\n" +
                            "5.- Cebolla\n" +
                            "6.- Jitomate\n" +
                            "7.- Lechuga\n" +
                            "8.- Mayonesa\n" +
                            "9.- Mostaza\n" +
                            "0.- Terminar\n"
                    );
                }
            }
            switch (opcion2) {
                case 1:
                    if(numJamon<3){
                        baguette = new Jamon(baguette);
                        System.out.println("Ingrediente agregado");
                        numJamon++;
                    }else{
                        System.out.println("Has colocado la cantidad maxima de ese ingrediente, no puedes agregar mas.");
                    }
                    break;
                case 2:
                    if(numPepperoni<3){
                        baguette = new Pepperoni(baguette);
                        System.out.println("Ingrediente agregado");
                        numPepperoni++;
                    }else{
                        System.out.println("Has colocado la cantidad maxima de ese ingrediente, no puedes agregar mas.");
                    }
                    break;
                case 3:
                    if(numPollo<3){
                        baguette = new Pollo(baguette);
                        System.out.println("Ingrediente agregado");
                        numPollo++;
                    }else{
                        System.out.println("Has colocado la cantidad maxima de ese ingrediente, no puedes agregar mas.");
                    }
                    break;
                case 4:
                    if(numCatsup<3){
                        baguette = new Catsup(baguette);
                        System.out.println("Ingrediente agregado");
                        numCatsup++;
                    }else{
                        System.out.println("Has colocado la cantidad maxima de ese ingrediente, no puedes agregar mas.");
                    }
                    break;
                case 5:
                    if(numCebolla<3){
                        baguette = new Cebolla(baguette);
                        System.out.println("Ingrediente agregado");
                        numCebolla++;
                    }else{
                        System.out.println("Has colocado la cantidad maxima de ese ingrediente, no puedes agregar mas.");
                    }
                    break;
                case 6:
                    if(numJitomate<3){
                        baguette = new Jitomate(baguette);
                        System.out.println("Ingrediente agregado");
                        numJitomate++;
                    }else{
                        System.out.println("Has colocado la cantidad maxima de ese ingrediente, no puedes agregar mas.");
                    }
                    break;
                case 7:
                    if(numLechuga<3){
                        baguette = new Lechuga(baguette);
                        System.out.println("Ingrediente agregado");
                        numLechuga++;
                    }else{
                        System.out.println("Has colocado la cantidad maxima de ese ingrediente, no puedes agregar mas.");
                    }
                    break;
                case 8:
                    if(numMayonesa<3){
                        baguette = new Mayonesa(baguette);
                        System.out.println("Ingrediente agregado");
                        numMayonesa++;
                    }else{
                        System.out.println("Has colocado la cantidad maxima de ese ingrediente, no puedes agregar mas.");
                    }
                    break;
                case 9:
                    if(numMostaza<3){
                        baguette = new Mostaza(baguette);
                        System.out.println("Ingrediente agregado");
                        numMostaza++;
                    }else{
                        System.out.println("Has colocado la cantidad maxima de ese ingrediente, no puedes agregar mas.");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion2!=0);

        System.out.println(
                "Tu ticket es\n"+
                "INGREDIENTES\n"+
                baguette.getDescripcion()+
                "\nPRECIO"+
                "\n$"+baguette.costo()
        );

    }
}
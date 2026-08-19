
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static  Scanner scn= new Scanner(System.in);
    private static Vehiculo automovil = new Automovil();
    private static  List<Vehiculo> listaVehiculos = new ArrayList<>();
    public void main(String[] args) {

        System.out.println("sistema de inventario consecionario de auto moviles");


        Vehiculo auto1 = new Automovil("ABC123",
                "Mazda",
                "3",
                2022,
                37800000,
                "Gasolina",
                4);
        Vehiculo moto1 = new Motocicleta("XYZ890",
                "Yamaha",
                "MT07",
                2023,
                28000000,
                689);
        Vehiculo camion1 = new CamionDeCarga("TRK456",
                "Chevrolet",
                "NHR", 2021,
                85000000,
                5.5);

        listaVehiculos.add(auto1);

        menuInico();



    }

    public static void menuInico(){
        System.out.println("menu de inicio:");
        System.out.println("ingrese la opcion a ejecutar:" +
                "\n1. ver inventario general." +
                "\n2. funcines de automovil." +
                "\n3. funciones de motocicleta." +
                "\n4. funciones de camion de carga." +
                "\n5. salir\n");

        int op= scn.nextInt();

        switch (op){
            case 1:

                break;
            case 2:
                menuAutomovil();
                break;
            case 3:
                menuMoto();
                break;
            case 4:
                menuCamion();
                break;
            case 5:
                System.exit(0);
                break;

            default:

                System.out.println("error opcion seleccionada no se encuetra habilidata");

                break;
        }



    }

    public static void menuAutomovil(){

        System.out.println("menu de automovil");

        System.out.println("ingrese la opcion a ejecutar:" +
                "\n1. ver inventario de Automoviles." +
                "\n2. Ingresar  automovil." +
                "\n3. Consulta por placa" +
                "\n4. clacular precio final automovil." +
                "\n5. salir\n");

        int op= scn.nextInt();

        System.out.println(listaVehiculos);

    }

    public static void menuMoto() {
        System.out.println("menu de motocicleta");
        System.out.println("ingrese la opcion a ejecutar:" +
                "\n1. ver inventario de Motocicletas." +
                "\n2. Ingresar motocicleta." +
                "\n3. Consulta por placa" +
                "\n4. calcular precio final motocicleta." +
                "\n5. salir\n");

        int op = scn.nextInt();
        System.out.println(listaVehiculos);
    }

    public static void menuCamion() {
        System.out.println("menu de camion");
        System.out.println("ingrese la opcion a ejecutar:" +
                "\n1. ver inventario de Camiones." +
                "\n2. Ingresar camion." +
                "\n3. Consulta por placa" +
                "\n4. calcular precio final camion." +
                "\n5. salir\n");

        int op = scn.nextInt();
        System.out.println(listaVehiculos);
    }
}
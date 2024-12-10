package menu.parcialpoo1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Servicio3 {
        private static Scanner scanner = new Scanner(System.in);
    public static void menuBebidas() {
        boolean exit = false;
        
        while (!exit){
            try{
                System.out.print("Ingrese el numero de la bebida que desea: ");
                System.out.println("\n1. Gaseosas");
                System.out.println("2. Jugos Naturales");
                System.out.println("3. Agua           ");
                System.out.println("4. Sodas           ");
                System.out.println("5. Salir             ");
                int choice = scanner.nextInt();
                
                switch (choice) {//Se implementa un switch para que llame a los diferentes metodos
                    case 1 -> System.out.println("Usted selecciono Gaseosas") ;
                    case 2 -> System.out.println("Usted selecciono jugos Naturales");
                    case 3 -> System.out.println("Usted selecciono Agua");
                    case 4 -> System.out.println("Usted selecciono Sodas");
                    case 5 -> exit = true;            
                    default -> System.out.println("Opcion no existente, ingrese otra vez");
                }
            } catch (InputMismatchException e) {
                System.out.println("Porfavor, solo números");//En caso que el usuario ingrese algo distinto a un numero
                scanner.next();
            }
        }

        System.out.println("Gracias por escogernos!");//Mensaje de salida
    }
}

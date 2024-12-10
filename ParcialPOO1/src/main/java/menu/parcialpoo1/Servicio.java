package menu.parcialpoo1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Servicio {
    private static Scanner scanner = new Scanner(System.in);
    public static void menuEntradas() {
        boolean exit = false;
        
        while (!exit){
            try{
                System.out.print("Ingrese el numero de la entrada que desea: ");
                System.out.println("\n1. Papas Francesas");
                System.out.println("2. Papas en casco");
                System.out.println("3. Fruta           ");
                System.out.println("4. Aros de Cebolla           ");
                System.out.println("5. Salir             ");
                int choice = scanner.nextInt();
                
                switch (choice) {//Se implementa un switch para que llame a los diferentes metodos
                    case 1 -> System.out.println("Usted selecciono papas francesas") ;
                    case 2 -> System.out.println("Usted selecciono papas en cascos");
                    case 3 -> System.out.println("Usted selecciono Fruta");
                    case 4 -> System.out.println("Usted selecciono aros de cebolla");
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

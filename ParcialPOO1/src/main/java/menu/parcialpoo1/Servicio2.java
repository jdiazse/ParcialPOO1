/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu.parcialpoo1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Servicio2 {
        private static Scanner scanner = new Scanner(System.in);
    public static void menuPlatosprincipales() {
        boolean exit = false;
        
        while (!exit){
            try{
                System.out.print("Ingrese el numero del plato que desea: ");
                System.out.println("\n1. Bandeja Paisa");
                System.out.println("2. Hamburguesa");
                System.out.println("3. Ensalada cesar           ");
                System.out.println("4. Arroz Teriyaki           ");
                System.out.println("5. Salir             ");
                int choice = scanner.nextInt();
                
                switch (choice) {//Se implementa un switch para que llame a los diferentes metodos
                    case 1 -> System.out.println("Usted selecciono papas Bandeja Paisa") ;
                    case 2 -> System.out.println("Usted selecciono papas en hamburguesa");
                    case 3 -> System.out.println("Usted selecciono ensalada cesar");
                    case 4 -> System.out.println("Usted selecciono aros de arroz teriyaki");
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

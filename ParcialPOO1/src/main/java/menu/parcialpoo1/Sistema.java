/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu.parcialpoo1;

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Sistema {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        
        while (!exit){
            try{
                //Menu
                System.out.println("\n----- m e n u -----");
                System.out.println("|1. Entradas          |");
                System.out.println("|2. Platos Principales|");
                System.out.println("|3. Bebidas           |");
                System.out.println("|4. Salir           |");
                System.out.println("\n---------------------");
                System.out.print("En que podemos ayudarlo hoy?");
                int choice = scanner.nextInt();
                
                switch (choice) {//Se implementa un switch para que llame a los diferentes metodos
                    case 1 -> Servicio.menuEntradas();
                    case 2 -> Servicio2.menuPlatosprincipales();
                    case 3 -> Servicio3.menuBebidas();
                    case 4 -> exit = true;
                    default -> System.out.println("Opcion no existente, ingrese otra vez");//Se prevee un error del usuario entonces se crea esto para informarle de su error
                }
            } catch (InputMismatchException e) {
                System.out.println("Porfavor, solo números");//En caso que el usuario ingrese algo distinto a un numero
                scanner.next();
            }
        }

        System.out.println("Gracias por escogernos!");//Mensaje de salida
    }
}

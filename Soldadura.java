/*
 * Diseñe un algoritmo que le permita ingresarlos niveles de automatización 
industrial
 */
package soldadura;

/**
 *
 * @author Grupo 2
 */
import java.util.Scanner;
public class Soldadura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner objeto=new Scanner (System.in);
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("INGENIERÍA AUTOMOTRIZ\n");
        System.out.println("SOLDADURA\n");
        
        System.out.println("1. Defina el nivel de campo:");
        String nivel1=objeto.nextLine();
        
        System.out.println("\n2. Defina el nivel de control PLC:");
        String nivel2=objeto.nextLine();
        
        System.out.println("\n3. Defina el nivel de supervisión:");
        String nivel3=objeto.nextLine();
        
        System.out.println("\n4. Defina el nivel MES:");
        String nivel4=objeto.nextLine();
        
        System.out.println("\n5. Defina el nivel ERP:");
        String nivel5=objeto.nextLine();
    }
    
}

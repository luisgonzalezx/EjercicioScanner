package ejercicioscanner;

import java.util.Scanner;
import java.util.Date;
public class EjercicioScanner {

  public static void main(String[] args) {
        
     String nombre;
     String apellido;
     int dni;
     int año_nacimiento;
     
     Scanner Leer  = new Scanner(System.in);
     
     System.out.println("Ingrese su nombre :  ");
     nombre = Leer.nextLine();
     System.out.println("Ingrese su apellido :  ");
     apellido = Leer.nextLine();
     System.out.println("Ingrese su numero de dni :  ");
     dni = Leer.nextInt();
     System.out.println("Ingrese el año de nacimiento :  ");
     año_nacimiento = Leer.nextInt();
     
     Date fecha = new Date();
     
     
     System.out.println(" ----------------------------------------------------------------" );
     System.out.println("datos del usuario :" + nombre  + apellido + dni + año_nacimiento + fecha );
     System.out.println("------------------------------------------------------------------" );
        
     

    }
    
}

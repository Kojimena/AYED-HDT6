
//imports
import java.util.Scanner;
import java.util.InputMismatchException; 

public class Vista {
    //propiedades private a usar
   private Scanner scan = new Scanner(System.in);
   private  int opcion;


    /**
    * 
    * @param mensaje
    */
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }

    /**
    * Despliega el menú de opciones para el usuario. Luego, recibe la opción elegida por el usuario y la devuelve.
    * @return La opción elegida por el usuario
    */
    public int menu(){
                mensaje("\n" +"¿Qué implementacion MAP desea utilizar?");
                System.out.println("1. HashMap");
                System.out.println("2. TreeMap ");
                System.out.println("3. LinkedHashMap");
                System.out.println("4. Salir del programa");

                System.out.print("Seleccion: ");
            try {
                opcion = scan.nextInt();
            
            } catch (InputMismatchException e) {
                mensaje("Porfavor, ingrese una opción válida");
                opcion = scan.nextInt();
            
            }
        
		scan.nextLine();
		return opcion;
    }

}
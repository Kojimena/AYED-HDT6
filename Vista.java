
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
        mensaje("\n" +"Que implementacion MAP desea utilizar?\n");
        mensaje("1. HashMap");
        mensaje("2. TreeMap ");
        mensaje("3. LinkedHashMap");
        mensaje("4. Salir del programa");

        mensaje("Seleccion: ");
        try {
            opcion = scan.nextInt();
            
        } catch (InputMismatchException e) {
            mensaje("Porfavor, ingrese una opcion valida");
            opcion = scan.nextInt();
        }
		scan.nextLine();
		return opcion;
    }

    /**
    * Despliega el menú de opciones para el usuario. Luego, recibe la opción elegida por el usuario y la devuelve.
    * @return La opción elegida por el usuario
    */
    public int menueleccion(){
        mensaje("\n" +"Que desea realizar?");
        mensaje("1. Agregar  un  producto a  la coleccion");
        mensaje("2. Mostrar la categoria del producto ");
        mensaje("3. Mostrar datos del producto (producto,  categoria  y  la  cantidad  de  cada  articulo)");
        mensaje("4. Mostrar datos del producto ordenados por tipo");
        mensaje("5. Mostrar el producto y la categoria de todo el inventario");
        mensaje("6. Mostrar el producto y la categoria existentes, ordenadas por tipo");
        mensaje("7. Salir");
        mensaje("Seleccion: ");
        try {
            opcion = scan.nextInt();
    
        } catch (InputMismatchException e) {
            mensaje("Porfavor, ingrese una opcion valida");
            opcion = scan.nextInt();
        }
    scan.nextLine();
    return opcion;
    }

    public String getProducto(){

        mensaje("\nIngrese el producto que desea agregar ");

        return scan.nextLine();
    }

    public String getCategory(){

        mensaje("\nIngrese el producto del que desea saber la categoría ");

        return scan.nextLine();
    }
}
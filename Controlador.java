/**
 * Esta es la clase principal del programa.
 * Contiene al metodo main
 * Universidad del Valle de Guatemala
 * @author: Jimena Hernandez
 * @version: 18-mar-22
 */
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class Controlador {
/**
* Main del programa.
**/ 
private static Vista vista = new Vista();
private static String nombreArchivo = "ListadoProducto.txt";  // NOMBRE DEL ARCHIVO CON LOS OPERANDOS
    public static void main(String[] args) {
        MapFactory factory = new MapFactory();
        Map datos; 
        Map collecion;
    
        int opcion;
        vista.mensaje("\n" +"Bienvenido a la tienda Online");
        opcion = vista.menu(); //se llama la opción
        datos = factory.getMAP(opcion);
        collecion = factory.getMAP(opcion);

        try {
            File archivo = new File("/Users/jime/Desktop/AYED-HT-6/ListadoProducto.txt");
            Scanner myReader = new Scanner(archivo);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] temp = data.split(" \\|\t");
                datos.put(temp[1],temp[0]);
        } myReader.close();
      }catch (Exception e) {
        System.out.println("Archivo no encontrado");
        e.printStackTrace();
    }
    /**
    * Ciclo mientras la opcion no sea 4 que es salir, sigue corriendo.
    **/

    while(opcion != 5){
        switch(opcion)
        {
            case 1: //HashMap
            vista.menueleccion();
            break;
            case 2: //TreeMap
            vista.menueleccion();
            break;
            case 3: //LinkedHashMap
            vista.menueleccion();
            break;
            case 4: //salida
            //salida del programa
            vista.mensaje("saliendo...");
            System.exit(0);
            break;
            //Se le avisa al usuario que no esta ingresando una opción correcta
            default: vista.mensaje("-Opcion invalida, porfavor ingrese una opción valida-");   break;
        }
        opcion = vista.menu();
    }
} 

}

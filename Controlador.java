/**
 * Esta es la clase principal del programa.
 * Contiene al metodo main
 * Universidad del Valle de Guatemala
 * @author: Jimena Hernandez
 * @version: 18-mar-22
 */
import java.util.Locale;
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
        Map colleccion;
    
        int opcion;
        int option;
        vista.mensaje("\n" +"Bienvenido a la tienda Online");
        opcion = vista.menu(); //se llama la opción
        datos = factory.getMAP(opcion);
        colleccion = factory.getMAP(opcion);
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
        option = vista.menueleccion();
    while(option != 8){
        switch(option)
        {
            case 1: //Aregar  un  producto a  la coleccion
                String p_agregado=vista.getProducto();
                if(datos.containsKey(p_agregado)){
                    if(!colleccion.containsKey(p_agregado)){
                        colleccion.put(p_agregado, 1);
                    }else{
                        int temporal = (int) colleccion.get(p_agregado);
                        temporal +=1;
                        colleccion.replace(p_agregado,colleccion.get(p_agregado),temporal);
                    }

                    vista.mensaje("Producto agregado con exito!");
                }else{
                    vista.mensaje("Producto no disponible");
                }

                break;
            case 2: //Mostrar la categoria del producto
                String category= vista.getCategory();
                String firstLetter = category.substring(0, 1);
                String remainingLetters = category.substring(1, category.length());
                // change the first letter to uppercase
                firstLetter = firstLetter.toUpperCase();

                // join the two substrings
                category = firstLetter + remainingLetters; //fuente: https://www.programiz.com/java-programming/examples/capitalize-first-character-of-string
                if(datos.containsKey(category)){

                    System.out.print("\n " + category + " se encuentra en la categoría: " + datos.get(category)+"\n");
                }else{
                    System.out.print("Producto no disponible");
                }
                break;
            case 3: //Mostrar datos del producto (producto,  categoria  y  la  cantidad  de  cada  articulo)
                break;
            case 4: //Mostrar datos del producto ordenados por tipo
                break;
            case 5: //Mostrar el producto y la categoria de todo el inventario
                System.out.printf( "%-20s %20s %n", "Categoría", "Nombre del Producto");
                Object[] lista = datos.entrySet().toArray();
                for (Object o : lista) {
                    String temp = o.toString();
                    String[] separator = temp.split("=");
                    System.out.printf("%-20s %20s %n", separator[1], separator[0]);
                }
                break;
            case 6:
                break;
            case 7:
                //salida del programa
                vista.mensaje("saliendo...");
                System.exit(0);
                break;
            //Se le avisa al usuario que no esta ingresando una opción correcta
            default: vista.mensaje("-Opcion invalida, porfavor ingrese una opción valida-");   break;
        }
        option = vista.menueleccion();
    }
} 

}

/**
 * Esta es la clase principal del programa.
 * Contiene al metodo main
 * Universidad del Valle de Guatemala
 * @author: Jimena Hernandez
 * @version: 18-mar-22
 */
public class Controlador {
/**
* Main del programa.
**/ 
private static Vista vista = new Vista();
public static void main(String[] args) {
    int opcion;
    vista.mensaje("\n" +"Bienvenido a la tienda Online");
    opcion = vista.menu(); //se llama la opción

    /**
    * Ciclo mientras la opcion no sea 4 que es salir, sigue corriendo.
    **/

    while(opcion != 5){
        switch(opcion)
        {
            case 1: //HashMap
            break;
            case 2: //TreeMap
            break;
            case 3: //LinkedHashMap
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

import Maps.*;

public class Factory<K,V> {
        /**
     * @param option El tipo de estructura de datos a utilizar con los maps
     * @return La opcion elegida.
     */
    public Map getMap(int option) {
        switch (option) {
            case 1:
            return new HashMap<K,V>();

            case 2:
            return new TreeMap<K, V>();

            case 3:
            return new LinkedHashMap<K, V>();
        }
        return null;
    }
}

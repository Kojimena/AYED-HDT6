import Maps.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapFactory {
  
    public Map getMAP(int entry) {
      switch (entry) {
        //regresa un HashMap
        case 1: 
          return new Hash();
  
        //regresa un TreeMap
        case 2 :
          return new Tree();
      
        //regresa un LinkedHashMap
        case 3: 
          return new LinkedHash();

        default:
        return null;
        
      }
    }

  }

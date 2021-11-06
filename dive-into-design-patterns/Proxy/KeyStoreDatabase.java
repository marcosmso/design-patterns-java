package Proxy;

import java.util.HashMap;

public class KeyStoreDatabase implements IDatabase{
  
  HashMap <Integer, String> map = new HashMap <Integer, String>();
  
  KeyStoreDatabase(){
    for (int i = 0; i < 10; i++){
      map.put(i, Integer.toString(i + 1000)); 
    }
  }

  public String getValue(int key) {
    if (map.containsKey(key)){
      return map.get(key);
    }
    return "Not Found"; 
  }

}

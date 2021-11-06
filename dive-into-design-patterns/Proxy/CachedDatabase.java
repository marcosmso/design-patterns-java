package Proxy;

import java.util.HashMap;

public class CachedDatabase implements IDatabase{

  IDatabase database;
  HashMap <Integer, String> cache = new HashMap <Integer, String>();

  public CachedDatabase(IDatabase database){
    this.database = database;
  }

  public String getValue(int key) {
    if (cache.containsKey(key)){
      System.out.println("Came from cache:");
      return cache.get(key);
    }

    System.out.println("Came from Database:");
    String value = database.getValue(key);
    
    if (value != "Not Found"){
      cache.put(key, value);
    }
    
    return value;
  }

  public static void main(String[] args){
    IDatabase cacheProxy = new CachedDatabase(new KeyStoreDatabase());
    System.out.println(cacheProxy.getValue(1));
    System.out.println(cacheProxy.getValue(2));
    System.out.println(cacheProxy.getValue(3));
    System.out.println(cacheProxy.getValue(1));
    
  }
  
}

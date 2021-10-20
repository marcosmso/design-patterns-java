public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    // synchronized can be expensive, consider to avoid 
    // a lazy instanciation of the class
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    
}
